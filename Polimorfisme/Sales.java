public class Sales extends Pegawai {
    private int penjualan; 
    private double komisi; 

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double earnings() {
        return getPenjualan() * getKomisi();
    }

    public double gaji() {
        return earnings();
    }

    public String toString() {
        return String.format("Sales\t\t " + super.toString() + "\nTotal Penjualan\t: %d \nBesaran Komisi\t: %.1f", getPenjualan(), getKomisi());
    }
}


