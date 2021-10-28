import java.util.Scanner;

public class EnYakiniBul {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int minNum =0;
        int maxNum = array[0];
        int number;

        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();
        
        for (int i : array){
            if (i > number){
                if (i < maxNum){
                    maxNum = i;
                }
            }
        }

        for (int i : array){
            if (i < number){
                if (i >= minNum){
                    minNum = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minNum);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxNum);
    }
}
