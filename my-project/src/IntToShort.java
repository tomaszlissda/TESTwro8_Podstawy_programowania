import java.util.Scanner;

public class IntToShort {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        short b = (short) a;
        long c = b;
        double d = c;
        double e = a;
        char f = (char) b;

        System.out.println("a= " + a
                + "\n b=" + b
                + "\n c=" + c
                + "\n d=" + d
                + "\n e=" + e
                + "\n f='" + f + "'");
    }
}