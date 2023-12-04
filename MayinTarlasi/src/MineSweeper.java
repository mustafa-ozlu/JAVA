import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int satirSayisi,sutunSayisi,size;
    int[][] map;
    int[][] board;
    boolean oyun=true;
    Random random=new Random();
    Scanner scan=new Scanner(System.in);

    MineSweeper(int satirSayisi,int sutunSayisi){
        this.satirSayisi=satirSayisi;
        this.sutunSayisi=sutunSayisi;
        this.map=new int[satirSayisi][sutunSayisi];
        this.board=new int[satirSayisi][sutunSayisi];
        this.size=satirSayisi*sutunSayisi;
    }
    public void run(){
        int row,col,basari=0;
        prepare();
    //    print(map);
        System.out.println("Oyun Başladı.");
        while (oyun){
            print(board);
            System.out.print("Satır :");
            row= scan.nextInt();
            System.out.print("Sütun :");
            col= scan.nextInt();

            if (row<0 || row>=satirSayisi){
                System.out.println("Geçersiz koordinat !!!");
                continue;
            }
            if (col<0 || col>=sutunSayisi){
                System.out.println("Geçersiz koordinat !!!");
                continue;
            }
            if (map[row][col] !=-1){
                checking(row,col);
                basari++;
                if (basari==size-(size/4)){
                    System.out.println("Başardınız...");
                    System.out.println("Hiç Mayına Basmadınız.");
                    break;
                }
            }else{
                oyun=false;
                System.out.println("Oyun Bitti !!!");
            }

        }

    }
    public  void checking(int r,int c) {
        if (board[r][c] == 0) {
            if ((c<sutunSayisi-1)&& (map[r][c+1]==-1)){
                board[r][c]++;
            }
            if ((r<satirSayisi-3)&&(map[r+1][c]==-1)){
                board[r][c]++;
            }
            if((c>0)&&map[r][c-1]==-1){
                board[r][c-1]++;
            }
            if((r>0)&&map[r-1][c]==-1){
                board[r][c]++;
            }
            if (board[r][c]==0){
                board[r][c]=-2;
            }

        }
    }
    public void prepare(){
        //rastgele mayın yerleştircez.
        int randomSatir,randomSutun,count=0;
        while (count !=(size/4)){
            randomSatir=random.nextInt(satirSayisi);
            randomSutun=random.nextInt(sutunSayisi);
            if (map[randomSatir][randomSutun] !=-1){
                map[randomSatir][randomSutun] =-1;
                count++;
            }
        }
    }
    public void print(int[][] arr){
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }

            System.out.println();
        }
    }
}
