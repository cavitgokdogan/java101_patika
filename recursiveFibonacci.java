import java.util.Scanner;

public class recursiveFibonacci {

    static int fibonacci(int sayi){
        if (sayi == 1 || sayi == 2){
            return 1;
        }
        return fibonacci(sayi - 1) + fibonacci(sayi - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Kaç adet fibonacci sayısı görmek istersiniz: ");
        num = input.nextInt();

        for (int i = 2; i <= num; i++){
            System.out.println(fibonacci(i));
        }
    }
}
