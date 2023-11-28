import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int min=0,maks=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Kaç sayı girilecek \t: ");
        int sayi=input.nextInt();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= sayi; i++) {

            System.out.print(i+".Sayıyı Girin \t\t: ");
            int sayilar=input.nextInt();

            if (i==1){
                min=sayilar;
                maks=sayilar;
            }
            if (sayilar>maks){
                maks=sayilar;
            }
            if (sayilar<min){
                min=sayilar;
            }

        }
        System.out.println("En Büyük Sayı \t\t: "+maks);
        System.out.println("En Küçük Sayı \t\t: "+min);
    }
}