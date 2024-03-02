package me.kktrkkt.effectivejava._11_hashcode.why_keep_hashcode_rule;

import java.util.HashMap;

// hashcode가 똑같으면 값은 잘찾을 수 있지만 해시테이블의 성능이 굉장히 떨어져 O(n) 성능의 이점을 얻을 수 없다.
public class FixHashPoint {

    private final int x;

    private final int y;

    public FixHashPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (obj instanceof FixHashPoint obj1) {
            return obj1.x == x && obj1.y == y;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String[] args) {
        final HashMap<FixHashPoint, String> hashMap = new HashMap<>();
        hashMap.put(new FixHashPoint(1, 2), "p1");

        // p1은 나오지만 해시 충돌이 일어나 해시 버킷에 링크드 리스트가 생기고 값을 찾기 위해 순회하며 값을 비교하는 연산이 추가되기 때문에 비교적 성능이 매우 떨어진다
        System.out.println(hashMap.get(new FixHashPoint(1, 2)));
    }
}
