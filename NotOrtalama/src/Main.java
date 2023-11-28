import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fzk,kimya,tarih,turkce,mzk;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notu\t:");
        mat=input.nextInt();
        System.out.print("Fizik Notu\t\t:");
        fzk=input.nextInt();
        System.out.print("Kimya Notu\t\t:");
        kimya=input.nextInt();
        System.out.print("Tarih Notu\t\t:");
        tarih=input.nextInt();
        System.out.print("Türkçe Notu\t\t:");
        turkce=input.nextInt();
        System.out.print("Müzik Notu\t\t:");
        mzk=input.nextInt();

        double ortalama=(mat+fzk+kimya+tarih+turkce+mzk)/6;
        System.out.println("Not Ortalamanız\t:" + ortalama);

        String basari=ortalama>=60 ? "Sınıfı Geçtiniz,Tebrikler" : "Sınıfta Kaldınız";
        System.out.println(basari);

    }
}