import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, ebob = 1, ekok = 1;

        System.out.print("1. Sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        sayi2 = input.nextInt();
        int y = 1;
        while (y <= sayi1) {
            if (sayi1 % y == 0 && sayi2 % y == 0) {
                ebob = y;
            }
            y++;
        }
        System.out.println("EBOB: " + ebob);

        int a = 1;
        while (a <= sayi1 * sayi2) {
            if (a % sayi1 == 0 && a % sayi2 == 0) {
                ekok = a;
                break;
            }
            a++;
        }
        System.out.println("EKOK: " + ekok);
    }
}
