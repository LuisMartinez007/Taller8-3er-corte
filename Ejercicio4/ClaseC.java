package Taller8.Ejercicio4;

public class ClaseC extends ClaseA, ClaseB {
     // Esto causará un error de compilación 
     public void metodoC() { System.out.println("Método en ClaseC"); 
    } 
}
//una clase puede heredar de solo una clase a la vez. 
//La herencia múltiple no está permitida debido a los 
//problemas de ambigüedad y la complejidad que puede surgir. 
//la clase ClaseC no sabría cuál de los dos métodos heredar