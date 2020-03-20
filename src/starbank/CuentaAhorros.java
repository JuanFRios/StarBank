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
public class CuentaAhorros extends Cuenta {
    private float interes;
    public CuentaAhorros(String id, float saldo, boolean esActiva, float interes) {
        super(id, saldo, esActiva);
        this.interes=interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getInteres() {
        return interes;
    }
    
    
    
}
