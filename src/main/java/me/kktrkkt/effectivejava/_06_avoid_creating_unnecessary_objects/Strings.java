package me.kktrkkt.effectivejava._6_avoid_creating_unnecessary_objects;

// String은 기본적을 상수풀에 저장하기 때문에 같은 문자열이면 재사용한다.
public class Strings {

    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = new String("hello");
        String hello3 = "hello";

        System.out.println(hello1 == hello2);
        System.out.println(hello3 == hello1);
        System.out.println(hello1.equals(hello2));
    }
}
