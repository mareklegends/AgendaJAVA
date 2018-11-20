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
    private Persona[] vPersonas;

    public Agenda(String nombre) {
        this.nombre = nombre;
        vPersonas = new Persona[20];
    }

  public void añadirPersona(Persona p1){
      
      for (int i = 0; i < vPersonas.length; i++) {
          if (vPersonas[i]==null) {
               vPersonas[i] = p1;
               break;
          }
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
  
  

  
    public String buscarPersona(String nombre){
          String texto="";
        
        for (int i = 0; i < vPersonas.length; i++) {
              if (vPersonas[i]!=null && vPersonas[i].getNombre().equalsIgnoreCase(nombre)) {
                   texto += "\n >> Nombre: " + vPersonas[i].getNombre() + " Telefono: " +  vPersonas[i].getTelefono() + " Edad: " + vPersonas[i].getEdad() + " ";
                    break;
              }
     }
         return texto;
 }
    
    
public int cuantosMayores(){
    int contador = 0;
    
    
    for (int i = 0; i < vPersonas.length; i++) {
        if (vPersonas[i]!=null && vPersonas[i].getEdad()>=18) {           
             contador++;                  
        }
        
       
    }
    
     return contador;
    
}
  
public String personasEntreEdades(int en1, int en2){
    
    String texto="";
    
       for (int i = 0; i < vPersonas.length; i++) {
        if (vPersonas[i]!=null) {
            if (vPersonas[i].getEdad()>=en1 &&  vPersonas[i].getEdad()<=en2) {
    
              texto += "\n >> Nombre: " + vPersonas[i].getNombre() + " Telefono: " +  vPersonas[i].getTelefono() + " Edad: " + vPersonas[i].getEdad() + " ";

            }    
        } 
    }
            return texto;

}


    
    
    
}
