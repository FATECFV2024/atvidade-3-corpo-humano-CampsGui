package main.java;

public class main {
  public static void Main(String[] args) {
      CorpoHumano c1 = new CorpoHumano(70, 0.065f, 1.75f);

      c1.setMassa(2); 
      System.out.println("Massa: " + c1.getMassa());
      
      System.out.println("IMC: " + c1.calcularIMC());
  }
}