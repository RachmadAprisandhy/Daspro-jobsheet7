import java.util.Scanner;

public class SiakadWhile18{

    public static void main (String[]args){
        Scanner sc18 = new Scanner(System.in);

        int nilai,jumlah,i=0;

        System.out.print("masukkan jumlah mahasiswa");
        jumlah = sc18.nextInt();

        while (i<jumlah){
            System.out.println("Masukkan nilai mahasiswa ke-" +(i+1) +":");
            nilai = sc18.nextInt();

            if(nilai <0 || nilai > 100){
                System.out.println("nilai tidak valid,masukkan kembali nilai yang valid");
                continue;
            }
            if(nilai>80 && nilai <=100){
                System.out.println("nilai Mahasiswa ke-"+ (i+1)+ "adalah A");
                System.out.println("Bagus Pertahankan nilai anda");
            }else if(nilai>73 && nilai <=80){
                System.out.println("nilai mahasiswa ke -" + (i+1) + "adalah B+");
            }else if (nilai>65 && nilai<=73){
                System.out.println("nilai mahasiswa ke -" + (i+1) + "adalah B");
            }else if (nilai>60 && nilai<=65){
                System.out.println("nilai mahasiswa ke -" + (i+1) + "adalah C+");
            }else if (nilai>50 && nilai<=60){
                System.out.println("nilai mahasiswa ke -" + (i+1) + "adalah C");
            }else if (nilai>39 && nilai<=50){
                System.out.println("nilai mahasiswa ke -" + (i+1) + "adalah D");
            }else{
                System.out.println("nilai mahasiswa ke -" + (i+1) + "adalah E");
            }
                
            i++;
        }
    }
}