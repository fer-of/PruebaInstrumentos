/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainstrumento;

/**
 * Esta clase representa una flauta, que es un tipo de instrumento de viento.
 * Extiende la clase InstrumentoViento y sobrescribe el método tipoInstrumento() para devolver "Flauta"
 * @author Fer Ordoñez
 * @version 09/04/2024
 */
public class Flauta extends InstrumentoViento{
    //La clase flauta puede sobrescribir algun metodo
    
    /**
     * Método que devuelve el tipo de instrumento como "Flauta"
     * @return Una cadena que representa el tipo de instrumento como "Flauta"
     */
    public String tipoInstrumento(){
        return "Flauta";
    }

}