package Pegawai;

public abstract class Pegawai {
  protected String kode;
  protected int gajiPokok;
  protected int transport;
  protected int lemburPerJam;
  protected int tunjanganIstri;
  protected int tunjanganAnak;
  protected int totalLembur;

  public String getKode() {
    return this.kode;
  }

  public void presensiMasuk(int jamMasuk) {
    if (jamMasuk > 7 && jamMasuk < 16) {
      this.gajiPokok = this.gajiPokok - (100000 * (jamMasuk - 7));
    }
  }

  public void presensiKeluar(int jamKeluar) {
    if (jamKeluar < 16 && jamKeluar > 7) {
      this.gajiPokok = this.gajiPokok - (100000 * (16 - jamKeluar));
    }

    if (jamKeluar > 16 && jamKeluar < 24) {
      int totalJamLembur = jamKeluar - 16;
      this.totalLembur += (totalJamLembur * this.lemburPerJam);
    }
  }

  public int hitungGaji() {
    return this.gajiPokok + this.transport + this.tunjanganIstri + this.tunjanganAnak + this.totalLembur;
  }
}

interface Tunjangan {
  int hitungTunjanganIstri(boolean menikah);

  int hitungTunjanganAnak(int jumlahAnak);
}
