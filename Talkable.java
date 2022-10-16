public interface Talkable {
    default void talk() {
        System.out.println("Разговаривать.");
    }
}
