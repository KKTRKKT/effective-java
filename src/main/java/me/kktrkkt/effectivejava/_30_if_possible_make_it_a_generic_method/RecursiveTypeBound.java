package me.kktrkkt.effectivejava._30_if_possible_make_it_a_generic_method;

import java.util.List;

// 재귀적 한정 타입
// 자기 자신이 들어간 표현식을 사용해 타입 매개변수의 허용 범위를 제한하는 방식
public class RecursiveTypeBound {

    private static <T extends Comparable<T>> T max(List<T> list) {
        if(list.isEmpty()){
            throw new IllegalArgumentException("컬렉션이 비어있습니다.");
        }
        T max = null;
        for (T t : list) {
            if(max == null || t.compareTo(max) > 0){
                max = t;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<String> sl = List.of("s2", "s3", "s1");
        System.out.println(max(sl));

        List<Integer> il = List.of(3, 1, 2);
        System.out.println(max(il));
    }

}
