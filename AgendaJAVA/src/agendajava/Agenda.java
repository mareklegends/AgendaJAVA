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
public class Agenda {
    
    private String nombre;
    private Persona[] vPersonas = new Persona[20];

    public Agenda(String nombre) {
        this.nombre = nombre;
    }

  public void añadirPersona(){
      
      for (int i = 0; i < vPersonas.length; i++) {
          Persona vPersona = vPersonas[i];
          
      }
      
  }
  
  public void borrarPersona(String nombre){
      
  }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
  
  
  
    
    
    
}
