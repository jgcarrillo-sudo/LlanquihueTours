package service;

import model.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acamp
 */
public class GestorEmpleados {
    private List<Empleado> listaEmpleados;

    public GestorEmpleados() {
        this.listaEmpleados = new ArrayList<>();
    }

    public void setListaEmpleados(List<Empleado> empleados) {
        this.listaEmpleados = empleados;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    // Listar todos los registros
    public void mostrarTodos() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados en el sistema.");
            return;
        }
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }
    }
    
    // Filtrar por rol
     public List<Empleado> buscarPorRol(String rol) {
         List<Empleado> resultado = new ArrayList<>();
         for (Empleado emp : listaEmpleados) {
             if (emp.getRol().equalsIgnoreCase(rol)) {
                 resultado.add(emp);
             }
         }
         return resultado;
     }
     // Filtrar por ciudad de la dirección (demuestra uso de composición)
     public List<Empleado> buscarPorCiudad(String ciudad) {
         List<Empleado> resultado = new ArrayList<>();
         for (Empleado emp : listaEmpleados) {
             if (emp.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
                 resultado.add(emp);
             }
         }
         return resultado;
     }
}
    
    
    
    
    
    
    
    
