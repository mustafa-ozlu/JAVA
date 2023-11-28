import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int k;
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k= input.nextInt();

        for (int i=1;i<=k; i++){
          //  System.out.print(i); //tüm sayıları yazdırdık
            if (i %2==0){
                System.out.println(i); //çift sayıları yazdırdık
            }
        }

    }
}