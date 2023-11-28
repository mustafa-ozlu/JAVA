import  java.util.Scanner;
public class Main {
    static String asal(int n){
        int i;
        for (i=2;i<=n-1;i++){
            if (n %i ==0){
                return n+ " Sayısı ASAL Değildir";
            }
        }
        if (i==n){
            return n+ " Sayısı ASALDIR";
        }
        return n+ " Sayısı ASAL Değildir";
    }

    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n= input.nextInt();
        System.out.println(asal(n));
    }
}