import java.util.Scanner;

public class DizideFrekans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int sayac = 0, ara;

        System.out.print("Dizide aratmak istediğiniz sayıyı giriniz: ");
        ara = input.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if (ara == dizi[i]) {
                sayac += 1;
            }
        }
        System.out.println("Dizide Aradığınız Sayı      : " + ara);
        System.out.println("Dizide Tekrar Edilme Sayısı : " + sayac);
    }
}
