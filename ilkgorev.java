import java.util.Scanner;

public class ilk_Gorev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen matematik notunuzu giriniz: ");
        int matematik = input.nextInt();

        System.out.print("Lutfen turkce notunuzu giriniz: ");
        int turkce = input.nextInt();

        System.out.print("Lutfen fizik notunuzu giriniz: ");
        int fizik = input.nextInt();

        System.out.print("Lutfen kimya notunuzu giriniz: ");
        int kimya = input.nextInt();

        System.out.print("Lutfen tarih notunuzu giriniz: ");
        int tarih = input.nextInt();

        System.out.print("Lutfen muzik notunuzu giriniz: ");
        int muzik = input.nextInt();

        double ortalama = (matematik + turkce + fizik + kimya + tarih + muzik) / 6;
        boolean kosul = ortalama > 50;
        
        System.out.println("Not ortalamaniz: " + ortalama);
        System.out.println("Sınıftan " + (kosul == true ? "gectiniz" : "kaldiniz"));
    }
}
