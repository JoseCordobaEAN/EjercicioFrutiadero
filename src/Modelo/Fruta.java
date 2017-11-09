/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * Representa una fruta en el negocio
 * 
 * @author jmcordoba
 */
public class Fruta {
    
    private String nombre;
    private String descripción;
    private float masa;
    private float porcentajeJugo;
    private float porcentajeEnsalada;

    /**
     * Crea una nueva instancia de fruta
     * 
     * @param nombre el nombre de la fruta
     * @param descripción la descripcion de la fruta
     * @param masa la masa de la fruta
     * @param porcentajeJugo el despercio de la fruta al elaborar jugos
     * @param porcentajeEnsalada el despedicio de la fruta al elaborar ensaladas
     */
    public Fruta(String nombre, String descripción, float masa, float porcentajeJugo, float porcentajeEnsalada) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.masa = masa;
        this.porcentajeJugo = porcentajeJugo;
        this.porcentajeEnsalada = porcentajeEnsalada;
    }
    
    /**
     * Modifica la cantidad de fruta disponible de acuerdo a la solicitud de 
     * cantidad y el desperdicio de la misma para jugo,
     * si no hay suficiente fruta retorna toda la fruta luego de desperdicio 
     * @param cantidad la cantidad de fruta a solicitar
     * @return la cantidad de fruta disponible para la operación
     */
    public float usarJugo(float cantidad){
        throw new UnsupportedOperationException("Por implementar");
    }
    
    /**
     * Modifica la cantidad de fruta disponible de acuerdo a la solicitud de 
     * cantidad y el desperdicio de la misma para Ensalada,
     * si no hay suficiente fruta retorna toda la fruta luego de desperdicio 
     * @param cantidad la cantidad de fruta a solicitar
     * @return la cantidad de fruta disponible para la operación
     */
    public float usarEnsalada(float cantidad){
        throw new UnsupportedOperationException("Por implementar");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripción
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * @param descripción the descripción to set
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * @return the masa
     */
    public float getMasa() {
        return masa;
    }

    /**
     * @param masa the masa to set
     */
    public void setMasa(float masa) {
        this.masa = masa;
    }

    /**
     * @return the porcentajeJugo
     */
    public float getPorcentajeJugo() {
        return porcentajeJugo;
    }

    /**
     * @param porcentajeJugo the porcentajeJugo to set
     */
    public void setPorcentajeJugo(float porcentajeJugo) {
        this.porcentajeJugo = porcentajeJugo;
    }

    /**
     * @return the porcentajeEnsalada
     */
    public float getPorcentajeEnsalada() {
        return porcentajeEnsalada;
    }

    /**
     * @param porcentajeEnsalada the porcentajeEnsalada to set
     */
    public void setPorcentajeEnsalada(float porcentajeEnsalada) {
        this.porcentajeEnsalada = porcentajeEnsalada;
    }
    
}
