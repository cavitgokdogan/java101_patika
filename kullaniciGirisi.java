import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPassword;
        int answer;

        System.out.print("Kullanici adiniz: ");
        userName = input.nextLine();

        System.out.print("Sifreniz: ");
        password = input.nextLine();

        if (userName.equals("cavit")){
            if (password.equals("12345")){
                System.out.println("Sisteme basariyla giris yaptiniz..");
            }
            else{
                System.out.print("Girdiginiz sifre yanlis! Sifrenizi sifirlamak ister misiniz? (Evet ise 1, hayir ise 2 yi seciniz): ");
                answer = input.nextInt();
                if (answer == 1){
                    System.out.print("Lutfen yeni sifrenizi giriniz: ");
                    newPassword = input.next();
                    if (newPassword.equals("12345")){
                        System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                    }
                    else{
                        System.out.println("Sifre olusturuldu...");
                    }
                }
                else if(answer == 2){
                    System.out.println("Yeni sifre olusturma isleminden cikiliyor.");
                }
                else{
                    System.out.println("Hatali tuslama yaptiniz!!!");
                }
            }
        }
        else{
            System.out.println("Hatali isim girdiniz!!!");
        }
    }
}
