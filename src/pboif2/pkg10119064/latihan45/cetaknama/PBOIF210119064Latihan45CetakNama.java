/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan45.cetaknama;

import java.util.Scanner;
import model.Printer;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program mencetak nama sebanyak
 * jumlah cetak yang dimasukkan oleh user
 */
public class PBOIF210119064Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisialisasi objek Printer
        Printer printer = new Printer();
        
        //input
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(keyboard.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(keyboard.nextInt());
        
        //output1
        printer.cetak(printer.getNama());
        
        //output2
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
