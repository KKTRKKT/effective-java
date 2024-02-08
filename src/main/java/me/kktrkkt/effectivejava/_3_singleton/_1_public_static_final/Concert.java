package me.kktrkkt.effectivejava._3_singleton._1_public_static_final;

// elvis의 sing 메소드가 외부 API를 호출하거나 비용이 많이 드는 작업이라면 테스트할때마다 비용이 많이 든다.
// 해결방법: 실제 elvis가 아니라 인터페이스를 만들어 비용이 적은 작업으로 대체한다.
public class Concert {

    private boolean lightsOn;

    private boolean mainStateOpen;

//    private final Elvis elvis;
    private final IElvis elvis;

    public Concert(IElvis elvis){
        this.elvis = elvis;
    }

    public void perform() {
        mainStateOpen = true;
        lightsOn= true;
        elvis.sing();
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isMainStateOpen() {
        return mainStateOpen;
    }
}
