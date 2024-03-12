package me.kktrkkt.effectivejava.etc.treeset;

import me.kktrkkt.effectivejava._13_clone.immutability_clone.PhoneNumber;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// treeSet은 정렬된 set이다
// 정렬 기준은 자연적인 순서(natural order)에 따라 정렬한다
// 자연적인 순서는 Comparable을 구현해 설정이 가능하다.
// 자연적인 순서가 없으면 treeSet에 넣을 수 없다
// Comparator을 제공해주면 자연적인 순서가 없어도 넣을 수 있다.
// 스레드 안전하게 넣으려면 Collections.synchronizedSet(set)을 통해 생성한다.
// 내부적으로 이진 검색 트리(OlogN)를 사용
public class App {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(6);

        treeSet.forEach(System.out::println);

        try {
            TreeSet<PhoneNumber> phoneNumberTreeSet = new TreeSet<>();
            phoneNumberTreeSet.add(new PhoneNumber(123, 456, 7891));
            phoneNumberTreeSet.add(new PhoneNumber(321, 654, 1978));
            phoneNumberTreeSet.add(new PhoneNumber(213, 564, 9781));
        }catch (Exception exception) {
            System.out.println("자연적인 순서가 없으면 TreeSet에 넣을 수 없습니다.");
        }

        TreeSet<PhoneNumber> phoneNumberTreeSet = new TreeSet<>(Comparator.comparingInt(PhoneNumber::hashCode));
        phoneNumberTreeSet.add(new PhoneNumber(123, 456, 7891));
        phoneNumberTreeSet.add(new PhoneNumber(321, 654, 1978));
        phoneNumberTreeSet.add(new PhoneNumber(213, 564, 9781));

        Set<PhoneNumber> phoneNumbers = Collections.synchronizedSet(phoneNumberTreeSet);
        phoneNumbers.add(new PhoneNumber(123, 456, 7891));
        phoneNumbers.add(new PhoneNumber(321, 654, 1978));
        phoneNumbers.add(new PhoneNumber(213, 564, 9781));
    }
}
