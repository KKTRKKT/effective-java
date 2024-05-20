package me.kktrkkt.effectivejava._31_increase_api_flexibility_using_qualified_wildcards._02_after;

import java.util.*;

// 한정적 와일드카드 타입을 이용해 pushAll popAll 메소드를 구현한 클래스
// pushAll은 ? extends T를 통해 하위 타입을 허용
// popAll은 ? super T를 통해 상위 타입을 허용
public class Stack<T> {
    private T[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
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

    public void pushAll(Iterable<? extends T> iterable) {
        for (T t : iterable) {
            push(t);
        }
    }

    public void popAll(Collection<? super T> collection) {
        while(!collection.isEmpty()) {
            collection.add(pop());
        }
    }

    private void ensureCapacity() {
        if(this.elements.length == size){
            this.elements = Arrays.copyOf(this.elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        List<Integer> list = List.of(1, 2, 3);
        stack.pushAll(list);
        List<Object> objects = new ArrayList<>();
        stack.popAll(objects);
    }

}
