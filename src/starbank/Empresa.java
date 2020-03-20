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
public class Empresa extends Cliente{
    private String nit;
    private String nombreEmpresa;
    private String sectorComercial;

    public Empresa(String id,String nombre,String telefono,String direccion,String ocupacion,String contraseña,boolean esSubscrito,String nit, String nombreEmpresa, String sectorComercial) {
        super(id,nombre,telefono,direccion,ocupacion,contraseña,esSubscrito);
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.sectorComercial = sectorComercial;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getSectorComercial() {
        return sectorComercial;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setSectorComercial(String sectorComercial) {
        this.sectorComercial = sectorComercial;
    }
    
    
    
}
