// Instance Variable
public class Mahasiswa2 {
    // Deklarasi Variabel Dibawah : String names
    public String names;

    // Fungsi Di Java Dibawah : Constructor
    public Mahasiswa2() {
        this.names = "Eko Muchamad Haryono";
    }   

    // Fungsi Di Java Dibawah : Main
    public static void main(String[] args) {
        Mahasiswa2 name = new Mahasiswa2();
        System.out.println("Nama Mahasiswa itu adalah " + name.names);
    }

}