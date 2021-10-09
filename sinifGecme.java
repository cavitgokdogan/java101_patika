import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double turkce, matematik, fizik, kimya, muzik, ortalama;

        System.out.println("Lutfen sirasi ile 5 notunuzu giriniz: ");
        turkce = input.nextInt();
        matematik = input.nextInt();
        fizik = input.nextInt();
        kimya = input.nextInt();
        muzik = input.nextInt();

        ortalama = (turkce + matematik + fizik + kimya + muzik) / 5;

        if (ortalama < 55){
            System.out.println("Sinifta kaldiniz. Notunuz: " + ortalama);
        }
        else{
            System.out.println("Sinifi basariyla gectiniz. Notunuz: " + ortalama);
        }
    }
}
