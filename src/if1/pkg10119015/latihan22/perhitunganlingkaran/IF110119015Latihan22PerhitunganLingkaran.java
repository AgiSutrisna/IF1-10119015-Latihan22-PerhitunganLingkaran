/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double diameter, jarijari, luas, keliling = 0;
        final double PHI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukan nilai diameter lingkaran : ");
        while(true) {
            try{
                diameter = Double.parseDouble(scanner.next());
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukan nilai diameter lingkaran : ");
                continue;
            }
        }
        jarijari = diameter / 2; 
        luas = PHI * jarijari * jarijari;
        keliling = PHI * diameter;
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran\t= %.2f%n", jarijari);
        System.out.printf("Luas Lingkaran\t\t= %.2f%n", luas);
        System.out.printf("Keliling Lingkaran\t= %.2f%n", keliling);
    }
    
}
