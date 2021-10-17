import java.util.Scanner;

public class ustHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alt, us, sonDeger = 1;

        System.out.print("Lütfen hesaplanacak sayıyı giriniz: ");
        alt = input.nextInt();

        System.out.print("Lütfen üstteki sayıyı giriniz: ");
        us = input.nextInt();

        for (int i = 0; i < us; i++){
            sonDeger *= alt;
        }

        System.out.println("Girilen sayının " + us + ". kuvvetinin değeri: " + sonDeger);
    }
}
