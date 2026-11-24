package app;

import model.Empleado;
import service.GestorEmpleados;
import util.LectorArchivo;
import java.util.List;

/**
 *
 * @author acamp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====================================================================================");
        System.out.println("                 SISTEMA DE GESTION DE EMPLEADOS                                     ");
        System.out.println("=====================================================================================\n");

        GestorEmpleados gestor = new GestorEmpleados();
        String rutaArchivo = "C:/Users/Jc_va/IdeaProjects/llanquihuetours/src/resources/empleados.txt";

        // 1. Carga de datos desde archivo .txt usando la librería utilitaria
        System.out.println("1. CARGANDO DATOS DESDE ARCHIVO EXTERNO:");
        List<Empleado> empleadosCargados = LectorArchivo.cargarEmpleadosDesdeTxt(rutaArchivo);
        gestor.setListaEmpleados(empleadosCargados);

        // 2. Listar todos los registros
        System.out.println("\n2. LISTADO COMPLETO DE EMPLEADOS:");
        gestor.mostrarTodos();

        // 3. Filtrar por rol
        System.out.println("\n3. EMPLEADOS CON ROL 'Guia':");
        List<Empleado> guias = gestor.buscarPorRol("Guia");
        for (Empleado emp : guias) {
            System.out.println(emp);
        }

        // 4. Filtrar por ciudad (composición)
        System.out.println("\n4. EMPLEADOS EN LA CIUDAD 'Valparaiso':");
        List<Empleado> enValparaiso = gestor.buscarPorCiudad("Valparaiso");
        for (Empleado emp : enValparaiso) {
            System.out.println(emp);
        }
        System.out.println("\n=====================================================================================");
        System.out.println("Ejecución finalizada correctamente. Prototipo listo para integración.");
    
    }
}