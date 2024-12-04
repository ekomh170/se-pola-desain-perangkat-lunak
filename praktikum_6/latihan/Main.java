package praktikum_6.latihan;

// Mendefinisikan antarmuka
interface Animal {
    void makeSound(); // metode abstrak
}

// Kelas yang mengimplementasikan antarmuka
class Dog implements Animal {
    @Override 
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // membuat objek Dog
        Animal myCat = new Cat(); // membuat objek Cat

        myDog.makeSound(); // Memanggil metode makeSound untuk Dog
        myCat.makeSound(); // Memanggil metode makeSound untuk Cat
    }
}
