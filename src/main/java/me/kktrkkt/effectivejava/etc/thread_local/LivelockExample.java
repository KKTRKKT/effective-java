package me.kktrkkt.effectivejava.etc.thread_local;
/*
    Thread-1이 resource1을 사용하려고 하지만 resource2가 사용 중인지 확인합니다.
    만약 resource2가 사용 중이면 resource1을 해제하고 잠시 대기합니다.
    Thread-2도 마찬가지로 resource2를 사용하려고 하지만 resource1이 사용 중인지 확인합니다.
    만약 resource1이 사용 중이면 resource2를 해제하고 잠시 대기합니다.
    두 스레드는 계속해서 자원을 양보하고 다시 시도하지만, 서로 양보하는 동안 진전을 이루지 못합니다. 이것이 라이브락입니다.
 */
public class LivelockExample {
    static class Resource {
        private final String name;
        private boolean inUse;

        Resource(String name) {
            this.name = name;
        }

        public synchronized void use() {
            while (inUse) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            inUse = true;
        }

        public synchronized void release() {
            inUse = false;
            notify();
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        final Resource resource1 = new Resource("Resource1");
        final Resource resource2 = new Resource("Resource2");

        Runnable task1 = () -> {
            while (true) {
                resource1.use();
                System.out.println("Task1 using " + resource1.getName());
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                if (!resource2.inUse) {
                    resource2.use();
                    System.out.println("Task1 using " + resource2.getName());
                    resource1.release();
                    resource2.release();
                    break;
                }

                resource1.release();
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
        };

        Runnable task2 = () -> {
            while (true) {
                resource2.use();
                System.out.println("Task2 using " + resource2.getName());
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                if (!resource1.inUse) {
                    resource1.use();
                    System.out.println("Task2 using " + resource1.getName());
                    resource2.release();
                    resource1.release();
                    break;
                }

                resource2.release();
                try { Thread.sleep(10); } catch (InterruptedException e) {}
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
