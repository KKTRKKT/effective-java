package me.kktrkkt.effectivejava._10_equals.transitivity;


// 클래스를 상속받고 필드를 추가할 경우 equals의 추이성 또는 대칭성을 지킬 수 없게 된다.
public class BadColorPoint extends Point{

    final String color;

    public BadColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BadColorPoint) {
            return ((BadColorPoint) obj).x == x && ((BadColorPoint) obj).y == y && ((BadColorPoint) obj).color.equals(color);
        }
        if (obj instanceof Point) {
            return ((Point) obj).x == x && ((Point) obj).y == y;
        }
        return false;
    }

    public static void main(String[] args) {
        BadColorPoint blue = new BadColorPoint(1, 2, "blue");
        Point point = new Point(1, 2);
        BadColorPoint red = new BadColorPoint(1, 2, "red");

        System.out.println(blue.equals(point));
        System.out.println(point.equals(red));
        System.out.println(blue.equals(red));
    }
}
