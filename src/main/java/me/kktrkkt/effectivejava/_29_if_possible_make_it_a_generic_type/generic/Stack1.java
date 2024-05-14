package me.kktrkkt.effectivejava._29_if_possible_make_it_a_generic_type.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

// 제네릭 배열을 선언한 형태
// 제네릭은 소거법을 이용하므로 java5 버전과도 호환된다
// 배열이 외부에 노출되지 않도록 주의가 필요, 노출될 경우 배열이 오염될 수 있다. 오염이란 제네릭 타입이 아닌 다른 타입이 들어가는 것
// 가장 많이 씀
public class Stack1<T> {
    private T[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack1() {
        this.elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
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
        T element = this.elements[--size];
        this.elements[size] = null;
        return element;
    }

    private void ensureCapacity() {
        if(this.elements.length == size){
            this.elements = Arrays.copyOf(this.elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        // raw 타입으로 작성된 코드도 작동됨
        Stack1 rawStack = new Stack1();
        rawStack.push("a");
        rawStack.push("b");
        rawStack.push("c");
        System.out.println((String)rawStack.pop());

        Stack1<String> stack = new Stack1<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.pop());
    }

}
