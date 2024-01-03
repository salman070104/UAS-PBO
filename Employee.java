// Source code is decompiled from a .class file using FernFlower decompiler.
// Nama : Salman Miftahur Rizki
// NIM  : 22205062
public class Employee {
   private String name;

   public Employee(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void work() {
      System.out.println("Employee " + this.name + " is working :)");
   }
}
