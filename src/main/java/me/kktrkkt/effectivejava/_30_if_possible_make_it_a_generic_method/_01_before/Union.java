package me.kktrkkt.effectivejava._30_if_possible_make_it_a_generic_method._01_before;

import java.util.EmptyStackException;
import java.util.Stack;

// 매개변수화 타입을 받지않는 정적 유틸리티 메소드
// 제네릭 메소드로 구현하지 않으면 클라이언트 코드에서 타입 캐스팅을 하는 번거로움 + 타입안정성이 낮음
public class Union {

    public static Stack union(Stack stack1, Stack stack2) {
        if(stack1 == null){
            throw new EmptyStackException();
        }
        stack1.addAll(stack2);
        return stack1;
    }

    public static void main(String[] args) {
        Stack ss1 = new Stack<>();
        ss1.add("1");
        ss1.add("2");
        Stack ss2 = new Stack<>();
        ss2.add("3");
        ss2.add("4");
        Stack ssu = union(ss1, ss2);
        for (Object s : ssu) {
            System.out.println((String) s);
        }

        Stack is1 = new Stack<>();
        is1.add(1);
        is1.add(2);
        Stack is2 = new Stack<>();
        is2.add(3);
        is2.add(4);
        Stack isu = union(is1, is2);
        for (Object i : isu) {
            System.out.println((Integer) i);
        }
    }

}
