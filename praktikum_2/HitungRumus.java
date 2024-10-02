public class HitungRumus {

    public static void main(String[] args) {
        // Deklarasi variabel
        String newLine = System.lineSeparator();
        String nim = "0110223079";
        String nama = "Eko Muchamad Haryono";

        // Melakukan Penyesuaian Variabel Terhadap Rumus 
        int a = 1000;
        int b = 2000;

        // double y = 60 * Math.PI / 180; // Sudut dalam radian = 60 derajat = π/3 radian
        double y = Math.PI / 3;

        // Menghitung nilai c berdasarkan rumus c = √(a^2 + b^2 - 2ab * cos(γ))
        double hasilrumus = hitungRumus(a, b, y);

        tampilkanIdentitas(nama, nim, newLine);
        // Menampilkan hasil
        System.out.println("Nilai hasil perhitungan rumus yang diminta adalah: " + hasilrumus);
    }

    public static double hitungRumus(int a, int b, double y) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(y));
    }

    public static void tampilkanIdentitas(String nama, String nim, String newLine) {
        System.out.println("Perkenalkan Nama Saya Adalah: " + nama);
        System.out.println("NIM Saya Yaitu: " + nim + newLine);
    }
}
