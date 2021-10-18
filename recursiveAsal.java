import java.util.Scanner;

public class recursiveAsal {

    static int asalMi(int sayi, int deger){

        if (deger == 1){
            return 1;
        }
        else{
            if (sayi % deger == 0){
                return 0;
            }
            else{
                return asalMi(sayi, deger - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, tut;

        System.out.print("Lütfen bir değer giriniz: ");
        num = input.nextInt();

        tut = asalMi(num, num / 2);

        if (tut == 1){
            System.out.println(num + " sayısı asaldır.");
        }
        else{
            System.out.println(num + " sayısı asal değildir.");
        }
    }
}
