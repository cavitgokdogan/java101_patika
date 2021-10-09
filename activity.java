import java.util.Scanner;

public class activity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        String result;

        System.out.print("Please enter the temperature: ");
        heat = input.nextInt();
        
        boolean condition1 = heat < 5; // Ski
        boolean condition2 = (heat >= 5 && heat < 15); // Cinema
        boolean condition3 = (heat > 15 && heat <= 25); // Picnic
        boolean condition4 = (heat > 25); // Swim

        result = condition1 ? "You can ski!!!" :
                 condition2 ? "You can go to the cinema!!!" :
                 condition3 ? "You can picnic!!!" :
                 condition4 ? "You can go swimming!!!":
                         "Program finished";

        System.out.println(result);
    }
}
