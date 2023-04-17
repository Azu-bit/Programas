import java.util.Scanner;

public class Piezas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso;
        int entre = 0;
        int mas = 0;
        int menos = 0;
        int total = 0;
        
        System.out.print("Introduce el peso de las piezas (en kilogramos) o 0 para terminar: ");
        peso = scanner.nextDouble();
        
        while (peso != 0) {
            if (peso >= 9.8 && peso <= 10.2) {
                entre++;
            } else if (peso > 10.2) {
                mas++;
            } else {
                menos++;
            }
            total++;
            
            System.out.print("Introduce el peso de las piezas (en kilogramos) o 0 para terminar: ");
            peso = scanner.nextDouble();
        }
        
        System.out.println("Piezas con peso entre 9.8 kg. y 10.2 Kg.: " + entre);
        System.out.println("Piezas con mas de 10.2 Kg.: " + mas);
        System.out.println("Piezas con menos de 9.8 Kg.: " + menos);
        System.out.println("Cantidad total de piezas procesadas: " + total);
    }
}