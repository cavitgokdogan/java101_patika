import java.util.Scanner;

public class ElemanSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, tut;

        System.out.print("Dizinin boyutunu giriniz: ");
        sayi = input.nextInt();
        int[] dizi = new int[sayi];

        for (int i = 0; i < sayi; i++){
            System.out.print((i + 1) + ". elemanı: ");
            dizi[i] = input.nextInt();

        }
        for (int i = 0; i < sayi - 1; i++){
            for (int j = i + 1; j < sayi; j++){
                if (dizi[j] < dizi[i]){
                    tut = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = tut;
                }
            }
        }
        System.out.print("Sıralama: ");
        for (int i = 0; i < dizi.length; i++){
            System.out.print(dizi[i] + " ");
        }
    }
}
