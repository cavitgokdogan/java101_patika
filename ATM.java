import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kalanHak = 3, islem, bakiye = 10000, miktar;
        String kullaniciAdi2, sifre;
        System.out.println("Merhabalar, Kodluyoruz bankasına Hoşgeldiniz!");
        
        while (kalanHak > 0) {
            System.out.print("Kullanıcı Adınız: ");
            kullaniciAdi2 = input.nextLine();
            System.out.print("Şifreniz: ");
            sifre = input.nextLine();
            if (kullaniciAdi2.equals("Patika") && sifre.equals("Dev123")) {
                System.out.println("Sisteme başarılı bir şekilde giriş yaptınız.");
                
                System.out.println("1 - Bakiye Sorgulama\n" +
                        "2 - Para Yatırma\n" +
                        "3 - Para Çekme\n" +
                        "4 - Çıkış Yap\n");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                islem = input.nextInt();

                do {
                    switch (islem) {
                        case 1:
                            System.out.println("Bakiyeniz: " + bakiye);

                            System.out.println("1 - Bakiye Sorgulama\n" +
                                    "2 - Para Yatırma\n" +
                                    "3 - Para Çekme\n" +
                                    "4 - Çıkış Yap\n");
                            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                            islem = input.nextInt();
                            break;

                        case 2:
                            System.out.print("Lütfen yatırmak istediğiniz para miktarını giriniz: ");
                            miktar = input.nextInt();
                            bakiye += miktar;
                            System.out.println("Bakiyeniz: " + bakiye);

                            System.out.println("1 - Bakiye Sorgulama\n" +
                                    "2 - Para Yatırma\n" +
                                    "3 - Para Çekme\n" +
                                    "4 - Çıkış Yap\n");
                            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                            islem = input.nextInt();
                            break;

                        case 3:
                            System.out.print("Lütfen çekmek istediğiniz para miktarını giriniz: ");
                            miktar = input.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                bakiye -= miktar;
                                System.out.println("Bakiyeniz: " + bakiye);
                            }

                            System.out.println("1 - Bakiye Sorgulama\n" +
                                    "2 - Para Yatırma\n" +
                                    "3 - Para Çekme\n" +
                                    "4 - Çıkış Yap\n");
                            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                            islem = input.nextInt();
                            break;

                        case 4:
                            break;

                        default:
                            System.out.println("1 - Bakiye Sorgulama\n" +
                                    "2 - Para Yatırma\n" +
                                    "3 - Para Çekme\n" +
                                    "4 - Çıkış Yap\n");
                            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                            islem = input.nextInt();

                    }
                } while (islem != 4);
                System.out.print("İyi günler dileriz.");
                break;

            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre girişi. Kalan hakkınız: " + --kalanHak);
                if (kalanHak == 0) {
                    System.out.println("Hesabınız bloke edilmiştir.");
                }
            }
        }
    }
}
