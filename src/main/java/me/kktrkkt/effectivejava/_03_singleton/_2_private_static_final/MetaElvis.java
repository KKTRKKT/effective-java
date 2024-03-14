package me.kktrkkt.effectivejava._3_singleton._2_private_static_final;

// private static final로 선언하면 getInstance 메소드를 통해 인스턴스를 가져가게 된다.
// 장점 1. getInstance 내부를 싱글톤이 아니라 새로운 인스턴스를 생성하게 해도 클라이언트 코드에는 영향이 가지 않는다.
// 장점 2. 메소드에는 제네릭을 사용할 수 있으므로 인스턴스의 타입을 런타임에 결정할 수 있다.
// 장점 3. getInstance는 Supplier로 사용할 수 있다. Concert 참조
public class MetaElvis<T> implements Singer{

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    @SuppressWarnings("unchecked")
    public static <E> MetaElvis<E> getInstance() {
        return (MetaElvis<E>) INSTANCE;
    }

    public void say(T t){
        System.out.println(t);
    }

    @Override
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
