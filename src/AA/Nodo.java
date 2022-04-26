/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AA;

/**
 *
 * @author Juana García
 */
public class Nodo {
     /* Declaraciones de variables */
    private int valor;

    private Nodo padre;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;

    /* Constructor cuidado aqui se debe actuallizar aqui el valor para no perder el orden */ 
    public Nodo(int valor) {
        this.valor = valor;
    }

    /* Setters y Getters */
    public void setValor(int valor) {
        this.valor = valor;
        // se ingresa el valor del nodo al crear una instancia del mismo

    }

    public int getValor() {
        return valor;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
}
