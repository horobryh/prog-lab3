public class Book extends Inanimate {
    int currentChapter;

    public Book(int chapter) {
        this.currentChapter = chapter;
    }

    public int getCurrentChapter() {
        return this.currentChapter;
    }

    public void setCurrentChapter(int chapter) {
        this.currentChapter = chapter;
    }

    @Override
    public String toString() {
        return "Chapter " + this.currentChapter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.hashCode() != obj.hashCode()) return false;


        Book book = (Book) obj;
        return getCurrentChapter() == book.getCurrentChapter();
    }

    @Override
    public int hashCode() {
        return getCurrentChapter() % 10;
    }
}
