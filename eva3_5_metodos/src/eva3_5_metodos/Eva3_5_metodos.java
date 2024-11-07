/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_metodos;

/**
 *
 * @author 52452
 */
public class Eva3_5_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diaSemana[]={"Lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
    imprimirArreglo(diaSemana);
    
    
    String meses []={"enero","febrero","marzo","abril","mayo","junio",
    "julio","agoste","septiembre","octubre","noviembre","diciembre"};
    imprimirArreglos(meses);
    
    int billetes[]={20,50,100,200,500,100};
    imprimirBilletes(billetes);
    }
    
    public static void imprimirArreglo(String[] arreglo)
    
    {
    
for(int i=0; i<arreglo.length; i++)
{
System.out.println(arreglo[i]);
}
    }
    public static void imprimirArreglos(String[]arreglo)
    {
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
    
    public static void imprimirBilletes(int[]arreglo)
    {
         for(int i=0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
    
}
