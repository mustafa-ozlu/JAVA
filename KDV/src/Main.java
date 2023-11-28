// Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
// KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//
//(Not : KDV tutarını 20% olarak alın)

//Alıştırma
//
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %20 ,
// tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
// hesaplayan programı yazınız.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat, total,oran;
        Scanner girdi=new Scanner(System.in);
        System.out.print("KDV'siz Fiyat :");
        fiyat=girdi.nextDouble();
        if (fiyat>1000) {
            oran=0.08;
        }
        else{
            oran=0.2;
        }
        double kdv=fiyat*oran;
        System.out.println("KDV Tutarı :" + kdv);
        total=fiyat+kdv;
        System.out.println("KDV'li Fiyat :" + total);

    }
}