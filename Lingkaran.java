public class Lingkaran extends Bentuk {
    public static final double PHI = 3.14;
    private double radius;
    public Lingkaran(double r, String warnaPilihan) {
        super(warnaPilihan);
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double hitungLuas() {
        return PHI * (this.radius * this.radius);
    }

    @Override
    public void printInfo() {
        System.out.print("Lingkaran " + getWarna() + ", luas = " + hitungLuas() + "\n");
    }
}