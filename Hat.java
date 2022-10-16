public class Hat extends People implements Drinkable, Leanable {
    @Override
    public void drink() {
        System.out.println(this.toString() + " drink tea.");
    }

    @Override
    public void lean(Object obj) {
        System.out.println(this.toString() + " leaning on " + obj.toString());
    }

    public Hat(Condition condition) {
        super("Hat", condition);
    }
}
