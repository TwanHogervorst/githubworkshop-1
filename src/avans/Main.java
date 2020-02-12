package avans;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test my methods:\n");

        double a = 33.3;
        double b = 66.6;
        double r = sum(a, b);
        System.out.println(a + " + " + b + " = " + r);
    }

    public static double sum ( double a, double b ) {
        return a + b;
    }
}
