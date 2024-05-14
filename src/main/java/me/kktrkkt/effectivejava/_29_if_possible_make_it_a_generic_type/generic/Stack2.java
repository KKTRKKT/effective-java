package me.kktrkkt.effectivejava._29_if_possible_make_it_a_generic_type.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

// 외부 인터페이스 부분을 제네릭으로 감싼 형태
// Object 배열이므로 오염문제는 없지만, 배열에서 꺼낼때마다 타입 캐스팅이 필요해 번거로움
public class Stack2<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack2() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
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
        Stack2<String> stack = new Stack2<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.pop());
    }

}
