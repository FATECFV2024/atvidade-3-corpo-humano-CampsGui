package main.java;

public class App {
    public static void main (String[] args) throws Exception{
        CorpoHumano c1 = new CorpoHumano(0, 0, 0, 0);
        
        // Teste de atribuição direta
        // c1.massa = "2"; // Ocorre erro de compilação, pois massa é privado

        // Alterando Massa para public
        // Se Massa for public, você poderá acessá-lo diretamente:
        // c1.massa = "2"; // Isso geraria um erro de compilação, pois a String não está sendo convertida para int.

        // Alterando setVolume para private
        // Se setVolume for private, você não poderá alterar o volume fora da classe CorpoHumano:
        // c1.setVolume(110); // Isso resultaria em um erro de compilação.

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
