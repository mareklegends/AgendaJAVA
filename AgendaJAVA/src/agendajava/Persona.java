/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendajava;

/**
 *
 * @author heyMAREK26
 */
public class Persona {
    
    private String nombre;
    private int telefono;
    private int edad;

    public Persona(String nombre, int telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        String texto= ">> Nombre " + nombre + " | Telefono " + telefono + " | Edad " + edad + "\n ";        
        return texto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    


    
    
    
    
    
}
