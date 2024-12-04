package praktikum_10;

public class BuilderDemo {
    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();

        CDType polytronCD = cdBuilder.buildPolytronCD();

        System.out.println("\nPolytron CD:");
        polytronCD.showItems();
    }
}



