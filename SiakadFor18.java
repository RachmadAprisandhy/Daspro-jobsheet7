import java.util.Scanner;

public class SiakadFor18{

    public static void main (String [] args){
        Scanner sc18 = new Scanner(System.in);

        double nilai,tertinggi = 0;
        double terendah = 100;
        int lulus=0,tidaklulus=0;

        for(int i=1;i<=10; i++){
            System.out.print("masukkan nilai mahasiswa ke- "+ i +":");
            nilai = sc18.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if(nilai < terendah){
                terendah = nilai;
            }
            if (nilai >= 60){
                lulus++;
            }else {
                tidaklulus++;
        }
       // if (nilai >= 60){
         //   lulus++;
       // }else {
       //     tidaklulus++;
        }
        System.out.println("nilai tertinggi: " + tertinggi);
        System.out.println("nilai terendah: " + terendah);
        System.out.println("jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("jumlah mahasiswa yang tidak lulus: " + tidaklulus);
    }
}