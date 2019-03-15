package entity;

public abstract class Entity<T> {
    private T id;

    public T getId() {
        return this.id;
    }

    public Entity setId(T id) {
        this.id = id;
        return this;
    }
}
