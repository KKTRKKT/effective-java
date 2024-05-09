package me.kktrkkt.effectivejava._26_dont_use_raw_type.genericdao;

public class Message implements Entity {

    private Long id;

    private String body;

    @Override
    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }
}
