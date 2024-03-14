package me.kktrkkt.effectivejava._02_builder._4_hierarchical_builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/*
    서브 클래스에서 수퍼 클래스의 빌더를 사용하기 위해서 수퍼 클래스의 빌더는 메소드 체이닝시
    수퍼 클래스의 빌더가 아니라 서브 클래스의 빌더를 반환하도록 구현해야된다.

    서브 클래스의 빌더를 반환하기 위해서는 제네릭타입으로 수퍼 클래스의 빌더를 상속받는 빌더를 받아서 반환해줘야 하는데
    이때 T extends Builder<T> 부분을 시뮬레이트한 셀프 타입 관용구라고 한다.

    쉽게 이해하자면 서브클래스의 빌더를 어떻게 정의할건지 모양을 정해주는거라고 보면된다.
    Subclass.Builder extends SuperclassBuilder<Subclass.Builder> = T extends Builder<T>

    이후 수퍼 클래스의 메소드 체이닝 부분은 제네릭 타입(서브클래스의 빌더)을 반환하는데 필요한 self 메소드를 구현한다.
    self 메소드는 서브클래스의 빌더가 this를 반환하도록 구현하도록 한다.

    build 메소드는 서브클래스의 빌더가 서브클래스를 반환하게 구현하도록 한다.
 */
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    public Pizza(Builder<?> builder) {
        this.toppings = EnumSet.copyOf(builder.toppings);
    }

    abstract static class Builder<T extends Builder<T>>{

        private final Set<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }
}
