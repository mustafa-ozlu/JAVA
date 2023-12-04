import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mayın Tarlasına Hoşgeldiniz...");
        System.out.println("Oynamak için boyut giriniz.");

        Scanner input=new Scanner(System.in);
        int satir,sutun;
        System.out.print("Satır Sayısı\t: ");
        satir= input.nextInt();
        System.out.print("Sütun Sayısı\t: ");
        sutun= input.nextInt();

        MineSweeper mayinTarlasi=new MineSweeper(satir,sutun);
        mayinTarlasi.run();
    }
}