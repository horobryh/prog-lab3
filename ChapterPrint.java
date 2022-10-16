public class ChapterPrint {
    public static void main(String[] args) {
        People she = new People("She", Condition.NEUTRAL);

        People he = new People("He", Condition.MAD);
        System.out.println(he);

        Hat hat = new Hat(Condition.NEUTRAL);
        she.go(hat);

        System.out.println();
        Book book = new Book(7);
        System.out.println(book);

        Table table = new Table();
        table.setTable();
        System.out.println(table);

        Rabbit rabbit = new Rabbit(Condition.NEUTRAL);
        rabbit.drink();
        hat.drink();

        Dormouse dormouse = new Dormouse();
        dormouse.sit();
        dormouse.sleep();

        rabbit.lean(dormouse);
        hat.lean(dormouse);

        rabbit.talk(hat);

        System.out.println();
        System.out.println(">>> Testing part");
        Testing.testing();
    }
}
