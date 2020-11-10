/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Menampilkan Tabungan
 */
public class PBOIF210119077Latihan42Tabungan {

    
    public static void main(String[] args) {
        int jumlah;
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan objTabungan = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = objTabungan.ambilUang(input.nextInt());
        
        System.out.println("Saldo Anda Sekarang : "+jumlah);
    }
    
}
