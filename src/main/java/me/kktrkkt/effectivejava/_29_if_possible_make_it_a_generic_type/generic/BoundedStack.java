package me.kktrkkt.effectivejava._29_if_possible_make_it_a_generic_type.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

// 타입 제한 제네릭을 사용할 경우 Stack1번 방법은 사용할 수 없다
// 제네릭은 <T>일떄 <T extends Object>가 생략된 형태이로 모든 T는 Object 타입으로 치환된다.
// 따라서 Number로 선언하면 this.elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];를 사용할 수 없다.
// 타입 제한 제네릭을 사용할 경우 Stack2 방법대로 원소를 꺼낸뒤 캐스팅해서 사용해야한다
public class BoundedStack<T extends Number> {
    private Number[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public BoundedStack() {
//        this.elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY]; // Object[]을 Number[] 타입으로 캐스팅하게 되므로 캐스팅 오류가 발생한다
        this.elements = new Number[DEFAULT_INITIAL_CAPACITY];
        this.size = 0;
    }

    public void push(T object) {
        ensureCapacity();
        this.elements[size++] = object;
    }

    public T pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        @SuppressWarnings("unchecked") T element = (T) this.elements[--size];
        this.elements[size] = null;
        return element;
    }

    private void ensureCapacity() {
        if(this.elements.length == size){
            this.elements = Arrays.copyOf(this.elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        BoundedStack<Integer> stack = new BoundedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
    }

}
