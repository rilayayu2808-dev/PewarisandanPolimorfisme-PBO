public class Bentuk {
    private String warna;
    
    public Bentuk(String w) {
        this.warna = w;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warnaBaru) {
        this.warna = warnaBaru;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + getWarna());
    }
}