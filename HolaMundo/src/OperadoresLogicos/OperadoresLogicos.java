/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperadoresLogicos;

/**
 *
 * @author Alumno
 */
public class OperadoresLogicos {
public static void main(String[] args) {
   boolean esVerdadero = true;
   boolean esFalso = false;
  
// Operador AND (&&)
   boolean resultadoAnd = esVerdadero && esFalso; System.out.println("AND:" + resultadoAnd);
// Operador OR (||)
   boolean resultadoor = esVerdadero | esFalso; System.out.println("OR: " + resultadoor);
// Operador NOT (!)
   boolean resultadoNot = esVerdadero;
   System.out.println("NOT: " + resultadoNot);
// Ejemplo de expresión lógica
   int edad = 25;
   boolean esAdulto = edad >= 18;
   System.out.println("¿Es adulto? : " + esAdulto);
// Operador XOR (^)
   boolean resultadoXor = esVerdadero ^ esFalso;

    System.out.println("XOR :" + resultadoXor);
   }
  }