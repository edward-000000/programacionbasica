/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operdoreslogicos;

/**
 *
 * @author Alumno
 */
public class operdoreslogicos {
    public static void main(String[] args) {
    boolean esVerdadero = true;
    boolean esFalso = false;
    
    //Operador And (&&)
     boolean resultadoAnd = esVerdadero && esFalso;
     System.out.println("AND :"+ resultadoAnd);
     //Operador OR (||)
     boolean resultadoOr = esVerdadero || esFalso;
     System.out.println("OR :"+ resultadoOr);
     //Operador NOT (!)
     boolean resultadoNot = !esVerdadero;
     System.out.println("Not: "+ resultadoNot);
    }
    
}
