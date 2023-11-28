import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        int hak=3;
        int balance=1500;
        int select;
        Scanner input=new Scanner(System.in);

        while (hak>0) {
            System.out.print("Kullanıcı Adı : ");
            userName = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            if (userName.equals("wallace")&& password.equals("1234")) {
                System.out.println("Wallace Bankasına Hoşgeldiniz...");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen İşlem Seçin : ");
                    select=input.nextInt();
                    if (select==1){
                        System.out.print("Yat.Para Miktarı : ");
                        int price= input.nextInt();
                        balance+=price;
                        System.out.println("Bakiyeniz : "+balance);
                    }else if (select==2){
                        System.out.print("Çek.Para Miktarı : ");
                        int price=input.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye Yetersiz");
                            System.out.println("Bakiyeniz : "+balance);
                        }else {
                            balance-=price;
                            System.out.println("Bakiyeniz : "+balance);
                        }
                    } else if (select==3) {
                        System.out.println("Bakiyeniz : "+balance);

                    }
                } while (select != 4);
                System.out.println("Yine Bekleriz ");
                break;
            }else {
                hak--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}