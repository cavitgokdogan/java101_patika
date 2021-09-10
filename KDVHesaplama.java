import java.util.Scanner;

public class ikinci_gorev {
    public static void main(String[] args) {

        int Bkdv = 18, Kkdv = 8, tut;
        double fiyat, fiyat2, kdvsiz;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen fiyati giriniz:");
        fiyat = input.nextInt();

        boolean kosul1 = fiyat >= 0;
        boolean kosul2 = fiyat <= 1000;
        boolean aralik = kosul1 && kosul2;

        tut = aralik ? Bkdv : Kkdv;
        fiyat2 = fiyat + ((fiyat * tut) / 100);
        kdvsiz = fiyat2 - fiyat;

        System.out.println("KDV'siz fiyat = " + fiyat);
        System.out.println("KDV'li fiyati = " + fiyat2);
        System.out.println("Eklenen KDV miktarı: " + kdvsiz);
    }
}
