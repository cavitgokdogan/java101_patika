import java.util.Scanner;

public class toplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;
        boolean dongu = true;

        while (dongu){
            System.out.print("Lütfen bir sayı giriniz(Döngüyü bitirmek için tek sayı giriniz): ");
            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0 && sayi > 0){
                toplam += sayi;
            }
            if (sayi % 2 == 1){
                dongu = false;
            }
        }
        System.out.println("Şimdiye kadar girdiğiniz çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
