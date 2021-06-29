package MineSweeper;
import java.util.Random;
import java.util.Scanner;
//Mayın Tarlası
public class MineSweeper {
    int rowNumber, colNumber,size;
    int[][] map;
    int[][] board;
    boolean game =true;

    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.map = new int [rowNumber][colNumber];
        this.board = new int [rowNumber][colNumber];
        this.size=rowNumber*colNumber;
    }
    public void run(){
        int row, col;
        int success=0;
        prepareGame();
        print(map);
        System.out.println("Oyun Başladı !");
        while(game){
            print(board);
            System.out.print("Satır Giriniz : ");
            row = input.nextInt();
            System.out.print("Sütun Giriniz :  ");
            col = input.nextInt();
            if(row < 0 || row > rowNumber){
                System.out.println("Geçersiz koordinat !");
                continue;
            }
            if(col < 0 || col >= colNumber){
                System.out.println("Geçersiz koordinat !");
                continue;
            }
            if(map[row][col] != -1){
                checkMine(row, col);
                success++;
                if(success == (size- (size /4))){
                    System.out.println("Oyunu Kazandınız !");
                    break;
                }
            }else{
                game = false;
                System.out.println("Game Over !");
            }
        }
    }
    public void prepareGame(){
        int genRandRow, genRandCol;
        int count =0;
        System.out.println("Mayınların Konumu");
        while(count != (size /4)){
            genRandRow = rand.nextInt(rowNumber);
            genRandCol = rand.nextInt(colNumber);
            if(map[genRandRow][genRandCol] != -1){
                map[genRandRow][genRandCol] =-1;
                count++;
            }
        }
    }
    public void print(int[][] arr){
        for(int i=0; i < arr.length ; ++i){
            for(int j = 0; j < arr[0].length; ++j){
                if(arr[i][j] >=0)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void checkMine(int r, int c) {
        if (map[r][c] == 0) {
            if ((c < colNumber-1) && map[r][c + 1] == -1) {
                board[r][c]++;
            }
            if ((r < rowNumber-1) && map[r + 1][c] == -1) {
                board[r][c]++;
            }
            if ((r > 0)&&map[r - 1][c] == -1) {
                board[r][c]++;
            }
            if ((c > 0 ) && map[r][c - 1] == -1) {
                board[r][c]++;
            }
            if ((r > 0) && (c < colNumber-1)&& map[r-1][c + 1] == -1) {
                board[r][c]++;
            }
            if ((r < rowNumber-1) && (c < colNumber-1) && map[r + 1][c + 1] == -1) {
                board[r][c]++;
            }
            if ((r > 0)&& (r < rowNumber-1) && c>0 && map[r - 1][c-1] == -1  ) {
                board[r][c]++;
            }
            if ((r < rowNumber-1) &&c >0 && map[r+1][c - 1] == -1) {
                board[r][c]++;
            }
            if(board[r][c] == 0)
                board[r][c] =-2;
        }
    }
}
