import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ustSayi, altSayi, ustTut = 1, altTut = 1, altTut2 = 1;
        double kombin;

        System.out.print("Lütfen üst sayıyı giriniz: ");
        ustSayi = input.nextInt();

        System.out.print("Lütfen alt sayıyı giriniz: ");
        altSayi = input.nextInt();

        for (int i = 1; i <= ustSayi; i++){
            ustTut *= i;
        }
        for (int i = 1; i <= altSayi; i++){
            altTut *= i;
        }
        for (int i = 1; i <= (ustSayi - altSayi); i++){
            altTut2 *= i;
        }

        kombin = ustTut / (altTut * altTut2);
        System.out.println("Girilen sayıların kombinasyonu: " + kombin);
    }
}
