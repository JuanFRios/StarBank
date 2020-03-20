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
public class Cajero {
    private String id;
    private String contraseña;

    public Cajero() {
    }

    public Cajero(String id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    
    public void aggCliente(){
        
    }
    
    public void aggCuenta(){
        
    }
    
    public void desactivarCuenta(){
        
    }
    
    public void checkearCliente(String id, String contraseña){
        
    }
    
    
    
    
    public String getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
