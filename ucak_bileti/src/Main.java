import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int tip,mesafe,yas;
        double fiyat=0.10,normalTutar,indirimli,gidisdonus;

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafe Giriniz(km)\t: ");
        mesafe= input.nextInt();
        if (mesafe<=0){
            System.out.println("Hatalı Veri Girdiniz!Pozitif Değer Olmalı");
            System.out.print("Mesafe Giriniz(km)\t: ");
            mesafe= input.nextInt();
        }
        System.out.print("Yaşınız Giriniz\t\t: ");
        yas= input.nextInt();
        if (yas<=0){
            System.out.println("Hatalı Veri Girdiniz!Pozitif Değer Olmalı");
            System.out.print("Yaşınız Giriniz\t\t: ");
            yas= input.nextInt();
        }
        System.out.println("Yolculuk Tipi Giriniz ");
        System.out.print("1 -> Tek Yön , 2 -> Gidiş Dönüş\t: ");
        tip= input.nextInt();

        if (tip>2 || tip<1){
            System.out.println("Hatalı Veri Girdiniz! ");
            System.out.print("1 -> Tek Yön , 2 -> Gidiş Dönüş\t: ");
            tip= input.nextInt();
        }
        normalTutar=mesafe*fiyat*tip;

        System.out.println("Normal Tutar = "+normalTutar+" TL");
        if (tip==2) {
            gidisdonus = normalTutar - (normalTutar * 0.2);
            System.out.println("Gidiş Dönüş İndirimli Tutar : "+gidisdonus+ " TL");
            if (yas < 12) {
                indirimli = gidisdonus * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                indirimli = gidisdonus - (gidisdonus * 0.1);
            } else if (yas > 65) {
                indirimli = gidisdonus - (gidisdonus * 0.3);
            } else {
                indirimli = gidisdonus;
            }
        }else{
            if (yas < 12) {
                indirimli = normalTutar * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                indirimli = normalTutar - (normalTutar * 0.1);
            } else if (yas > 65) {
                indirimli = normalTutar - (normalTutar * 0.3);
            } else {
                indirimli = normalTutar;
            }

            }
        System.out.println("Yaş İndirimli Tutar : "+indirimli+ " TL");
    }
}