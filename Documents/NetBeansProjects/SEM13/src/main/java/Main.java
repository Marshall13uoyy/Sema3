import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Double> carrito = new ArrayList<>();
            int opcion;
            
            do {
                System.out.println("\n1. Agregar producto");
                System.out.println("2. Pagar");
                System.out.println("3. Salir");
                System.out.print("Elija una opción: ");
                opcion = sc.nextInt();
                
                if (opcion == 1) {
                    System.out.print("Ingrese precio del producto: ");
                    carrito.add(sc.nextDouble());
                } else if (opcion == 2) {
                    if (carrito.isEmpty()) {
                        System.out.println("El carrito está vacío.");
                    } else {
                        double subtotal = 0;
                        for (double p : carrito) subtotal += p;
                        double impuesto = subtotal * 0.12;
                        double total = subtotal + impuesto;
                        
                        System.out.println("Subtotal: " + subtotal);
                        System.out.println("Impuesto (12%): " + impuesto);
                        System.out.println("Total: " + total);
                        
                        System.out.print("Ingrese su correo: ");
                        String correo = sc.next();
                        System.out.println("Compra confirmada a " + correo);
                        
                        carrito.clear();
                    }
                }
            } while (opcion != 3);
            
            System.out.println("Saliendo...");
        }
    }
}
