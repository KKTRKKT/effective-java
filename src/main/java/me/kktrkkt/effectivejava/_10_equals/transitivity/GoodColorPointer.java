package me.kktrkkt.effectivejava._10_equals.transitivity;

// 필드를 추가할경우 컴포지션 방법으로 상속대신 필드로 선언해 equals에서 비교해준다.
public class GoodColorPointer {

    final Point point;

    final String color;

    public GoodColorPointer(Point point, String color) {
        this.point = point;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GoodColorPointer) {
            return ((GoodColorPointer) obj).point == point && ((GoodColorPointer) obj).color.equals(color);
        }
        return false;
    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        GoodColorPointer blue = new GoodColorPointer(point, "blue");
        GoodColorPointer red = new GoodColorPointer(point, "red");

        System.out.println(blue.equals(point));
        System.out.println(point.equals(blue));
        System.out.println(point.equals(red));
        System.out.println(red.equals(point));
        System.out.println(blue.equals(red));
        System.out.println(red.equals(blue));
    }
}
