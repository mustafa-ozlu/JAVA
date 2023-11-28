
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  kilo,vki,boy,boymetre;

        Scanner girdi=new Scanner(System.in);
        //CM olarak boy girişi istiyoruz
        System.out.print("Boyunuz (cm) \t:");
        boy=girdi.nextDouble();
        //CM'yi metreye çeviriyoruz
        boymetre=boy/100;
        System.out.print("Kilonuz (kg) \t:");
        kilo=girdi.nextDouble();
        //Kilo (kg) / Boy(m) * Boy(m) hesaplamayı yapıyoruz
        vki=kilo/(boymetre*boymetre);
        System.out.println("Vücut Kitle İndeksiniz :" + vki);

    }
}