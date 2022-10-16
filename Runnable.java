public interface Runnable {
    default void go() {
        System.out.println("Идти.");
    };
}
