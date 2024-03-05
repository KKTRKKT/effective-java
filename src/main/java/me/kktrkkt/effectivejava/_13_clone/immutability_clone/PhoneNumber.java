package me.kktrkkt.effectivejava._13_clone.immutability_clone;

import lombok.EqualsAndHashCode;

// 불변 객체에서 clone을 재정의 하기 위해서는 Cloneable 인터페이스를 구현하고 super.clone()을 이용해 clone 함수를 재정의한다.
@EqualsAndHashCode
public class PhoneNumber implements Cloneable{

    private final short areaCode, prefix, lineNum;

    private static short rangeCheck(int val, int max, String arg) {
        if(val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 9999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
    }

    // 접근제어자는 더 넓은 방향으로 오버라이딩이 가능하다.
    // 반환타입은 하위 타입으로 오버라이딩이 가능하다.
    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber(82, 1234, 5678);
        PhoneNumber p2 = p1.clone();
        // 무조건 true
        System.out.println(p1 != p2);
        // 무조건 true
        System.out.println(p1.getClass() ==  p2.getClass());
        // true 또는 false
        System.out.println(p1.equals(p2));
    }
}
