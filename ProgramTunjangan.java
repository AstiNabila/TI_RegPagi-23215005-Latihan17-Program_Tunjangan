/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

import java.util.Scanner;

public class ProgramTunjangan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Membuat tampilan pembuka
        System.out.println("==========Program Tunjangan==========");
        
        // Meminta input gaji pokok
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();
        
        // Meminta input status pernikahan
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        String status = input.next();
        
        // Variabel untuk tunjangan
        double tunjangan = 0;
        
        // Mengecek status pernikahan
        if (status.equalsIgnoreCase("Menikah")) {
            // Jika sudah menikah, tunjangan 35% dari gaji pokok
            tunjangan = 0.35 * gajiPokok;
        }
        
        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;
        
        // Menampilkan hasil dengan format yang lebih terstruktur
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.printf("Gaji Pokok      : Rp %.0f\n", gajiPokok);
        System.out.printf("Tunjangan       : Rp %.0f\n", tunjangan);
        System.out.printf("Total Gaji      : Rp %.0f\n", totalGaji);
        System.out.println("\n(Developed by : Rizki Adam Kurniawan)");
        
        // Menutup input scanner
        input.close();
    }
}
