import java.util.Scanner;

public class kitleEndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilo;
        double indeks, boy;

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = input.nextInt();

        indeks = kilo / (boy * boy);
        System.out.println("Vucut kitle indeksiniz: " + indeks);
    }
}
