package program.kasir;
import java.util.Scanner;
public class ProgramKasir {
    public static void main(String[] args) {
         //deklarasi variabel
        double dibeli,harga,Total,Diskon,JumlahUang,TotalAkhir,Kembalian;
        
        Scanner input = new Scanner(System.in);
        //assignment 
        System.out.println("Program Kasir Sederhana");
        
        System.out.print("Masukkan Jumlah Beras (kg) = ");
        dibeli = input.nextDouble();
        
        System.out.print("Masukkan Harga Satuan (kg) = Rp");
        harga = input.nextDouble();
        
        Total = dibeli*harga;
        System.out.println("Total       = Rp"+Total);
        
        Diskon = Total*5/100;
        System.out.println("Diskon 5%   = Rp"+Diskon);
        
        TotalAkhir = Total-Diskon;
        System.out.println("Total Akhir = Rp"+TotalAkhir);
        
        System.out.println("Masukkan Uang");
        System.out.print("Rp");
        JumlahUang = input.nextDouble();
        
        Kembalian = JumlahUang-TotalAkhir;
        System.out.println("Kembalian   = Rp"+Kembalian);
    
    }
    
}
