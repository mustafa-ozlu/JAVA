
public class Main {
    static int usAlma(int base,int exp){ //metot oluşturmak için türleri belirtiriz.
        int sonuc=1;
        for (int i=1;i<=exp;i++){
            sonuc *=base;
        }                       // EĞER metodda değer varsa
        return sonuc;           // return olmak zorunda
    }
    public static void main(String[] args) {
        int deneme=usAlma(3,4);
        System.out.println("3 üzeri 4 = "+deneme);

        System.out.println("5 üzeri 4= "+usAlma(5,4));
    }
}