package me.kktrkkt.effectivejava._7_dereferencing_used_objects.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

// 배열을 통해 메모리를 관리할 때에는 객체를 다 사용한 후에는 null 처리를 통해 메모리 누수를 방지한다.
public class Stack {

    Object[] elements;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public Object pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        Object element = elements[--size];
        elements[size] = null;
        return element;
    }
}
