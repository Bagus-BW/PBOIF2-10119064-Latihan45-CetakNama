/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program mencetak nama sebanyak
 * jumlah cetak yang dimasukkan oleh user
 */
public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama Anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak :");
        for (int i = 0; i < jmlCetak; i++) {
            System.out.println((i+1) + ". " + nama);
        }
    }
    
    
}
