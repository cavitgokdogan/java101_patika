import java.util.Scanner;

public class gelismisHesapMakinesi {

    static void topla() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sonuc;

        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        sonuc = sayi1 + sayi2;
        System.out.println("SONUÇ: " + sonuc);
    }

    static void cikar() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sonuc;

        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        sonuc = sayi1 - sayi2;
        System.out.println("SONUÇ: " + sonuc);
    }

    static void carp() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sonuc;

        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        sonuc = sayi1 * sayi2;
        System.out.println("SONUÇ: " + sonuc);
    }

    static void bol() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sonuc;

        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        if (sayi2 == 0) {
            System.out.println("Sıfıra bölünemez!!!");
        } else {
            sonuc = sayi1 / sayi2;
            System.out.println("SONUÇ: " + sonuc);
        }
    }

    static void usAl() {
        Scanner input = new Scanner(System.in);
        int taban, us, sonuc = 1;

        System.out.print("Taban sayıyı giriniz: ");
        taban = input.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        us = input.nextInt();

        for (int x = 1; x <= us; x++) {
            sonuc *= taban;
        }
        System.out.println("SONUÇ: " + sonuc);
    }

    static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        int sayi, sonuc = 1;

        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (int x = 1; x <= sayi; x++) {
            sonuc *= x;
        }
        System.out.println("SONUÇ: " + sonuc);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        int sayi, mod, sonuc;

        System.out.print("Sayıyı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Mod sayısını giriniz: ");
        mod = input.nextInt();

        sonuc=sayi%mod;
        System.out.println("SONUÇ: " + sonuc);
    }

    static void alanVeCevre() {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, alan, cevre;

        System.out.print("1. Kenarı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        sayi2 = input.nextInt();

        alan=sayi1*sayi2;
        cevre=2*(sayi1+sayi2);

        System.out.println("ALAN: " + alan);
        System.out.println("CEVRE: " + cevre);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int islem;

        while (true) {
            System.out.println("""
                    0- Programı Sonlandır
                    1- Toplama İşlemi
                    2- Çıkarma İşlemi
                    3- Çarpma İşlemi
                    4- Bölme işlemi
                    5- Üslü Sayı Hesaplama
                    6- Faktoriyel Hesaplama
                    7- Mod Alma
                    8- Dikdörtgen Alan ve Çevre Hesabı\n""");

            System.out.print("Lütfen bir işlem seçiniz: ");
            islem = input.nextByte();

            if (islem == 0) {
                break;
            }

            switch(islem) {
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    usAl();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanVeCevre();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem numarası seçiniz!!!");
            }
        }
        System.out.println("Hesap makinesi kapanıyor !!!");
    }
}
