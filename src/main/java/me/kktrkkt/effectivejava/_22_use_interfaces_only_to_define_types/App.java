package me.kktrkkt.effectivejava._22_use_interfaces_only_to_define_types;

public class App implements Constants{

    public static void main(String[] args) {
        System.out.println(CONSTANTS); // 네임스페이스 없이 사용 가능하지만 권장하지 않음
        Constants app = new App(); // 코드가 이해하기 어렵다
    }
}
