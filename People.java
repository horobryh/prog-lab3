public class People extends Animal implements Talkable, Thinkable {
    Condition condition;

    public void talk(Object obj) {
        System.out.println(this + " talk with " + obj.toString());
    }

    public void go(Object obj) {
        System.out.println(this + " go to " + obj.toString());
    }

    @Override
    public void think() {
        System.out.println(this + " is thinking.");
    }

    public People(String name, Condition condition) {
        this.name = name;
        this.condition = condition;
    }

    public Condition getCondition() {
        return this.condition;
    }

    @Override
    public String toString() {
        return this.name + " (People, " + this.condition + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.hashCode() != obj.hashCode()) return false;

        People people = (People) obj;
        return condition == people.getCondition() && name.equals(people.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(Condition cond) {
        this.condition = cond;
    }

    @Override
    public int hashCode() {
        return condition.ordinal();
    }
}
