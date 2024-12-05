
import java.util.Scanner;

public class bilprim {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean bilprim = true;
        int i;
        System.out.println("masukkan angka yang bulat");
        int angka = s.nextInt();

        if (angka == 0 || angka == 1) {
            bilprim = false;
        } else {
            for (i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    bilprim = false;
                    break;
                }
            }
        }
        if (bilprim) {
            System.out.println(angka + " merupakan bilangan prima"); 
        }else {
            System.out.println(angka + " bukan bilangan prima");
        }
    }
}
