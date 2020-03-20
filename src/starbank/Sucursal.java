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
public class Sucursal {
    private String id;
    private String direccion;
    private String nombre;
    private String ciudad;

    public Sucursal() {
    }

    public Sucursal(String id, String direccion, String nombre, String ciudad) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
