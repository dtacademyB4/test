public class NumberTester {
 int value;

    public static void main(String[] args) {
        Numberz n = new Numberz();

        n.increment();

        System.out.println(n.value);

        n.increment();

        System.out.println(n.value);

        n.decrement();

        System.out.println(n.value);
    }
}
