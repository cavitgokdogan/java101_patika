import java.util.Scanner;

public class dilimAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, pi = 3.14, aci, alan;

        System.out.print("Lutfen yaricapi giriniz: ");
        r = input.nextInt();
        System.out.print("Lutfen daire diliminin acisini giriniz: ");
        aci = input.nextInt();

        alan = (pi * (r * r) * aci) / 360;

        System.out.println("Daire diliminin alani: " + alan);
    }
}
