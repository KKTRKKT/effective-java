package me.kktrkkt.effectivejava._07_dereferencing_used_objects.cache;

import java.time.LocalDateTime;
import java.util.Objects;

public class CacheKey {

    private Integer value;

    private LocalDateTime created;

    public CacheKey(Integer value) {
        this.value = value;
        this.created = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        return this.value.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, created);
    }

    @Override
    public String toString() {
        return "CacheKey{" +
                "value='" + value + '\'' +
                ", created=" + created +
                '}';
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
