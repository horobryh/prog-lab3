public interface Sleepable {
    default void sleep() {
        System.out.println("Спать.");
    }
}
