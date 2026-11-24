
package util;

import model.Direccion;     // se importan ambas clases del paquete model
import model.Empleado;      // se importan ambas clases del paquete model
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acamp
 */
public class LectorArchivo {
    public static List<Empleado> cargarEmpleadosDesdeTxt(String rutaArchivo) {
        List<Empleado> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int numLinea = 0;

            while ((linea = br.readLine()) != null) {
                numLinea++;
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(";");

                // Validación del número de columnas esperadas 
               if (datos.length == 8) {
                   try {
                       String nombre = datos[0].trim();
                       String telefono = datos[1].trim();

                       String calle = datos[2].trim();
                       int numero = Integer.parseInt(datos[3].trim());
                       String ciudad = datos[4].trim();

                       String rut = datos[5].trim();
                       String rol = datos[6].trim();
                       int id = Integer.parseInt(datos[7].trim());

                       // Creación por composición
                       Direccion dir = new Direccion(calle, numero, ciudad);
                       Empleado empleado = new Empleado(nombre, telefono, dir, rut, rol, id);

                       lista.add(empleado);
                   } catch (NumberFormatException e) {
                       System.err.println("Error de formato numérico en línea " + numLinea + ": " + e.getMessage());
                   }
               } else {
                   System.err.println("Advertencia: Línea " + numLinea + " con estructura incorrecta.");
               }
            }
            System.out.println("--> Se cargaron exitosamente " + lista.size() + " registros desde el archivo.");
         } catch (IOException e) {
            System.err.println("Error al acceder al archivo '" + rutaArchivo + "': " + e.getMessage());
         }

         return lista;
         
    }
}
                