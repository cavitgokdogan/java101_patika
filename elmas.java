import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;

        System.out.print("Bir sayı giriniz: ");
        result = input.nextInt();

        for (int i = 0; i <= result; i++) {
            for (int j = 0; j < (result - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i <= result; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * result) - (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
