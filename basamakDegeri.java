import java.util.Scanner;

public class basamakDegeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, birler, onlar, yuzler, binler, toplam;

        System.out.print("Basamak değerleri bulunacak sayıyı giriniz(Lütfen 5 basamaktan büyük bir sayı girmeyiniz): ");
        sayi = input.nextInt();

        if (sayi >= 1000 && sayi < 10000){
            birler = (sayi % 10);
            onlar = (sayi % 100) / 10;
            yuzler = (sayi % 1000) / 100;
            binler = (sayi % 10000) / 1000;
            toplam = birler + onlar + yuzler + binler;

            System.out.println("Girilen sayının basamak değerleri toplamı: " + toplam);
        }
        else if (sayi >= 100 && sayi < 1000){
            birler = (sayi % 10);
            onlar = (sayi % 100) / 10;
            yuzler = (sayi % 1000) / 100;
            toplam = birler + onlar + yuzler;

            System.out.println("Girilen sayının basamak değerleri toplamı: " + toplam);
        }
        else if (sayi >= 10 && sayi < 100){
            birler = (sayi % 10);
            onlar = (sayi % 100) / 10;
            toplam = birler + onlar;

            System.out.println("Girilen sayının basamak değerleri toplamı: " + toplam);
        }
        else{
            System.out.println("Hatalı giriş yaptınız!!!");
        }
    }
}
