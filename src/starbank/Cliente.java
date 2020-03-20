/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbank;

/**
 *
 * @author juan
 */
public abstract class Cliente {
    private String id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String ocupacion;
    private String contraseña;
    private boolean esSubscrito;

    public Cliente(String id, String nombre, String telefono, String direccion, String ocupacion, String contraseña, boolean esSubscrito) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.contraseña = contraseña;
        this.esSubscrito = esSubscrito;
    }

   
    
    
    
    public void enterKey(String id, String contraseña){
        
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isEsSubscrito() {
        return esSubscrito;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEsSubscrito(boolean esSubscrito) {
        this.esSubscrito = esSubscrito;
    }
    
    
}
