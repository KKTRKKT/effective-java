package me.kktrkkt.effectivejava._11_hashcode.best_practice;

// 전통적인 hashcode 구현 방법
// 1. result를 핵심 필드 하나의 hashCode값으로 초기화한다.
// 2. 나머지 핵심필드마다 result에 31을 곱하고 hashcode값을 더해서 반환한다.
// * hashcode 구하는 방법은 기본 타입은 Type.hashCode
// * 참조 타입은 hashCode
// * 배열은 Arrays.hashCode
public class TraditionalHashPoint {

    private final int x;

    private final int y;

    private final Data data;

    public TraditionalHashPoint(int x, int y, Data data) {
        this.x = x;
        this.y = y;
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (obj instanceof TraditionalHashPoint obj1) {
            return obj1.x == x && obj1.y == y && obj1.data.equals(data);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(x);
        result = 31 * result + Integer.hashCode(y);
        result = 31 * result + data.hashCode();
        return result;
    }
}
