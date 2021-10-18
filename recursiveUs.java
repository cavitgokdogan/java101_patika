import java.util.Scanner;

public class recursiveUs {

    static int usAl(int sayi1, int sayi2){
        if (sayi2 == 0){
            return 1;
        }
        else if (sayi1 == 1){
            return 1;
        }
        return sayi1 * usAl(sayi1, sayi2 - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Lütfen üssü alınacak sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("Lütfen üstteki sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.println("Sonuç: " + usAl(num1, num2));
    }
}
