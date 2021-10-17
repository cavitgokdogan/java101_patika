import java.util.Scanner;

public class ortakKat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0, tut = 0;
        double ortalama;

        System.out.print("Lütfen üst limiti giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                tut++;
            }
        }
        ortalama  = toplam / (tut - 1);

        System.out.println("Girilen sayıya kadar olan 3 ve 4'ün ortak katlarının ortalaması: " + ortalama);
    }
}
