import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acilis = 10, yol;
        double sabit = 2.20, ucret, enAz = 20, odenecek;

        System.out.print("Gidilecek yol bilgisini giriniz: ");
        yol = input.nextInt();
        ucret = acilis + (yol * sabit);

        boolean kosul = ucret < 20;
        odenecek = kosul ? enAz : ucret;

        System.out.println("Odenecek ucret: " + odenecek);
    }
}
