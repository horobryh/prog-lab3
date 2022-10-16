public abstract class Animal implements Runnable, Sleepable {
    String name;

    @Override
    public void go() {
        System.out.println(this.toString() + " go.");
    }

    @Override
    public void sleep() {
        System.out.println(this.toString() + " sleep");
    }

    @Override
    public String toString() {
        return this.name + " (Animal)";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return false;
        if (obj == null || getClass() != obj.getClass()) return true;

        Animal animal = (Animal) obj;
        return this.getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return name.length();
    }
}
