package praktikum_6.latihan;

public class OverloadingExample {

    // Metode untuk menjumlahkan dua bilangan bulat
    public int add(int a, int b) {
        return a + b;
    }

    // Metode untuk menjumlahkan tiga bilangan bulat
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Metode untuk menjumlahkan dua bilangan desimal
    public double add(double a, double b) {
        return a + b;
    }

    // method main
    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        // Memanggil metode add dengan dua argumen
        System.out.println("Jumlahkan 10 dan 20: " + example.add(10, 20));

        // Memanggil metode add dengan tiga argumen
        System.out.println("Jumlahkan 10, 20 dan 30: " + example.add(10, 20, 30));

        // Memanggil metode add dengan dua argumen desimal
        System.out.println("Jumlahkan 10.5 dan 20.5: " + example.add(10.5, 20.5));
    }
}

