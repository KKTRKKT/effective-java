package me.kktrkkt.effectivejava.etc.callback_and_wrapper;

// 수퍼클래스에서 선언된 this는 서브클래스에서 호출되도 수퍼클래스를 가리킨다.
// 다음 아래 코드에서는 TVService에서 this를 넘겨 콜백 함수를 구현
// TVServiceWrapper를 통해 래퍼를 구현하고 추가 코드 작성
// 하지만 this는 TVServiceWrapper가 아닌 TVService이므로 TVServiceWrapper의 메소드를 호출하지 않음
class Service{

    public void run(FunctionToCall functionToCall) {
        System.out.println("service");
        functionToCall.run();
    }

    public static void main(String[] args) {
        Service service = new Service();
        TVService tvService = new TVService(service);
        TVServiceWrapper tvServiceWrapper = new TVServiceWrapper(tvService);
        tvServiceWrapper.run();
    }
}
