package main.java;

public class CorpoHumano {
  private int massa;
  private double volume;
  private int densidade;
  private double altura;


  public CorpoHumano(int massa, double volume, int densidade, double altura) {
      this.massa = massa;
      this.volume = volume;
      this.altura = altura;
      this.densidade = densidade;
  }

  public int getMassa() {
      return massa;
  }

  public double getVolume() {
      return volume;
  }

  public double getAltura() {
      return altura;
  }

  public int getDensidade() {
      return densidade;
  }

  public void setMassa(int massa) {
      this.massa = massa;
  }

  public void setVolume(double volume) {
      this.volume = volume;
  }

  public void setAltura(double altura) {
      this.altura = altura;
  }

  public void setDensidade(int densidade) {
      this.densidade = densidade;
  }

  public double calcularIMC() {
      return massa / (altura * altura);
  }
}

