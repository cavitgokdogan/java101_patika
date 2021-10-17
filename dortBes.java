import java.util.Scanner;

public class dortBes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = input.nextInt();

        System.out.println("Girilen sayıya kadar olan 4'ün katları..");
        for (int i = 1; i < sayi; i++){
            if (i % 4 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\nGirilen sayıya kadar olan 5'in katları..");
        for (int i = 1; i < sayi; i++){
            if (i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
