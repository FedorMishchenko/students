package service;

import java.util.List;

public interface Service<T, I> {
    void create(T entity);
    T get(Integer id);
    void update(I id, T entity);
    void delete(I id);
    List<T> getAll();
}
