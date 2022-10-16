public class Test {
    public static void main(String[] args) {
        testing();
    }

    private static void testing() {
        part1();
        System.out.println();

        part2();
        System.out.println();

        part3();
        System.out.println();

        part4();
    }

    private static void part1() {
        People p1 = new People("test People 1", Condition.MAD);
        People p2 = new People("test People 2", Condition.MAD);
        People p3 = new People("test People 1", Condition.HAPPY);
        People p1_1 = new People("test People 1", Condition.MAD);

        System.out.println(p1.equals(p2) ? "Test 1_1 failed!" : "Test 1_1 complete!");
        System.out.println(p1.equals(p3) ? "Test 1_2 failed!" : "Test 1_2 complete!");
        System.out.println(p1.equals(p1_1) ? "Test 1_3 complete!" : "Test 1_3 failed!");
    }

    private static void part2() {
        Animal a1 = new Dormouse();
        a1.setName("test a1");
        Animal a2 = new Dormouse();
        a2.setName("test a2");
        Animal a1_1 = new Dormouse();
        a1_1.setName("test a1");

        System.out.println(a1.equals(a2) ? "Test 2_1 failed!" : "Test 2_1 complete!");
        System.out.println(a1.equals(a1_1) ? "Test 2_2 complete!" : "Test 2_2 failed!");
    }

    public static void part3() {
        Book b1 = new Book(1);
        Book b2 = new Book(2);
        Book b1_1 = new Book(1);

        System.out.println(b1.equals(b2) ? "Test 3_1 failed!" : "Test 3_1 complete!");
        System.out.println(b1.equals(b1_1) ? "Test 3_2 complete!" : "Test 3_2 failed!");
    }

    public static void part4() {
        Table t1 = new Table();
        t1.setTable();
        Table t2 = new Table();
        t2.unsetTable();
        Table t1_1 = new Table();
        t1_1.setTable();
        Table t2_1 = new Table();
        t2_1.unsetTable();

        System.out.println(t1.equals(t2) ? "Test 4_1 failed!" : "Test 4_1 complete!");
        System.out.println(t1.equals(t1_1) ? "Test 4_2 complete!" : "Test 4_2 failed!");
        System.out.println(t1.equals(t2_1) ? "Test 4_3 failed!" : "Test 4_3 complete!");
        System.out.println(t2.equals(t1_1) ? "Test 4_4 failed!" : "Test 4_4 complete!");
        System.out.println(t2.equals(t2_1) ? "Test 4_5 complete!" : "Test 4_5 failed!");
    }
}
