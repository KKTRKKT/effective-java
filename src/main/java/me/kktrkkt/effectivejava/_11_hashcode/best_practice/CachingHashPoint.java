package me.kktrkkt.effectivejava._11_hashcode.best_practice;

import java.util.Objects;

// 핵심필드가 모두 불변일때 사용할 수 있는 방법으로 hashcode를 캐싱해서 반환해준다.
public class CachingHashPoint {

    private final int x;

    private final int y;

    private final Data data;

    public CachingHashPoint(int x, int y, Data data) {
        this.x = x;
        this.y = y;
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (obj instanceof CachingHashPoint obj1) {
            return obj1.x == x && obj1.y == y && obj1.data.equals(data);
        }

        return false;
    }

    private int hashcode;

    @Override
    public int hashCode() {
        if(this.hashcode == 0) {
            this.hashcode = Objects.hash(x, y, data);
        }
        return this.hashcode;
    }
}
