/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("dame el nombre");
        String nombre =capturarTexto("introduce tu nombre");
        System.out.println("dame el apellido");
        
        String apellido =capturarTexto("introduce tu apellido");
         System.out.println("nombre "+nombre);
          System.out.println("apellido "+apellido);
          
          System.out.println("dame la edad");
          int edad=capturarEdad("dame la edad");
          
             System.out.println("dame el decimal");
          double decimal=capturarDecimal("dame el numero decimal");
      
    }
    //CAPTAR TEXTO
    public static String capturarTexto(String mensaje){
        
        Scanner captu;
        captu=new Scanner(System.in);
        String texto=captu.nextLine();
        return texto;
    }
    public static int capturarEdad(String mensaje ){
        
        Scanner captu;
        captu=new Scanner(System.in);
        int edad=captu.nextInt();
        return edad;
        
    }
             public static double capturarDecimal(String mensaje ){
        
        Scanner captu;
        captu=new Scanner(System.in);
        double decimal=captu.nextDouble();
        return decimal;
     }   
}
