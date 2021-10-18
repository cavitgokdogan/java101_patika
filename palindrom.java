import java.util.Scanner;

public class palindrom {

    static void palindromSayi(int sayi){
        int tersSayi = 0, tut = sayi;

        while (tut != 0){
            tersSayi = tersSayi + (tut % 10);
            tut /= 10;
            tersSayi *= 10;
        }
        tersSayi /= 10;

        if (sayi == tersSayi){
            System.out.println(sayi + " palindrom sayıdır.");
        }
        else{
            System.out.println(sayi + " palindrom sayı değildir.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextInt();

        palindromSayi(num);
    }
}
