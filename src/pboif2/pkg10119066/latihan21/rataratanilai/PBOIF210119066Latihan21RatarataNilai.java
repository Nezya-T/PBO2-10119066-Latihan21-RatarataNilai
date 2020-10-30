/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119066.latihan21.rataratanilai;
import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBOIF210119066Latihan21RatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        double mhs = scanner.nextDouble();
        double nilai = 0;
        for (int i = 1 ; i <= mhs; i++){
            System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
            nilai = nilai +scanner.nextDouble();
        
        }
        double rata;
            rata = nilai / mhs;
            System.out.println("Maka, Rata-rata Nilainya adalah : "+ rata);
            System.out.println("(Developed by : Nezya Tariska)");
                
            
    }
    
}
