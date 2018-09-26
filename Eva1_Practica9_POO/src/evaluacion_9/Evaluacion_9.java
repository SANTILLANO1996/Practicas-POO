/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_9;

import Paquete.Automóvil;
import Paquete.Circulo;
import Paquete.Empleado;
import java.util.Scanner;

/**
 *
 * @Irving Luis Fernando Martínez Santillano    #18550371
 */
public class Evaluacion_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Importamos las clases
        double peri, area,total;
        Scanner ui = new Scanner(System.in);
        Automóvil po = new Automóvil();
        Scanner yo = new Scanner (System.in);
        Circulo a = new Circulo();
        Scanner lo = new Scanner(System.in);
        Empleado ol = new Empleado();
        
        
        
        
        
        System.out.println("  ");
        
        System.out.println("Que marca es tu carro \n ");
        po.setMarca(ui.nextLine());
        System.out.println("Cual es la placa del carro homie ");
        po.setPlaca(ui.nextLine());
        System.out.println("Gasolina premium o magna? ");
        po.setGasolina(ui.nextLine());
        System.out.println("Es automatico o estandar? ");
        po.setAues(ui.nextLine());
        System.out.println("Cual es la cilindrada de tu auto? ");
        po.setMotor(ui.nextLine());
        System.out.println("En cuanto valuas tu auto? ");
        po.setPrecio(ui.nextDouble());
        System.out.println("Cual es el kilometraje recorrido? ");
        po.setKilometraje(ui.nextDouble());
        System.out.println("De cuantas velocidades es ");
        po.setCambios(ui.nextInt());
        System.out.println("De que modelo es ");
        po.setAño(ui.nextInt());
        System.out.println("tiene llantas de respuesto, encaso de ser si ¿cuantas tiene? ");
        po.setLlanrepu(ui.nextInt());
        
        System.out.println(" Tus datos del carro son  " +po.getMarca() +"  " +po.getPlaca() +"  " +po.getGasolina() +"  " +po.getAues() +"  " +po.getMotor());
        System.out.println("\n Tus datos del carro entero\n  "  +"\n El precio es  "+po.getPrecio() +"\n El kilometraje es " +po.getKilometraje() +"\n Los cambios son: " +po.getCambios() +"\n El año del carro es" +po.getAño() +"\n Las llantas de repuesto son  "+po.getLlanrepu());
        
        
        System.out.println("\n Ahora sacaremos el área y perimetro del circulo:  \n ");
        System.out.println("Dame el radio");
        a.setRadio(yo.nextDouble());
        
        peri= 3.141592* (2*a.getRadio());
        area= 3.141592* (a.getRadio() * a.getRadio());
        System.out.println("El perimetro es " +peri);
        System.out.println("El area es " +area);
        
        System.out.println("   ");
        
        System.out.println("Ahora tomaresmos los datos personales de tu persona:   ");
        
        System.out.println("Nombre: ");
        ol.setNom(lo.nextLine());
        System.out.println("Apellido Paterno: ");
        ol.setApellidopat(lo.nextLine());
        System.out.println("Apellido Materno: ");
        ol.setApellidomat(lo.nextLine());
        System.out.println("Genero: ");
        ol.setGenero(lo.nextLine());
        System.out.println("Clave de acceso a narnia: ");
        ol.setClave(lo.nextLine());
        System.out.println("Edad: ");
        ol.setEdad(lo.nextInt());
        System.out.println("Salario: ");
        ol.setSalario(lo.nextDouble());
        System.out.println("Pago por tiempo extra: ");
        ol.setExtra(lo.nextDouble());
        
        total= (ol.getSalario()+ol.getTimExt());
        
        System.out.println("Tus Datos son " +ol.getNom() + " " +ol.getApellidopat() +" " +ol.getApellidomat() +" \n Tu genero es "+ol.getGenero() +" \n Tu clave es "+ol.getClave() +" \n Tu edad es "+ol.getEdad());
        System.out.println("Tus percepciones son " +total);
        
        System.out.println("\n I will back!! ");
        
    }
    
}
