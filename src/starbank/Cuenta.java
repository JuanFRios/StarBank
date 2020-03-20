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
public abstract class Cuenta {
    private String id;
    private float saldo;
    private boolean esActiva;

    public Cuenta(String id, float saldo, boolean esActiva) {
        this.id = id;
        this.saldo = saldo;
        this.esActiva = esActiva;
    }
    
    public void consignar(float valor){
        
    }
    
    public void retirar(float valor){
        
    }
    
    public void aggOperacion(float value, String nombre){
        
    }

    public String getId() {
        return id;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isEsActiva() {
        return esActiva;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setEsActiva(boolean esActiva) {
        this.esActiva = esActiva;
    }
    
    
}
