
import Paquete2.PersonaX;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Fernando Martínez Santillano    #18550371
 */
public class PrinPpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        PersonaX pObj1 = new PersonaX();
        System.out.println("Introduce el nombre: ");
        pObj1.setNombre(input.nextLine());
        System.out.println("Introduce tú apellido Paterno ");
        pObj1.setAapellidoPat(input.nextLine());
        System.out.println("Introduce tu apellido Materno");
        pObj1.setApellidoMat(input.nextLine());
        System.out.println("Introduce tu edad");
        pObj1.setEdad(input.nextInt());
        System.out.println("Introduce tu genero ");
        pObj1.setGenero(input.nextLine());
        System.out.println("Introduce tu RFC");
        pObj1.setRfc(input.nextLine());
        System.out.println("Introduce tu calle: ");
        pObj1.setCalle(input.nextLine());
        System.out.println("Introduce tu colonia");
        pObj1.setColonia(input.nextLine());
        System.out.println("Introduce tu ciudad");
        pObj1.setCiudad(input.nextLine());
        System.out.println("Introduce tu numero de casa: ");
        pObj1.setNumeroCasa(input.nextInt());
        System.out.println("Introduce tu Estado ");
        pObj1.setEdad(input.nextInt());
        System.out.println("Introduce tu estado civil ");
        pObj1.setEstadoCivil(input.nextLine());
        
        //Salida de datos completos
        
        System.out.println("Introduce tu nivel de estudio: ");
        pObj1.setNivelEstudio(input.nextLine());
        System.out.println("Introduce tu salario: ");
        pObj1.setSalario(input.nextDouble());
        
              System.out.println("Tus datos son : " + pObj1.getNombre() + pObj1.getAapellidoPat() + pObj1.getApellidoMat());
              System.out.println(" Tu edad: " + pObj1.getEdad());
              System.out.println("Tus datos son: " + pObj1.getGenero() + pObj1.getRfc() + pObj1.getCalle() + pObj1.getColonia() + pObj1.getCiudad());
                
        
    }
    
}
//profe el codigo no me corre bien no se si sea mi laptop o el codigo este mal :(