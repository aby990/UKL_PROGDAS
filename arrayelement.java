
import java.util.Scanner;

public class arrayelement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan ukuran ARRAY (array mulai dari 0) : ");
        int msukarray = s.nextInt();
        int array[] = new int[msukarray];

        System.out.println("Masukkan elemen array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("masukkan array[" + i + "]");
            array[i] = s.nextInt();

        }
        cek(array);

    }

    static void cek(int array[]) {
        int maxCount = 0;
        int mostFrequent = array[0];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;

                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = array[i];

            }
        }
        if (maxCount > 1) {
            System.out.println("array yang sering muncul " + mostFrequent + " Muncul sebanyak "+maxCount + " kali");
        } else {
            System.out.println("array tidak ada yang sering muncul");
        }

    }

}
