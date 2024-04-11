/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pruebainstrumento;


/**
 * Esta interfaz representa un instrumento musical genérico que puede ser tocado y afinado.
 * @author Fer Ordoñez
 * @version 09/04/2024
 */
public interface InstrumentoMusical {
    
    /**
     * Método que define cómo se toca el instrumento
     */
    void tocar();
    
    /**
     * Método que define cómo se afina el instrumento
     */
    void afinar();
    
    /**
     * Método que devuelve el tipo de instrumento
     * @return Una cadena que representa el tipo de instrumento
     */
    String tipoInstrumento();
}
