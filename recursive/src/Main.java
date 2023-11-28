
public class Main {
    static int f(int n){
        int result=0;

        for (int i=1;i<=n;i++){
            result +=i;
        }
        return result;
    }
    static int recursive(int n){
        if (n==1){
            return 1;
        }
        return recursive(n-1)+n;
    }
    public static void main(String[] args) {

        System.out.println(f(3));
        // f(3) = 1+2+3
        System.out.println(recursive(3));
        // recursive(3)=recursive(2)+3
        // recursive(2)=recursive(1)+2
        // recursive(1)=1
    }
}