import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input= new Scanner(System.in);

        System.out.println("Kullanıcı Adı : ");
        userName=input.nextLine();

        System.out.println("Şifre : ");
        password=input.nextLine();

        if (userName.equals("wallace")&&password.equals("java123")){
            System.out.println("Giriş Yaptınız");

        }else {
            System.out.println("Bilgiler Yanlış");
        }

    }
}
