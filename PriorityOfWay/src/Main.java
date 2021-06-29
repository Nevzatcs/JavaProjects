import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Vehicle> pqlist = new PriorityQueue<>();
        String s = "Sürücü adı ve araç türünü giriniz\n"
                + "Araç Türleri:Kargo,Polis,Itfaiye veya Ambulans olabilir";
        System.out.println(s);
        while (pqlist.size() < 4) {
            System.out.print("Sürücü adı:");
            String name = scanner.nextLine();
            System.out.print("Araç türü:");
            String vehicleType = scanner.nextLine();
            pqlist.add(new Vehicle(name, vehicleType));
        }
        int sort = 1;
        while (!pqlist.isEmpty()) {
            System.out.println("");
            System.out.println("Aracın trafikteki geçiş üstünlüğü sıralaması:" + sort);
            System.out.println(pqlist.poll());
            sort++;
        }
    }
}
