package me.kktrkkt.effectivejava._26_dont_use_raw_type.genericdao;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class GenericRepository<T extends Entity> {

    private Set<T> entities;

    public GenericRepository() {
        this.entities = new HashSet<>();
    }

    public Optional<T> findById(Long id) {
        return entities.stream().filter(a -> a.getId().equals(id)).findAny();
    }

    public void add(T entity) {
        this.entities.add(entity);
    }

}
