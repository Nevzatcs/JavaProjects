import java.util.Scanner;

public class Accounting {
    private String name;

    public Accounting(String name) {
        this.name = name;
    }
    public void assessment(Secretary s) throws InterruptedException{
        while(true){
            Scanner scanner=new Scanner(System.in);
            int invoice_no;
            String a="Merhaba ben " + this.name +" bu kursun muhasebesinden sorumluyum\n"
                    + "Lütfen kayıt işlemini tamamlamak için fatura numarasını giriniz : ";
            System.out.print(a);
            invoice_no=scanner.nextInt();
            if(invoice_no==s.getReceipt_no()){
                System.out.println("");
                System.out.println("Fatura numarası kontrol ediliyor...");
                Thread.sleep(3000);
                String message="Fatura numaranız"
                        + " kontrol edildi ve doğru olduğu saptandı\n"
                        + "Kursumuza hoş geldiniz...";
                System.out.println(message);
                return;
            }
            else {
                System.out.println("");
                System.out.println("Fatura numarası kontrol ediliyor...");
                Thread.sleep(3000);
                String message="Fatura numarası"
                        + " kontrol edildi ve yanlış olduğu saptandı.\n"
                        + "Lütfen fatura numarasını tekrar giriniz !";
                System.out.println(message);
            }
        }
    }
}
