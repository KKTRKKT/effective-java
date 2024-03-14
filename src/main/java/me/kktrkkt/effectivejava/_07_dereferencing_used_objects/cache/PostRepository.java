package me.kktrkkt.effectivejava._07_dereferencing_used_objects.cache;

import java.util.Map;
import java.util.WeakHashMap;

// Weak 레퍼런스를 이용한 자료구조를 사용하면 객체 사용이 끝나는 시점에 GC에 의해 수거가 가능하다.
// 주의할 점은 primitive 타입을 키로 쓰면 jvm 내부에서 캐싱되어서 GC에 수거가 되지 않는다.
public class PostRepository {

    Map<CacheKey, Post> cache;

    public PostRepository() {
        // Weak 레퍼런스를 키로 가지는 HashMap으로 Weak 레퍼런스가 GC에 의해 수거되면 값도 사라진다
        this.cache = new WeakHashMap<>();
    }

    public Post findById(Integer id){
        // CacheKey가 Weak 레퍼런스로 사용되며 해당 메소드 스콮이 끝나면 삭제된다.
        CacheKey cacheKey = new CacheKey(id);
        if(cache.containsKey(cacheKey)){
            return cache.get(cacheKey);
        }
        else {
            Post post = new Post();
            cache.put(cacheKey, post);
            return post;
        }
    }
}
