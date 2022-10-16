public class People extends Animal implements Talkable, Thinkable {
    Condition condition;

    public void talk(Object obj) {
        System.out.println(this.toString() + " talk with " + obj.toString());
    }

    public void go(Object obj) {
        System.out.println(this.toString() + " go to " + obj.toString());
    }

    @Override
    public void think() {
        System.out.println(this.toString() + " is thinking.");
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
        if (this == obj) return false;
        if (obj == null || getClass() != obj.getClass()) return true;

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
