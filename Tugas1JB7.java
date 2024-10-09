import java.util.Scanner;

public class Tugas1JB7{
    public static void main (String [] args ){
        Scanner bioskop18 = new Scanner(System.in);

        int hargaTiket= 50000,totalpenjualan = 0,jumlahtiket=0,tiket;
        double diskon =0 ;

       


         do{
            System.out.println("========== The Charlemagne Cinema ==========");
            System.out.println("Masukkan tiket banyak tiket yang terjual : ");       
            System.out.println("Masukkan '-6' untuk menutup ");
            tiket = bioskop18.nextInt();
            if (tiket == -6){
                break;
            }
            if (tiket<0 ){
                System.out.println("masukkan jumlah tiket yang benar");
                continue;
            }
            if (tiket>4){
                diskon = 0.1 ;
            }else if (tiket>10){
                diskon =0.15 ;
            
            }
            int totalharga =(int) (tiket * hargaTiket * (1- diskon)); 
            jumlahtiket += tiket;
            totalpenjualan += totalharga;

            System.out.println("Total tiket Yang Terjual Adalah = " + jumlahtiket);
            System.out.println("uang yang didapat dari penjualan tiket sebesar = Rp. " + totalpenjualan);
         } while(true);

    }
}