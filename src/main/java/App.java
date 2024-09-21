package main.java;

public class App {
    public static void main (String[] args) throws Exception{
        CorpoHumano c1 = new CorpoHumano(0, 0, 0, 0);
        c1.setMassa(90);
        c1.setAltura(1.90);
        c1.setVolume(110);
        c1.setDensidade(400);
        System.out.println("Massa: " + c1.getMassa());
        System.out.println("Altura: " + c1.getAltura());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println("Densidade: " + c1.getDensidade());
        
        System.out.println("IMC: " + c1.calcularIMC());
}
}
