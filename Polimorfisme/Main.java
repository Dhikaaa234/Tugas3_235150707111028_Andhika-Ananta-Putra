public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Ruby", "02345666576", 3000000);
        PegawaiHarian pegawaiHarian = new PegawaiHarian("Minji", "02345666777", 50000, 45);
        Sales sales = new Sales("Hanni", "02345655576", 50, 20000);
        
        System.out.println(pegawaiTetap.toString());
        System.out.printf("Pendapatan\t: Rp. %.0f\n\n", pegawaiTetap.gaji());

        System.out.println(pegawaiHarian.toString());
        System.out.printf("Pendapatan\t: Rp. %.0f\n\n", pegawaiHarian.gaji());

        System.out.println(sales.toString());
        System.out.printf("Pendapatan\t: Rp. %.0f\n\n", sales.gaji());
    }
}
