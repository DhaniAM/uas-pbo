package Pegawai;

public class Supervisor extends Pegawai implements Tunjangan {
  public Supervisor(boolean menikah, int jumlahAnak) {
    this.kode = "SPV";
    this.gajiPokok = 10000000;
    this.transport = 1000000;
    this.lemburPerJam = 10000;
    this.tunjanganIstri = hitungTunjanganIstri(menikah);
    this.tunjanganAnak = hitungTunjanganAnak(jumlahAnak);
  }

  public int hitungTunjanganIstri(boolean menikah) {
    if (menikah) {
      return 300000;
    } else {
      return 0;
    }
  }

  public int hitungTunjanganAnak(int jumlahAnak) {
    if (jumlahAnak == 1) {
      return 100000;
    } else if (jumlahAnak > 1) {
      return 200000;
    } else {
      return 0;
    }
  }
}
