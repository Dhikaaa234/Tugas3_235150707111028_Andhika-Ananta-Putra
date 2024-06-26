public abstract class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return String.format("\nNama\t\t: %s\nNo. KTP\t\t: %s", getNama(), getNoKTP());
    }

    public abstract double gaji(); 
}
