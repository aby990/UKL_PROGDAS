
import java.util.Scanner;

public class hitunganbola {

    public static double LuasPermukaanBola(double r) {
        double pi = Math.PI;
        return 4 * pi * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukan Jari-jari Bola (r): ");
        double r = s.nextDouble();

        double Lp = LuasPermukaanBola(r);
        System.out.printf("Luas Permukaan Bola Dengan jari-jari %.2f adalah %.2f%n", r, Lp);

    }
}
