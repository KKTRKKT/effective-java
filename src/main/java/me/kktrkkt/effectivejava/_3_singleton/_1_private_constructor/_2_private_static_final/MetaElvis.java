package me.kktrkkt.effectivejava._3_singleton._1_private_constructor._1_private_static_final;

// getInsta
public class MetaElvis<T>{

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    @SuppressWarnings("unchecked")
    public <E> MetaElvis<E> getInstance() {
        return (MetaElvis<E>) INSTANCE;
    }

    public void say(T t){
        System.out.println(t);
    }

    public void sing() {
        System.out.println("I'll have a blue- Christmas without you~");
    }

    public static void main(String[] args) {
        MetaElvis<Integer> intElvis = MetaElvis.INSTANCE.getInstance();
        MetaElvis<String> strElvis = MetaElvis.INSTANCE.getInstance();
        intElvis.say(12);
        strElvis.say("hello");
    }
}
