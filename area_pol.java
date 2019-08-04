import java.util.Scanner;

/**
 * Programa para hallar área de un poligono regular
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class area_pol
{
    public static void main(String[] args)
    {
        double a,n,s,s2,tan,resultado;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Por favor ingrese la longitud de los lados del poligono");
        s = Teclado.nextDouble();
        
        System.out.println("Por favor ingrese el número lados del poligono");
        n = Teclado.nextDouble();
        
        s2 = Math.pow(s,2);
        tan = Math.tan(Math.PI/n);
        a = (n*s2)/(4*tan);
                 
        System.out.println("El área del poligono regular es " + a);
    }
}
