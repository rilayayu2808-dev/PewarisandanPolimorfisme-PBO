public class Main {
    public static void main(String[] args) {
        Bentuk[] objekBentuk = {
            new Bentuk("Merah"),
            new BujurSangkar(5.0, "Biru"),
            new Lingkaran(7.0, "Hijau"),
            new Silinder(10.0, 7.0, "Kuning")
        };
        for (Bentuk b : objekBentuk) {
            b.printInfo();
        }
    }
}