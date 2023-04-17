import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        String nombreDeUsuario = scanner.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contraseña = scanner.nextLine();

        if (nombreDeUsuario.equals("Patricia Gutierrez") && contraseña.equals("FR38h6bo")) {
            System.out.println("¡Inicio de sesión exitoso!");
        } else {
            System.out.println("Error: Nombre de usuario o contraseña inválidos");
        }
    }
}