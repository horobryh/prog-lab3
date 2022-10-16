public abstract class Animal implements Runnable, Sleepable {
    String name;

    @Override
    public abstract void go(Object obj);

    @Override
    public void sleep() {
        System.out.println(this.toString() + " sleep");
    }

    @Override
    public abstract String toString();

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
