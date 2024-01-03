// Source code is decompiled from a .class file using FernFlower decompiler.
// Nama : Salman Miftahur Rizki
// NIM  : 22205062
public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Manager manager = new Manager("Alberth");
      Developer developer = new Developer("Lisa Blackpink");
      Designer designer = new Designer("Jihyo");
      manager.work();
      developer.work();
      designer.work();
   }
}