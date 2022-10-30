public class Table extends Inanimate {
    Boolean set;

    public Table() {
        this.name = "Table";
        this.set = false;
    }

    public void setTable() {
        this.set = true;
    }

    public void unsetTable() {
        this.set = false;
    }

    @Override
    public String toString() {
        return this.name + ". Set: " + this.set;
    }

    public boolean getSet() {
        return this.set;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.hashCode() != obj.hashCode()) return false;

        Table table = (Table) obj;
        return name.equals(table.name) && table.getSet() == getSet();
    }

    @Override
    public int hashCode() {
        return set ? 1 : 0;
    }
}
