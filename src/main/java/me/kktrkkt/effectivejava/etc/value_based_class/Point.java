package me.kktrkkt.effectivejava.etc.value_based_class;

// record 타입으로 선언하면 매개변수는 불변이 되고, 올바른 equals, hashCode, toString을 정의해준다.
public record Point(int x, int y) {

    public static void main(String[] args) {
        final Point p1 = new Point(0, 1);
        final Point p2 = new Point(0, 1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p1.toString());
    }
}
