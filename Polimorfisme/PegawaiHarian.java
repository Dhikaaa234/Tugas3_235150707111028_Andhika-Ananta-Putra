public class PegawaiHarian extends Pegawai {
    private double upahPerJam; 
    private int totalJam; 

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double earnings() {
        if (getTotalJam() <= 40)
            return getUpahPerJam() * getTotalJam();
        else
            return 40 * getUpahPerJam() + (getTotalJam() - 40) * getUpahPerJam() * 1.5;
    }

    public double gaji() {
        return earnings(); 
    }

    public String toString() {
        return String.format("Pegawai Harian\t " + super.toString() + "\nUpah/jam\t: %.1f\nTotal jam kerja\t: %d", getUpahPerJam(), getTotalJam());
    }
}