import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0, sayi;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();

        for(int i = 1; i < sayi; i++) {
            if(sayi % i == 0){
                toplam += i;
            }
        }
        if(sayi == toplam){
            System.out.println(sayi + " Mükemmel bir sayıdır.");
        }
        else{
            System.out.println(sayi + " Mükemmel bir sayı değildir.");
        }
    }
}
