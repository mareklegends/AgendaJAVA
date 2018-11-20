/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendajava;

import java.util.Scanner;

/**
 *
 * @author heyMAREK26
 */
public class AgendaJAVA {

public int nMenu(int nmenu){
    int nmenu2 =0;  
    return nmenu2;
}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Persona n1 = new Persona("Marcos", 345345, 18);
        
        System.out.println(n1);
        */
        Scanner leerprincipio = new Scanner(System.in);       
        int nmenu=0;  
        Menu.mostrarMenuPrincipal();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
        
         boolean bandera=true;
          
       do{
        switch (nmenu) {
            case 1:
            System.out.println("=================================="); 
                System.out.println("<> AÑADIR PERSONA <>");
            System.out.println("==================================");
            String nombreagenda;
            System.out.println("Nombre de la agenda");
            Scanner leer = new Scanner(System.in);     
            nombreagenda = leer.next();
            Agenda a1 = new Agenda(nombreagenda);
            System.out.println("==================================");
            String nombrep="";
            int edad=0, telefono=0;
            System.out.println("Escribe Nombre, Telefono, Edad");            
            Persona p1 = new Persona(nombrep, telefono, edad);
             System.out.println("==================================");    
                break;
            
                
            case 2:
                
            System.out.println("=================================="); 
                System.out.println("<> BUSCAR PERSONA <>");
            System.out.println("==================================");    
                    
                
                break;
                
            case 3:
                
            System.out.println("=================================="); 
                System.out.println("<> BORRAR PERSONA <>");
            System.out.println("==================================");    
                
                break;
            
                
            case 4:
                
            System.out.println("=================================="); 
                System.out.println("<> CUANTOS SON +18 <>");
            System.out.println("==================================");    
                    
                
                break;
                
            case 5:
                
            System.out.println("=================================="); 
                System.out.println("<> BUSQUEDA CON RANGO EDADS <>");
            System.out.println("==================================");   
                
                
                break;
            
                
            case 6:
            System.out.println("==================================");
            System.out.println("Saliendo de la agenda");
            System.out.println("==================================");        
            bandera=false;
                
                break;
                



        }    
    }while(bandera!=false);
        
        
        
        
        
        
    }
    
}
