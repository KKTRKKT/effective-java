package me.kktrkkt.effectivejava._20_use_interface_rather_than_abstract;

// 추상 골격 클래스
// 인스턴스 메소드는 AbstractCat에다 추가
// 그 외에 메소드는 Flyable에 추가
class MyCat extends AbstractCat implements Flyable{

    private final Flyable myFlyable = new MyFlyable();

    @Override
    protected String sound() {
        return "냐옹";
    }

    @Override
    protected String name() {
        return "냥냥이";
    }

    @Override
    public String fly() {
        return myFlyable.fly();
    }

    private class MyFlyable extends AbstractFlyable implements Flyable {
    }
}
