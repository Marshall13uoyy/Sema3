public class CalculoDescuento {

    // Método con porcentaje definido
    public static double calcularDescuento(double montoTotal, double porcentaje) {
        return montoTotal * porcentaje / 100;
    }

    // Método sobrecargado con 10% por defecto
    public static double calcularDescuento(double montoTotal) {
        return montoTotal * 0.10;
    }

    public static void main(String[] args) {
        double monto1 = 200;
        double monto2 = 500;

        // Llamada con descuento por defecto (10%)
        double d1 = calcularDescuento(monto1);
        System.out.println("Monto: $" + monto1 + " | Descuento: $" + d1 + " | Final: $" + (monto1 - d1));

        // Llamada con descuento explícito (15%)
        double d2 = calcularDescuento(monto2, 15);
        System.out.println("Monto: $" + monto2 + " | Descuento: $" + d2 + " | Final: $" + (monto2 - d2));
    }
}
