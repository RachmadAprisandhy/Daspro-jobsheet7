import java.util.Scanner;

public class Tugas2JB7{
    public static void main (String [] args){
        Scanner in18 = new Scanner(System.in);

        int jenis,durasi,Total=0;

        System.out.println("===== parkirin corp =====");
        System.out.println("kode untuk kendaraan adalah 1(mobil),2(motor),0(keluar)");
        

        do {
            System.out.println("masukkan jenis kendaraan : ");
            jenis = in18.nextInt();
            if (jenis ==0){
                break;
            }
            if (jenis == 1|| jenis ==2){
                System.out.println("masukkan durasi parkir : ");
                durasi = in18.nextInt();
                if ( durasi > 5){
                    Total += 12500;
                }else{
                    if (jenis == 1){
                        Total += durasi * 3000;
                    }else if( jenis == 2){
                        Total += durasi * 2000;
                    }
                }
                System.out.println("Kendaraan jenis"+ jenis + " telah terparkir selama " +  durasi  + " jam");
                System.out.println("total biaya parkir kendaraan adalah" + Total);
                
            }
        
        } while (true);

        in18.close();
    }
}