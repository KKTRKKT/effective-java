package me.kktrkkt.effectivejava._13_clone.variable_clone;

import java.util.Arrays;
import java.util.EmptyStackException;

// public 접근제어자와 반환 타입을 명시해주고 super.clone()까지는 불변객체 clone 과정과 같다.
// 배열은 clone을 통해 복제한다. 단, 배열의 요소는 얕은 복사가 된다. 깊은 복사가 필요하면 따로 구현이 필요
public class ShallowCopyStack implements Cloneable{

    Object[] elements;

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 16;

    public ShallowCopyStack() {
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

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public ShallowCopyStack clone(){
        try {
            ShallowCopyStack copy = (ShallowCopyStack) super.clone();
            copy.elements = this.elements.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        ShallowCopyStack stack = new ShallowCopyStack();
        stack.push("spring");
        stack.push("java");
        stack.push("effective");

        ShallowCopyStack copy = stack.clone();

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        while(!copy.isEmpty()){
            System.out.println(copy.pop());
        }

        System.out.println(stack.elements[0] == copy.elements[0]);
    }
}
