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
        
        Agenda a1 = new Agenda("AgendaDeMAREK");
        
        
         boolean bandera=true;
          
       do{
        switch (nmenu) {
       
            
            
            case 1:
            System.out.println("=================================="); 
                System.out.println("<> AÑADIR PERSONA <>");
            System.out.println("==================================");
            String nombrep="";
            int edad=0, telefono=0;
            System.out.println("Escribe Nombre, Telefono, Edad");            
            Persona p1 = new Persona(nombrep, telefono, edad);            
            a1.añadirPersona(p1);
             System.out.println("==================================");
         
             
              Menu.mostrarMenuPrincipal();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
                break;
            
                
            case 2:
                
            System.out.println("=================================="); 
                System.out.println("<> BUSCAR PERSONA <>");
            System.out.println("=================================="); 
            
            
            System.out.println("Dime el nombre de la persona que quieres buscar");
             Scanner leerbuscar = new Scanner(System.in);
            String personabuscar;
            personabuscar = leerbuscar.nextLine();
            a1.borrarPersona(personabuscar);  
            System.out.println("==================================");   
            
            
           Menu.mostrarMenuPrincipal();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
                break;
                
            case 3:
                
            System.out.println("=================================="); 
                System.out.println("<> BORRAR PERSONA <>");
            System.out.println("==================================");    
            
            System.out.println("Dime el nombre de la persona que quieres borrar");
            Scanner leerborrar = new Scanner(System.in);
            String personaborrar;
            personaborrar= leerborrar.nextLine();
            a1.borrarPersona(personaborrar);
              System.out.println("==================================");   
            
            
           Menu.mostrarMenuPrincipal();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
                break;
            
                
            case 4:
                
            System.out.println("=================================="); 
                System.out.println("<> CUANTOS SON +18 <>");
            System.out.println("==================================");    
                  
            
            
                if (a1.cuantosMayores()==0) {
                    System.out.println("No hay mayores de edad en esta agenda");
                } else {
                        System.out.println("Hay");
                
                 a1.cuantosMayores();
                 
                System.out.println("Mayores de edad");
                }
            
            
                
              System.out.println("==================================");   
            
            
           Menu.mostrarMenuPrincipal();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt();   
                break;
                
            case 5:
                
            System.out.println("=================================="); 
                System.out.println("<> BUSQUEDA CON RANGO EDADS <>");
            System.out.println("=================================="); 
                System.out.println("Dime entre las edades que quieres buscar");
           Scanner entreN1 = new Scanner(System.in);
              Scanner entreN2 = new Scanner(System.in);
              
            int en1=0, en2=0;
            
            en1 = entreN1.nextInt();
            en2 = entreN2.nextInt();
            
            a1.personasEntreEdades(en1, en2);
            
                
                System.out.println("==================================");   
            
            
           Menu.mostrarMenuPrincipal();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
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
