/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainstrumento;


/**
 * Esta clase representa un instrumento de viento que implementa la interfaz InstrumentoMusical
 * Proporciona métodos para tocar, afinar y obtener el tipo de instrumento
 * @author Fer Ordoñez
 * @version 09/04/2024
 */
public class InstrumentoViento implements InstrumentoMusical {
    
    /**
     * Método que indica cómo se toca el instrumento de viento
     */
    public void tocar(){
        System.out.println("Tocando instrumento de viento.");
    }
    
    /**
     * Método que indica cómo se afina el instrumento de viento
     */
    public void afinar(){
        System.out.println("Afinando instrumento de viento.");
    }
    
    /**
     * Método que devuelve el tipo de instrumento
     * @return Una cadena que representa el tipo de instrumento de viento
     */
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
}
