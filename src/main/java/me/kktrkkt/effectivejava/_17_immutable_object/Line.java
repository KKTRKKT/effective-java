package me.kktrkkt.effectivejava._17_immutable_object;

// 불변 객체 규칙
// 1. 설정 메소드 제거
// 2. 클래스의 확장을 막는다
// 3. 필드는 final로 선언
// 4. 필드는 private 일것
// 5. 내부의 가변객체는 외부에서 접근할 수 없도록 만든다.
public final class Line {

    private final String name;

    private final Point start;

    private final Point end;

    public Line(String name, Point start, Point end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public Point getStart() {
        return new Point(this.start.getX(), this.start.getY());
    }

    public Point getEnd() {
        return new Point(this.end.getX(), this.end.getY());
    }

    public static void main(String[] args) {
        Point start = new Point(0, 1);
        Point end = new Point(2, 2);
        Line line = new Line("line", start, end);

        Point lineStart = line.getStart();
        lineStart.setX(10);
        lineStart.setY(10);

        Point lineEnd = line.getEnd();
        lineEnd.setX(5);
        lineEnd.setY(5);

        String lineName = line.getName();
        lineName = "longLine";

        System.out.println(line);
    }

    @Override
    public String toString() {
        return "Line{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
