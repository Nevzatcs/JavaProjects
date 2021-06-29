import java.util.Random;
import java.util.Scanner;

public class Secretary {
    Random random=new Random();
    Scanner scanner =new Scanner(System.in);
    private String name;
    private int price=3000;
    private int receipt_no=random.nextInt(20);

    public Secretary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int Price) {
        this.price = price;
    }

    public int getReceipt_no() {
        return receipt_no;
    }

    public void setReceipt_no(int receipt_no) {
        this.receipt_no = receipt_no;
    }
    void op_result(){
        String s="Kurs kayıt işleminiz sekreterimiz "+name+" tarafından işleme alınmıştır\n"
                + "Lütfen ilgili fatura numarasını muhasebe birimine iletiniz\n"
                + "Fatura numaranız:"+receipt_no;
        System.out.println(s);
    }

        public void printInfo (Secretary s){

            String giris = "Kurs kayıt birimine hoş geldiniz\n"
                    + "Ben bu kurstta sekreter biriminden sorumlu " + this.getName() + "\n"
                    + "Genel olarak kurs hakkında bilgi vermek gerekirse\n"
                    + "Java,Kotlin ve Scala olmak üzere üç tür kursumuz bulunmaktadır\n"
                    + "Kurs ücretleri sabit olup 3.000 TL'dir\n"
                    + "Kursumuza kabul edilmeniz için ücreti peşin ödemeniz gerekmektedir";
            System.out.println("////////////////////");
            System.out.println(giris);
            System.out.println("////////////////////");


        }
        public void checkInfo (Secretary s) throws InterruptedException {
            System.out.print("Lütfen kaydolmak istediğiniz kurs adını giriniz:");

            String course_name = scanner.nextLine();
            System.out.print("Lütfen kursa kaydolmak için muhasebeye yatıracağınız miktarı giriniz : ");
            int payment_price = scanner.nextInt();

            if (payment_price == s.getPrice()) {
                System.out.println("");
                s.op_result();
                Accounting m = new Accounting("Mehmet");
                m.assessment(s);

            } else {
                if (payment_price < 3000) {
                    System.out.println("Ücretin tamamını ödemediğiniz için başvurunuz reddedildi.");
                    return;
                } else {
                    System.out.println("Fazla ödeme yaptınız ! \n" +
                            "Paranızın üstü : " + (payment_price - 3000));
                    s.op_result();
                    Accounting m = new Accounting("Aslı");
                    m.assessment(s);
                }
            }
        }

}

