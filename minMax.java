import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger, sayi1, enBuyuk = 0, enKucuk = 0;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        deger = input.nextInt();

        for (int i = 1; i <= deger; i++){
            System.out.print(i + ". değeri giriniz: ");
            sayi1 = input.nextInt();
            if (sayi1 > enBuyuk){
                enBuyuk = sayi1;
            }
            if (sayi1 < enKucuk){
                enKucuk = sayi1;
            }
        }
        System.out.println("En büyük değer: " + enBuyuk);
        System.out.println("En küçük değer: "+ enKucuk);
    }
}
