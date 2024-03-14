package me.kktrkkt.effectivejava._2_builder._3_builder;

import lombok.Builder;

// 필수값을 입력받게 강제하고, 불변객체로 만들 수 있는 장점이 있다.
// 코드가 복잡해진다. lombok의 @Builder를 쓰면 간단해지지만 필수값을 받게할 수 없다.)
public class NutritionFacts {

    private final int servingSize; // 필수

    private final int servings; // 필수

    private final int calories; // 선택

    private final int fat; // 선택

    private final int sodium; // 선택

    private final int carbohydrate; // 선택

    public NutritionFacts(Builder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder{
        private final int servingSize;

        private final int servings;

        private int calories = 0;

        private int fat = 0;

        private int sodium = 0;

        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    public static void main(String[] args) {
        NutritionFacts build = new Builder(10, 10)
                .calories(10)
                .build();
    }
}
