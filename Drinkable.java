public interface Drinkable {
    default void drink() {
        System.out.println("Пить");
    };
}
