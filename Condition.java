public enum Condition {
    HAPPY("Happy"),
    MAD("Mad"),
    NEUTRAL("Neutral");

    private final String string_name;

    Condition(String name) {
        this.string_name = name;
    }

    public String getName() {
        return this.string_name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
