package Pegawai;

public class Teknisi extends Pegawai implements Tunjangan {
  public Teknisi(boolean menikah, int jumlahAnak) {
    this.kode = "TKN";
    this.gajiPokok = 3000000;
    this.transport = 500000;
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
      return 75000;
    } else if (jumlahAnak > 1) {
      return 150000;
    } else {
      return 0;
    }
  }
}
