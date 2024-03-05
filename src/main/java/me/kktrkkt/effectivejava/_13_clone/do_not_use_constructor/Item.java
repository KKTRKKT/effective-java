package me.kktrkkt.effectivejava._13_clone.do_not_use_constructor;

// clone은 생성자를 통해 생성하면 안된다.
// 상위 타입은 하위타입으로 타입캐스팅이 되지 않기 때문에 서브클래스에서 재정의하게 되면 오류가 발생하게된다.
public class Item implements Cloneable{

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public Item clone() {
        return new Item(name);
    }
}
