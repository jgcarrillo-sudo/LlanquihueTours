package model;

public class Empleado {

        private String nombre;
        private String telefono;
        private Direccion direccion ;
        private String rut;
        private String rol;
        private int id;

    public Empleado() {
        this.nombre = "Sin Nombre";
        this.telefono = "000000000";
        this.direccion = new Direccion();
        this.rut = "Sin RUT";
        this.rol = "Sin Rol";
        this.id = 0;
}

    public Empleado(String nombre, String telefono, Direccion direccion, String rut, String rol, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rut = rut;
        this.rol = rol;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {     
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", rut=" + rut + ", rol=" + rol + ", id=" + id + '}';
    }
}
        




      
        

        

        

    
    

        




        

        