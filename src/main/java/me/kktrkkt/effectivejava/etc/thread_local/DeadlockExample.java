package me.kktrkkt.effectivejava.etc.thread_local;

/*
    Thread-1은 resource1을 잠그고, 잠시 후에 resource2를 잠그려고 합니다.
    Thread-2는 resource2를 잠그고, 잠시 후에 resource1을 잠그려고 합니다.
    Thread-1은 resource2가 Thread-2에 의해 잠겨 있어서 기다려야 하고, 동시에 Thread-2는 resource1이 Thread-1에 의해 잠겨 있어서 기다려야 합니다.
    이 상황에서 두 스레드는 서로의 자원을 기다리며 무한정 대기 상태에 빠집니다. 이것이 교착상태입니다.
 */
public class DeadlockExample {
    static class Resource {
        private final String name;

        Resource(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        final Resource resource1 = new Resource("Resource1");
        final Resource resource2 = new Resource("Resource2");

        Runnable task1 = () -> {
            synchronized (resource1) {
                System.out.println("Task1 locked " + resource1.getName());
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Task1 locked " + resource2.getName());
                }
            }
        };

        Runnable task2 = () -> {
            synchronized (resource2) {
                System.out.println("Task2 locked " + resource2.getName());
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (resource1) {
                    System.out.println("Task2 locked " + resource1.getName());
                }
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
