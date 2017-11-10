/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ensalada;
import Modelo.Fruta;
import Modelo.Jugo;

/**
 * Esta clase permite modelar el inventario del frutiadero asi como elaborar 
 * ensaladas y jugos
 * 
 * @author jmcordoba
 */
public class Frutiadero {
    
    String NOMBRE = "Las Amazonas";
    
    Fruta [] inventario;
    
    /**
     * Prepara una ensalada dadas las cantidades de frutas
     * @param cantidades arreglo de cantidades de frutas por indices
     * @return la ensalada preparada
     */
    public Ensalada hacerEnsalada(float [] cantidades){
        throw new UnsupportedOperationException("No se ha implementado");
    }
    /**
     * Prepara un jugo dadas las cantidades de fruta y de agua
     * @param cantidades las cantidades de frutas del inventario
     * @param porcentajeAgua la cantidad de agua en el jugo
     * @return el jugo preparado
     */
    public Jugo hacerJugo(float [] cantidades, float porcentajeAgua){
        throw new UnsupportedOperationException("No se ha implementado");
    }
    
    public Frutiadero(){
        inventario = new Fruta[15];
    }
    
    /**
     * Agrega frutas al inventario
     * @param codigoFruta el indice de la fruta en el inventario
     * @param cantidad la cantidad de fruta a agregar
     * @return true si pudo realizar la operación false de lo contrario
     */
    public boolean agregarAlInventario(int codigoFruta, float cantidad){
        throw new UnsupportedOperationException("No se ha implementado");
    }
    
}
