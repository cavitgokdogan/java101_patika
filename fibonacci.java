import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sayi1 = 0, sayi2 = 1, sonuc = 0;

        System.out.print("Kaç adet fibonacci sayısı görmek istersiniz: ");
        num = input.nextInt();
        System.out.print(sayi1 + " ");
        for(int i = 0; i<num; i++){
            sayi1 = sayi2;
            sayi2 = sonuc;
            sonuc = sayi1 + sayi2;

            System.out.print(sonuc + " ");
        }
    }
}
