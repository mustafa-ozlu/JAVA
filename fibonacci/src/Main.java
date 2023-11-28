import  java.util.Scanner;

public class Main {
    static int fibo(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(20));


    }
}

// 1 1 2 3 5 8 13 21
// kendisinden önceki 2 sayının toplamı
// f(1) = 1
// f(2) = 1
// f(3) = 1+1
// f(4) = 2+1
// f(5) = 2+3
// f(6) = 3+5
// f(n) =f(n-1)+f(n-2)