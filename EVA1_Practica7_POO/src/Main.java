/**@author Luis Fernando Martínez Santillano #18550371
 *
 * todo metodo de la clase es la interfaz con la que se comunica lo de afuera con lo de la clase
 * siempre los atributos son privados y debemos usar los metodos como intermediarios
 * ejemplos de atributos y sus usos y los modificadores de acceso
 */
import java.util.*;
import Punisher.Banco;
import Punisher.Mejor_Banco;
public class Main
{
    public static void main(String[] args)
    {
        Banco persona1=new Banco();
        persona1.nombre="Luis Santillano";
        persona1.Saldo=924235235.0;
        System.out.println("INFORMACIÖN DE LA CUENTA.");
        System.out.println("Titular: "+persona1.nombre);
        System.out.println("Saldo: "+persona1.Saldo);
        //me volaraon la lana los mala vida, ahora me voy a un mejor banco
        Mejor_Banco mejor_persona1=new Mejor_Banco();
        mejor_persona1.setNombre("Luis Santillano");
        mejor_persona1.setSaldo(-5423.2);
        System.out.println("INFORMCAION DE LA MEJOR CUENTA");
        System.out.println("Titular: "+mejor_persona1.getNombre());
        System.out.println("Saldo: "+mejor_persona1.getSaldo());
    }
}