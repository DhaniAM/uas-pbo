/*
 * Nama: Ramadhani Adjar Mustaqim
 * NIM : 210401120003
 * Kelas : IT-502
 * Mata Kuliah: Pemrograman Berbasis Objek
 */

import Pegawai.*;

public class Main {
  public static void main(String[] args) {
    Pegawai budi = new Supervisor(true, 2);
    Pegawai anton = new HRD(true, 3);
    Pegawai nisa = new Karyawan(false, 0);
    Pegawai lia = new Teknisi(true, 1);

    // Hari 1
    budi.presensiMasuk(7);
    anton.presensiMasuk(8);
    nisa.presensiMasuk(9);
    lia.presensiMasuk(6);

    budi.presensiKeluar(16);
    anton.presensiKeluar(15);
    nisa.presensiKeluar(14);
    lia.presensiKeluar(17);

    // Hari 2
    budi.presensiMasuk(7);
    anton.presensiMasuk(8);
    nisa.presensiMasuk(9);
    lia.presensiMasuk(6);

    budi.presensiKeluar(16);
    anton.presensiKeluar(14);
    nisa.presensiKeluar(18);
    lia.presensiKeluar(17);

    System.out.println("Gaji budi (" + budi.getKode() + ") : " + budi.hitungGaji());
    System.out.println("Gaji anton (" + anton.getKode() + ") : " + anton.hitungGaji());
    System.out.println("Gaji nisa (" + nisa.getKode() + ") : " + nisa.hitungGaji());
    System.out.println("Gaji lia (" + lia.getKode() + ") : " + lia.hitungGaji());
  }
}
