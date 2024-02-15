package me.kktrkkt.effectivejava.etc.deprecation;

// @Deprecated는 클라이언트에게 더이상 이 코드를 사용하지 말라고 경고해준다.
// @deprecated api docs에 해당 기능이 사용되지 않음을 알려준다.
public class Deprecation {

    private String name;

    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */
    @Deprecated(forRemoval = true, since = "1.2")
    public Deprecation() {}

    public Deprecation(String name) {
        this.name = name;
    }
}
