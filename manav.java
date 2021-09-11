import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, tutar;
        double kiloA, kiloE, kiloD, kiloM, kiloP;

        System.out.print("Kaç kilo armut istiyorsunuz: ");
        kiloA = input.nextDouble();
        System.out.print("Kaç kilo elma istiyorsunuz: ");
        kiloE = input.nextDouble();
        System.out.print("Kaç kilo domates istiyorsunuz: ");
        kiloD = input.nextDouble();
        System.out.print("Kaç kilo muz istiyorsunuz: ");
        kiloM = input.nextDouble();
        System.out.print("Kaç kilo patlıcan istiyorsunuz: ");
        kiloP = input.nextDouble();

        tutar = (kiloA * armut) + (kiloE * elma) + (kiloD * domates) + (kiloM * muz) + (kiloP * patlıcan);

        System.out.println("Toplam ödenecek tutar: " + tutar);
    }
}
