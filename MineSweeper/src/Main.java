package MineSweeper;
import java.util.Scanner;
// Mayın Tarlası
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row, col;

        System.out.print("Oyunun satır sayısını giriniz : ");
        row = input.nextInt();

        System.out.print("Oyunun sütun sayısını giriniz : ");
        col = input.nextInt();

        MineSweeper mine = new MineSweeper(row,col);
        mine.run();
    }
}
