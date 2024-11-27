package Taller8.Ejercicio3;

public class PruebaEmpleado {
     public static void main(String[] args) { 
        Empleado empleado = new Empleado("Juan Pérez", 2500.00);
         empleado.mostrarDetalles(); System.out.println("-------------------------");
           Gerente gerente = new Gerente("Ana López", 3500.00, "Ventas"); 
           gerente.mostrarDetalles();
        }
    }