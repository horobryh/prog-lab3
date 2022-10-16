public class Dormouse extends Animal implements Sittable {
    @Override
    public void sit() {
        System.out.println(this.toString() + " is sitting on a chair.");
    }

    public Dormouse() {
        this.name = "Dormouse";
    }
}
