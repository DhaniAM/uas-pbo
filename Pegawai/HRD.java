package Pegawai;

public class HRD extends Pegawai implements Tunjangan {
  public HRD(boolean menikah, int jumlahAnak) {
    this.kode = "HRD";
    this.gajiPokok = 5000000;
    this.transport = 750000;
    this.lemburPerJam = 7500;
    this.tunjanganIstri = hitungTunjanganIstri(menikah);
    this.tunjanganAnak = hitungTunjanganAnak(jumlahAnak);
  }

  public int hitungTunjanganIstri(boolean menikah) {
    if (menikah) {
      return 250000;
    } else {
      return 0;
    }
  }

  public int hitungTunjanganAnak(int jumlahAnak) {
    if (jumlahAnak == 1) {
      return 90000;
    } else if (jumlahAnak > 1) {
      return 190000;
    } else {
      return 0;
    }
  }
}
