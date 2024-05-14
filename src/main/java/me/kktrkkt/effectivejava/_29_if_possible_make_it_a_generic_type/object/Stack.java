package me.kktrkkt.effectivejava._29_if_possible_make_it_a_generic_type.object;

import java.util.Arrays;
import java.util.EmptyStackException;

// 제네릭을 사용하지 않은 형태
// Object 배열이므로 꺼내서 사용할 때마다 타입 캐스팅을 해야하므로 타입 안정성이 낮음
public class Stack {

    private Object[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
        this.size = 0;
    }

    public void push(Object object) {
        ensureCapacity();
        this.elements[size++] = object;
    }

    public Object pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        Object element = this.elements[--size];
        this.elements[size] = null;
        return element;
    }

    private void ensureCapacity() {
        if(this.elements.length == size){
            this.elements = Arrays.copyOf(this.elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println((String) stack.pop());
    }

}
