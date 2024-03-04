package me.kktrkkt.effectivejava._12_tostring;

import lombok.EqualsAndHashCode;

// 기본적인 toString은 클래스이름@해시코드 16진수 로 표시된다.
// toString은 간결하면서 사람이 읽기 쉬운 형태의 유익한 정보를 반환해야된다.
// toString 값을 정적 팩토리 메소드의 인자값으로 받아 생성하는것도 좋다
// toString의 값은 다보여주는게 권장되지만, 보안적인 이유로 안보여줘도 된다.
// toString의 값들은 조회할 수 있게 api를 제공하는게 좋다(getter.
@EqualsAndHashCode
public class PhoneNumber {

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

    private static PhoneNumber of(String phoneNumber) {
        if(!phoneNumber.matches("^\\d{3}-\\d{3,4}-\\d{4}$")){
            throw new IllegalArgumentException(phoneNumber);
        }
        String[] split = phoneNumber.split("-");
        return new PhoneNumber(
                Integer.parseInt(split[0]),
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]));
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNum() {
        return lineNum;
    }

    /**
     * 이 전화번호의 문자열 표현을 반환한다.
     * 이 문자열은 "XXX-YYYY-ZZZZ" 형태의 13글자로 구성된다.
     * XXX는 지역 코드, YYYY는 프리픽스, ZZZZ는 가입자 번호다.
     * 각각의 대문자는 10진수 숫자 하나를 나타낸다.
     *
     * 전화번호의 각 부분의 값이 너무 작아서 자릿수를 채울 수 없다면,
     * 앞에서부터 0으로 채워나간다. 예컨데 가입자 번호가 123이라면
     * 전화번호의 마지막 네자리수는 "0123"이 된다.
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d",
                areaCode, prefix, lineNum);
    }

    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber(82, 1234, 5678);
        System.out.println(p1);
        PhoneNumber p2 = PhoneNumber.of(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
