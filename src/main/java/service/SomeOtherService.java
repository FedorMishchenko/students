package service;

import java.util.List;

public class SomeOtherService implements Service<Object,Integer> {
    @Override
    public void create(Object entity) {

    }

    @Override
    public Object get(Integer id) {
        return null;
    }

    @Override
    public void update(Integer id, Object entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Object> getAll() {
        return null;
    }
}
