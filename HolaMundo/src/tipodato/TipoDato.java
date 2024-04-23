/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipodato;

/**
 *
 * @author Alumno
 */
public class TipoDato {//public - le das un acceso publico pra que otros archivitos pueden acceder a ese paquete

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //cuerpo o clase principal de la clase
        //Declarando
        String Nombre;
        int Edad;
        boolean Estado;
        double Saldo;
        Object TodoTipoDato;
        String nombre;
        //Asignando
        Nombre = " Edward Rodrigo Uriarte Anccota";
        Edad = 18;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = 23.23;
        
        //Inprimir en Pantalla
        System.out.println("Nombre:" + Nombre);
        System.out.println("Edad : " +Edad);
        System.out.println("Saldo : " + Saldo);
        System.out.println("Todo tipo de dato : " + TodoTipoDato);
        // TODO code application logic here
    }
    
}