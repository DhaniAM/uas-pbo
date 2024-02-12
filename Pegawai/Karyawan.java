package Pegawai;

public class Karyawan extends Pegawai implements Tunjangan {
  public Karyawan(boolean menikah, int jumlahAnak) {
    this.kode = "KRY";
    this.gajiPokok = 1500000;
    this.transport = 250000;
    this.lemburPerJam = 5000;
    this.tunjanganIstri = hitungTunjanganIstri(menikah);
    this.tunjanganAnak = hitungTunjanganAnak(jumlahAnak);
  }

  public int hitungTunjanganIstri(boolean menikah) {
    if (menikah) {
      return 200000;
    } else {
      return 0;
    }
  }

  public int hitungTunjanganAnak(int jumlahAnak) {
    if (jumlahAnak == 1) {
      return 60000;
    } else if (jumlahAnak > 1) {
      return 130000;
    } else {
      return 0;
    }
  }
}
