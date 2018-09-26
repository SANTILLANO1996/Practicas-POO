//@author Luis Fernando Martínez Santillano #18550371
/*
abastraccion=simplificar   encapsulamiento=limitar el acceso
clase banco
nombre--> string
dinero--> double
herencia
polimorfismo
modificadores de accseo:
publico-->tods entran y tienen acceso TODOS
privado-->accseo limitao dentro de la clase
protected-->acceso por herencia (dentro de la clase y subclases)
default-->acceso a nivel de paquete
*/
package eva1_5_modificadores_acceso;
public class Modificadores_acceso
{
    public static void main(String[] args)
    {
        Banco bank=new Banco();
        bank.nombre_cliente="Luis Santillano";
        bank.saldo_cuenta=99985675847.0;
        System.out.println("cliente: "+bank.nombre_cliente);
        System.out.println("Saldo: "+bank.saldo_cuenta);
        //otro cliente
        Banco bank2=new Banco();
        bank2.nombre_cliente="Armando Casas";
        bank2.saldo_cuenta=1230.0;
        System.out.println("cliente: "+bank2.nombre_cliente);
        System.out.println("Saldo: "+bank2.saldo_cuenta);
    }
}
class Banco
{
    //en genreal los atributos de una clase deben ser PRIVADOS
    String nombre_cliente;
    double saldo_cuenta;
}