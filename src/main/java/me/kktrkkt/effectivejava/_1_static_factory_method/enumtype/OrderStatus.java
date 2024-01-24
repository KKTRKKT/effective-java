package me.kktrkkt.effectivejava._1_static_factory_method.enumtype;

import lombok.Getter;

@Getter
public enum OrderStatus {

    PREPARING("배송 준비중"), SHIPPED("출고"), DELIVERING("배송중"), DELIVERED("배송 완료");

    private final String description;

    OrderStatus(String description){
        this.description = description;
    }
}
