/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebainstrumento;

/**
 * Esta clase sirve como una prueba de concepto para demostrar el polimorfismo 
 * en Java utilizando la interfaz InstrumentoMusical y una implementación 
 * concreta Flauta
 * @author Fer Ordoñez
 * @version 09/04/2024
 */
public class PruebaInstrumento {
    public static void main (String [] args){
        //Se puede crear una referencia de una interfaz
        InstrumentoMusical instrumento;
        
        //Pero no es posible crear una instancia de una interfaz
        //intrumento = new InstrumentoMusical();
        
        //Una referencia a la interfaz puede ser asignada a cualquier
        //objeto que la implemente
        
        // Asignar la instancia de Flauta a la referencia de InstrumentoMusical
        instrumento = (InstrumentoMusical) new Flauta();
        // Llamar a los métodos a través de la referencia de la interfaz
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
    }

}
