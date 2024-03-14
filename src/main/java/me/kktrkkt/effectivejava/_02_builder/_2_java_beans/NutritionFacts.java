package me.kktrkkt.effectivejava._2_builder._2_java_beans;

// setter를 통해 속성을 설정한다.
// 객체를 완성하는데 메소드를 여러번 호출해야되고, 불변객체를 만들 수 없다.
public class NutritionFacts {

    private int servingSize;

    private int servings;

    private int calories;

    private int fat;

    private int sodium;

    private int carbohydrate;

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
