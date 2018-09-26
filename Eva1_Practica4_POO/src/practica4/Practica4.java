/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author Luis Fernando Martínez Santillano    #18550371
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instaciar la clase persona ==>
        // 1.- Los objetos son identificadores (Variables)
        int iVal;
        Persona pPersonal;  //Declaraciòn
        //INSTACIAR = Asignar Valor (Memoria) => new
        iVal = 10;    
        pPersonal = new Persona ();  // El objeto existe
        // Capturar NOMBRE
        System.out.println("Introduce tu nombre ");
        Scanner sCaptu = new Scanner(System.in);
        pPersonal.nombre = sCaptu.nextLine();
        System.out.println(pPersonal.nombre); // Aqui si podemos usarlo
        
        Persona pPersona2 = new Persona();
        System.out.println("Introduce tu nombre ");
        
        pPersona2.nombre = sCaptu.nextLine();
        System.out.println(pPersona2.nombre);
        System.out.println("Introduce tu apellido");
        pPersona2.Apellido = sCaptu.nextLine();
        System.out.println(pPersona2.Apellido);
        pPersona2.imprimeNombreCompleto();
        
        
    }
  
    }
    class Persona{
        // Atributos de la clase
        // Determinan el estado del objeto
        
        String nombre;
        String Apellido;
        int edad;
        String RFC;
        String genero;
        int estadoNaci;
        String ciudad;
        String estadoCivil;
        // Comportamiento de la clase
        // Mètodos y/o funciones
        // Niveles de acceso! -Valor de retorno- -nombre(Argumetnos)
        public void imprimeNombreCompleto(){
            System.out.println(nombre + " " + Apellido);
        
        }
}
