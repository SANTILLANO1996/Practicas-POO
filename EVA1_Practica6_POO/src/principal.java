//@author Luis Fernando Martínez Santillano #18550371
//demostracion de niveles de acceso
//para usar algo de una clase de un paquete fuera de un paquete hay que importar
//cuando es de otro paquete solo se puede usar lo publico
import java.util.*;
import Dos.secu;
public class principal
{
    public int iPublico = 10;
    private int iPrivado = 20;
    protected int iProtegido = 30;
    int iDefault = 40;
    public static void main(String[] args)
    {
        principal news = new principal();
        System.out.println(news.iPublico);
        System.out.println(news.iPrivado);
        System.out.println(news.iProtegido);
        System.out.println(news.iDefault);
        Default lf = new Default();
        System.out.println(lf.iPublico);
        System.out.println(lf.iProtegido);
        System.out.println(lf.iDefault);
        secu Dj = new secu();
    }

    public principal() {
        this.iPrivado = 20;
    }
}
class Default
{
    public int iPublico=10;
    private int iPrivado=20;
    protected int iProtegido=30;
    int iDefault=40;
}
class Default_main
{
    public int iPublico=10;
    private int iPrivado=20;
    protected int iProtegido=30;
    int iDefault=40;
}