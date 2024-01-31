package me.kktrkkt.effectivejava._2_builder._4_hierarchical_builder;

public class NyPizza extends Pizza{

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder>{

        private Size size = Size.SMALL;

        Builder size(Size size) {
            this.size = size;
            return this;
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public static void main(String[] args) {
        new NyPizza.Builder()
                .size(Size.LARGE)
                .addTopping(Topping.HAM)
                .build();
    }
}
