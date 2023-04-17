import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double promedio;
        
        System.out.println("Introduce la nota del primer parcial:");
        notas[0] = sc.nextDouble();
        System.out.println("Introduce la nota del segundo parcial:");
        notas[1] = sc.nextDouble();
        System.out.println("Introduce la nota del tercer parcial:");
        notas[2] = sc.nextDouble();
        System.out.println("Introduce la nota del cuarto parcial:");
        notas[3] = sc.nextDouble();
        
        promedio = notas[0] * 0.2 + notas[1] * 0.2 + notas[2] * 0.3 + notas[3] * 0.3;
        
        if (promedio >= 85 && promedio <= 100) {
            System.out.println("Excelente");
        } else if (promedio >= 80 && promedio <= 84) {
            System.out.println("Muy bueno");
        } else if (promedio >= 70 && promedio <= 79) {
            System.out.println("Bueno");
        } else if (promedio >= 60 && promedio <= 69) {
            System.out.println("Regular");
        } else {
            System.out.println("Repite curso");
        }
    }
}