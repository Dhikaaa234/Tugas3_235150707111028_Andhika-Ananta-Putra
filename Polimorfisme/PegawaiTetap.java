public class PegawaiTetap extends Pegawai {
    private double upah; 

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        setUpah(upah);
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public double earnings() {
        return getUpah();
    }

    public double gaji() {
        return getUpah();
    }

    public String toString() {
        return String.format("Pegawai Tetap\t " + super.toString() + "\nUpah\t\t: %.1f", getUpah());
    }
}
