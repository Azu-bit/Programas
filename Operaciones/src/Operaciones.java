import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int c = scanner.nextInt();
        
        System.out.print("Ingrese el cuarto número: ");
        int d = scanner.nextInt();
        
        int suma = a + b;
        int producto = c * d;
        
        System.out.print("La suma de " + a + " y " + b + " es: " + suma);
        System.out.print("El producto de " + c + " y " + d + "es: " + producto);
    }
    
}
