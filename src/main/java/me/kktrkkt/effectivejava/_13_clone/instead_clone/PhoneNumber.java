package me.kktrkkt.effectivejava._13_clone.instead_clone;

import lombok.EqualsAndHashCode;

// 생성자에 자기 자신 타입을 받아서 요소들을 복사후 생성한다.
@EqualsAndHashCode
public class PhoneNumber {

    private final short areaCode, prefix, lineNum;

    private static short rangeCheck(int val, int max, String arg) {
        if(val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    public PhoneNumber(PhoneNumber phoneNumber){
        this(phoneNumber.areaCode, phoneNumber.prefix, phoneNumber.lineNum);
    }

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 9999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
    }
}
