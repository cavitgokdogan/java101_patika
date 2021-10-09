import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int islem;
        double ilkSayi, ikinciSayi;
        
        System.out.print("Lutfen ilk sayiyi giriniz: ");
        ilkSayi = input.nextDouble();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        ikinciSayi = input.nextDouble();

        System.out.print("Lutfen yapmak istediginiz islemi seciniz\n" +
                "1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme\nSeciminiz: ");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama isleminin sonucu: " + (ilkSayi + ikinciSayi));
                break;
            case 2:
                System.out.println("Cikarma isleminin sonucu: " + (ilkSayi - ikinciSayi));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu: " + (ilkSayi * ikinciSayi));
                break;
            case 4:
                if (ikinciSayi == 0){
                    System.out.println("Bolme islemi icin 0 gecerli bir sayi degildir.");
                }
                else{
                    System.out.println("Bolme isleminin sonucu: " + (ilkSayi / ikinciSayi));
                }
                break;
        }
    }
}
