
public class HitungRumus {
    public static void main(String[] args) {
        // Deklarasi Variabel
        int a = 5;
        double b = 4;
        double y = 30;

         // Menghitung menggunakan rumus
        double hasil = Math.sqrt((a * 2) + (b * 2) - (2 * a * b * Math.cos(y)));

        // Menampilkan hasil
        System.out.println("Nilai Hasil adalah: " + hasil);
    }
}
