import java.util.Scanner;

public class arrangement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second, third;

        System.out.print("Please enter the first number: ");
        first = input.nextInt();

        System.out.print("Please enter the second number: ");
        second = input.nextInt();

        System.out.print("Please enter the third number: ");
        third = input.nextInt();

        if (first < second && first < third){
            if (second < third){
                System.out.println("Sorting from smallest to largest: " + first + " " + second + " " + third);
            }
            else {
                System.out.println("Sorting from smallest to largest: " + first + " " + third + " " + second);
            }
        }
        else if (second < first && second < third){
            if (first < third){
                System.out.println("Sorting from smallest to largest: " + second + " " + first + " " + third);
            }
            else {
                System.out.println("Sorting from smallest to largest: " + second + " " + third + " " + first);
            }
        }
        else {
            if (first < second){
                System.out.println("Sorting from smallest to largest: " + third + " " + first + " " + second);
            }
            else{
                System.out.println("Sorting from smallest to largest: " + third + " " + second + " " + first);
            }
        }

        System.out.println("");
    }
}
