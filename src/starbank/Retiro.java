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
public class Retiro  extends Operacion{
    private float valor;

    public Retiro(String nombre, String fecha, String hora, float valor) {
        super(nombre, fecha, hora);
        this.valor=valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
    
}
