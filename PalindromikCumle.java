import java.util.Scanner;

public class PalindromikCumle {
    public static boolean isPolindrome(String str){
        for(int j = 0;j<str.length();j++){
            if(str.charAt(j)==' '){
                str = str.replace(" ", "");
            }
        }
        for(int i = 0 ;i<(str.length()/2);i++){
            if(str.charAt(i)!=(str.charAt(str.length()-i-1))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String str = input.nextLine();

        if(isPolindrome(str)){
            System.out.println("polindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
