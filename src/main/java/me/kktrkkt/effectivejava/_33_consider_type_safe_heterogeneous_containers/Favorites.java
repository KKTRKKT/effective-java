package me.kktrkkt.effectivejava._33_consider_type_safe_heterogeneous_containers;

import java.util.HashMap;
import java.util.Map;

// 타입 토큰을 사용해 타입 안전 이종 컨테이너를 구현한 예제
// extends를 통해 한정적 타입 토큰으로 바꿀 수 있다.
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(type, type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();

        favorites.putFavorite(String.class, "Hello, World!");
        favorites.putFavorite(Integer.class, 123);

        String favoriteString = favorites.getFavorite(String.class);
        Integer favoriteInteger = favorites.getFavorite(Integer.class);

        System.out.println("Favorite String: " + favoriteString);
        System.out.println("Favorite Integer: " + favoriteInteger);
    }
}
