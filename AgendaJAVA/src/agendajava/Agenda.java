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

  public void añadirPersona(Persona p1){
      
      for (int i = 0; i < vPersonas.length; i++) {
          Persona vPersona = vPersonas[i];
          
      }
      
  }
   
  
  
  public void borrarPersona(String nombre){
          for (int i = 0; i < vPersonas.length; i++) {
              if (vPersonas[i]!=null && vPersonas[i].getNombre().equalsIgnoreCase(nombre)) {
                  vPersonas[i]=null;
                  break;
              }
          
      }
      
  }
  
  

  
    public void buscarPersona(String nombre){
        for (int i = 0; i < vPersonas.length; i++) {
              if (vPersonas[i]!=null && vPersonas[i].getNombre().equalsIgnoreCase(nombre)) {
                  System.out.println(vPersonas[i].toString());
                  break;
              }
     }
 }
    
    
public int cuantosMayores(){
    int contador = 0;
    
    
    for (int i = 0; i < vPersonas.length; i++) {
        if (vPersonas[i]!=null) {
            if (vPersonas[i].getEdad()>=18) {
             contador++;
            }
            
               
        }
        
       
    }
    
     return contador;
    
}
  
    
    
    
}
