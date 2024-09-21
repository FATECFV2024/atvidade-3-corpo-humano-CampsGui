package main.java;

public class CorpoHumano {
  private float massa;
  private float volume;
  private double altura;
  private float densidade;

  public CorpoHumano(float massa, float volume, double altura, float densidade) {
      this.massa = massa;
      this.volume = volume;
      this.altura = altura;
      this.densidade = densidade;
  }

  public float getMassa() {
      return massa;
  }

  public float getVolume() {
      return volume;
  }

  public double getAltura() {
      return altura;
  }

  public float getDensidade() {
      return densidade;
  }

  public void setMassa(float massa) {
      this.massa = massa;
  }

  public void setVolume(float volume) {
      this.volume = volume;
  }

  public void setAltura(double altura) {
      this.altura = altura;
  }

  public void setDensidade(float densidade) {
      this.densidade = densidade;
  }

  public double calcularIMC() {
      return massa / (altura * altura);
  }
}

