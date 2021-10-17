import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi, toplam = 0;

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = input.nextInt();

        for (double i = sayi; i > 0; i--){
            toplam += 1 / i;
        }

        System.out.println("Girilen sayının harmonik seri sonucu: " + toplam);
    }
}
