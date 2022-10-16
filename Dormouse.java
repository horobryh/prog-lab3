public class Dormouse extends Animal implements Sittable {
    @Override
    public void sit() {
        System.out.println(this.toString() + " is sitting on a chair.");
    }

    @Override
    public void go(Object obj) {
        System.out.println(this + " go to " + obj.toString());
    }

    @Override
    public String toString() {
        return this.name + " (Dormouse)";
    }

    public Dormouse() {
        this.name = "Dormouse";
    }
}
