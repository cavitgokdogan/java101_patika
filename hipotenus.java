import java.util.Scanner;

public class ucuncugorev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, cevre, u, alan;

        System.out.print("1. kenari giriniz:");
        a = input.nextInt();
        System.out.print("2. kenari giriniz:");
        b = input.nextInt();
        System.out.print("Dik kenari giriniz:");
        c = input.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = a * b / 2;

        System.out.println("Ucgenin cevresi: " + cevre + "\nUcgenin alani: " + alan);
    }
}
