/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica2_poo;

import java.util.Scanner;

/**
 *
 * @author Luis Fernando Martínez Santillano    #18550371
 */
public class Eva1_Practica2_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan =new Scanner(System.in);
        int mes;
        do{
        System.out.println("Escoge un numero del 1 al 12 ó escoge el 0 para finalizar ");
        mes=scan.nextInt();
        switch(mes){
        case 1:
            System.out.println("Enero");
           break;
        case 2:
            System.out.println("Febrero");
           break;
           case 3:
               System.out.println("Marzo");
           break;
           case 4:
               System.out.println("Abril");
           break;
           case 5:
               System.out.println("Mayo");
           break;
           case 6:
               System.out.println("Junio");
           break;
           case 7:
               System.out.println("Julio");
           break;
           case 8:
               System.out.println("Agosto");
           break;
           case 9:
               System.out.println("Septiembre");
           break;
           case 10:
               System.out.println("Octubre");
           break;
           case 11:
               System.out.println("Noviembre");
           break;
           case 12:
               System.out.println("Diciembre");
           break;
           
           default:
               if(mes!=0){
            System.out.println("Creo que este chico no es muy listo!!!!");
               }
           
        }
        }while(mes!=0);
        }
        

        

    }
    
