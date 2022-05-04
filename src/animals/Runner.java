package animals;

public interface Runner {
    /* public abstract - default*/ void run();
    // all methods for interface are public and abstract

    default void count() {

    }
}
