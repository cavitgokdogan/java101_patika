import java.util.Scanner;

public class deseneGoreMetot {

    static String desenOlustur(int sayi, int adet, int deneme) {
        if (deneme > 0){
            return sayi + " " + desenOlustur(sayi-5, adet + 1, deneme - 1);
        }
        else if (adet > 0){
            return sayi + " " + desenOlustur(sayi + 5, adet - 1, deneme);
        }
        return sayi + " ";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int adet = 0, sayi, deneme;

        System.out.print("Başlangıç sayisini giriniz : ");
        sayi= scanner.nextInt();
        deneme = sayi / 5;

        System.out.print(desenOlustur(sayi, adet, deneme));
    }
}
