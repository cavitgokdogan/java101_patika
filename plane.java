import java.util.Scanner;

public class plane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, tip;
        double mUcret = 0.1, genelUcret, yasIndirimi = 0, tipIndirimi = 0;

        System.out.print("Lutfen gideceginiz mesafeyi KM cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Lutfen yasinizi giriniz: ");
        yas = input.nextInt();

        System.out.print("Lutfen yolculuk tipinizi seciniz(1- Tek yön, 2- Gidis-donus): ");
        tip = input.nextInt();

        if (mesafe > 0 && yas > 0 && tip >= 1 && tip <= 2){
            genelUcret = mesafe * mUcret;

            if (yas < 12){
                yasIndirimi = genelUcret * 0.5;
            }
            else if (yas >= 12 && yas < 24){
                yasIndirimi = genelUcret * 0.1;
            }
            else if (yas > 65){
                yasIndirimi = genelUcret * 0.3;
            }

            if (tip == 2){
                tipIndirimi = (genelUcret - yasIndirimi) * 0.2;
                System.out.println("Odenecek tutar: " + (genelUcret - yasIndirimi - tipIndirimi) * 2);
            }
            else {
                System.out.println("Odenecek tutar: " + (genelUcret - yasIndirimi));
            }
        }
        else {
            System.out.println("Hatali veri girdiniz!!!");
        }
    }
}
