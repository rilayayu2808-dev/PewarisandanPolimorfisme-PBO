public class Silinder extends Lingkaran {
    private double tinggi;
    public Silinder(double t, double r, String w) {
        super(r, w); 
        this.tinggi = t;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    public double hitungVolume() {
        double luasAlas = hitungLuas();
        return luasAlas * this.tinggi;
    }

    @Override
    public void printInfo() {
        System.out.printf("Silinder warna %s, volume = %.1f\n", getWarna(), hitungVolume());
    }
}