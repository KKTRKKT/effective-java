package me.kktrkkt.effectivejava._11_hashcode.why_keep_hashcode_rule;

import java.util.HashMap;

// hashcode가 없으면 Value 객체를 키로 넣었을 때 값을 제대로 찾을 수 없다.
public class NoHashPoint {

    private final int x;

    private final int y;

    public NoHashPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (obj instanceof NoHashPoint obj1) {
            return obj1.x == x && obj1.y == y;
        }

        return false;
    }

    public static void main(String[] args) {
        final HashMap<NoHashPoint, String> hashMap = new HashMap<>();
        hashMap.put(new NoHashPoint(1, 2), "p1");

        // 해시코드를 구현하면 p1이 나오지만 해시코드가 없어 각각 다른 해시코드를 반환하기 때문에 해시테이블에 각각 저장된다.
        System.out.println(hashMap.get(new NoHashPoint(1, 2)));
    }
}
