public class Tabuada {

    public static void main(String[] args) {
        // Cálculo da tabuada de um número
        
        int numero = 5; 
       
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + (numero * (i + 1)));
        }
    }
}
