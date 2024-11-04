/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 */
public class target_saldotabungan {
     public static void main(String[] args) {
        double saldoAwal = 3500000;  // Saldo awal
        double bunga = 0.08;         // Bunga per bulan (8%)
        double saldoTarget = 6000000; // Saldo target
        int bulan = 0;               // Counter bulan

        // Loop hingga saldo mencapai atau melebihi target
        while (saldoAwal < saldoTarget) {
            bulan++;  // Tambah 1 bulan setiap iterasi
            saldoAwal += saldoAwal * bunga;  // Hitung saldo baru
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldoAwal);
        }
    }
}
