package me.kktrkkt.effectivejava._01_static_factory_method.advantage_1;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    // 시그니처가 중복되서 생성자를 생성할 수 없다
    /*public Order(Product product, boolean prime){
        this.product = product;
        this.prime = prime;
    }

    public Order(Product product, boolean urgent){
        this.product = product;
        this.urgent = urgent;
    }*/

    // 시그니처 중복문제를 해결한다
    static public Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    static public Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}
