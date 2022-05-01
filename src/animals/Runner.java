package animals;

public interface Runner {
    /* public abstract - default*/ void run();
    // all methods for interface are public and abstract

    // the interface method that the implementation can use is only: static, default, or private
    static void fastRun() {
        System.out.println("I can run even faster");
    }

    default void count() {

    }
}
