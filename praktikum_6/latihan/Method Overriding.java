package praktikum_6.latihan;

// Kelas dasar
class Animal {
    void sound() {
        System.out.println("Suara Hewan: ");
    }
}

// Kelas turunan
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Kelas turunan lainnya
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Kelas utama
public class OverridingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Membuat objek Dog
        Animal myCat = new Cat(); // Membuat objek Cat

        myDog.sound(); // Memanggil metode sound() untuk Dog
        myCat.sound(); // Memanggil metode sound() untuk Cat
    }
}

