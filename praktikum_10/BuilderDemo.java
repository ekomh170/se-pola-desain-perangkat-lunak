package praktikum_10.latihan;

public class BuilderDemo {
   public static void main(String[] args) {
       CDBuilder cdBuilder = new CDBuilder();

       CDType sonyCD = cdBuilder.buildSonyCD();
       CDType samsungCD = cdBuilder.buildSamsungCD();

       System.out.println("Sony CD:");
       sonyCD.showItems();

       System.out.println("\nSamsung CD:");
       samsungCD.showItems();
   }
}

   
 
