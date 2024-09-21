package main.java;

public class CorpoHumano {
  private float massa;
  private float volume;
  private float altura;

  public CorpoHumano(float massa, float volume, float altura) {
      this.massa = massa;
      this.volume = volume;
      this.altura = altura;
  }

  public float getMassa() {
      return massa;
  }

  public float getVolume() {
      return volume;
  }

  public float getAltura() {
      return altura;
  }

  public void setMassa(float massa) {
      this.massa = massa;
  }

  public void setVolume(float volume) {
      this.volume = volume;
  }

  public void setAltura(float altura) {
      this.altura = altura;
  }

  public float calcularIMC() {
      return massa / (altura * altura);
  }
}

