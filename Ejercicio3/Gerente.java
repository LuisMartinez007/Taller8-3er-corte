package Taller8.Ejercicio3;

public class Gerente extends Empleado {
private String departamento; 

// Constructor 
public Gerente(String nombre, double salario, String departamento) {
     super(nombre, salario); this.departamento = departamento; 
} 

@Override 
public void mostrarDetalles() { 
    super.mostrarDetalles(); System.out.println("Departamento: " + departamento); 
} 
public String getDepartamento() {
     return departamento; 
    }
 }
