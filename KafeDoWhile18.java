import java.util.Scanner;

public class KafeDoWhile18{
    public static void main (String [] args ){
        Scanner SC = new Scanner(System.in);

        int kopi,teh;
        int roti;
        int hargakopi = 12000;
        int hargteh=7000;
        int hargaroti=20000;
        String NamaPelanggan;
        double totalharga;

     
       
        do {
            System.out.print("masukkan nama pelanggan (ketik'batal' untuk keluar)");
            NamaPelanggan = SC.nextLine();
            if (NamaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("Jumlah Kopi: ");
            kopi= SC.nextInt();
            System.out.println("Jumlah Teh");
            teh = SC.nextInt();
            System.out.println("Jumlah Roti");
            roti = SC.nextInt();

            totalharga = (kopi * hargakopi) + (teh * hargteh) + (roti *hargaroti);
            System.out.println("Total yang Harus Dibayar : Rp" + totalharga);
            SC.nextLine();
        } while (true);

      System.out.println("Semua transaksi dibatalkan");
    }
}