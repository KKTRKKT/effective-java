package me.kktrkkt.effectivejava._30_if_possible_make_it_a_generic_method._02_after;

import java.util.EmptyStackException;
import java.util.Stack;

// 제네릭 메소드로 변환후 클라이언트 쪽에서 타입캐스팅을 하지 않아도 되고 타입 안정성이 높아짐
public class Union {

    private static <T> Stack<T> union(Stack<T> stack1, Stack<T> stack2) {
        if(stack1 == null){
            throw new EmptyStackException();
        }
        stack1.addAll(stack2);
        return stack1;
    }

    public static void main(String[] args) {
        Stack<String> ss1 = new Stack<>();
        ss1.add("1");
        ss1.add("2");
        Stack<String> ss2 = new Stack<>();
        ss2.add("3");
        ss2.add("4");
        Stack<String> ssu = union(ss1, ss2);
        ssu.forEach(System.out::println);

        Stack<Integer> is1 = new Stack<>();
        is1.add(1);
        is1.add(2);
        Stack<Integer> is2 = new Stack<>();
        is2.add(3);
        is2.add(4);
        Stack<Integer> isu = union(is1, is2);
        isu.forEach(System.out::println);
    }

}
