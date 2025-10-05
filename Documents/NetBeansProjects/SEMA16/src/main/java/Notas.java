import java.io.*;

public class Notas {
    public static void main(String[] args) {
        String nombreArchivo = "mis_notas.txt";

        // --- ESCRITURA ---
        try {
            try (FileWriter fw = new FileWriter(nombreArchivo); PrintWriter pw = new PrintWriter(fw)) {
                
                pw.println("Primera nota: Hoy aprendí a escribir archivos en Java.");
                pw.println("Segunda nota: Leer archivos también es sencillo.");
                pw.println("Tercera nota: Practicar mejora mis habilidades.");
                // Cerramos el archivo de escritura
                
            }

            System.out.println("Notas guardadas correctamente.\n");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // --- LECTURA ---
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println("Nota: " + linea);
                }
                // Cerramos el archivo de lectura
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
