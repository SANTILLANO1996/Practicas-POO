/**
 *
 * @author Luis Fernando Martínez Santillano    #18550371
 */


//El main es el metodo, el objeto es args de tipo string
//los arreglos en java tambien se comportan como objetos.
import java.util.*;
public class Principal
{
    public static void main(String[] args)
    {
        Principal objetoPrincipal;//declarando el objeto
        //asignación de memoria
        objetoPrincipal = new Principal();//constructor
        System.out.println("el objeto tiene: "+objetoPrincipal);
        Principal objeto2 = new Principal();//instanciación y declaración
        simple master = new simple();
        //Scanner
        Scanner leer = new Scanner(System.in);//los parentesis son para enviar datos al momento de interactuar el objeto
    }
}
//clase sin comportamiento sin estado sin variables (vacia)
//crear objetos de clases
//cuando creamos objetos de la clase es como instanciar objetos
//nombre de la clase nombre del objeto
class simple
{
    //contenido de la clase 
}