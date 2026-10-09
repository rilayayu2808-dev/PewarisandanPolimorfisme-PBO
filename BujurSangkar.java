public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double ukuranSisi, String warnaBentuk) {
        super(warnaBentuk); 
        this.sisi = ukuranSisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double nilaiSisi) {
        this.sisi = nilaiSisi;
    }

    public double hitungLuas() {
        return Math.pow(this.sisi, 2);
    }

    @Override
    public void printInfo() {
        System.out.printf("Bujursangkar berwarna %s, luas = %.1f\n", getWarna(), hitungLuas());
    }
}