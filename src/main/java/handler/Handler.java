package handler;


public interface Handler<E, I> {
    E create();

    I get();

    E update();

    I delete();
}
