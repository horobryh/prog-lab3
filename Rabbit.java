public class Rabbit extends People implements Drinkable, Leanable {
    @Override
    public void drink() {
        System.out.println(this.toString() + " drink tea.");
    }

    @Override
    public void lean(Object obj) {
        System.out.println(this.toString() + " leaning on " + obj.toString());
    }

    public Rabbit(Condition condition) {
        super("Rabbit", condition);
    }
}
