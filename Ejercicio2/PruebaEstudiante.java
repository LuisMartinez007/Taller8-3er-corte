package Taller8.Ejercicio2;

public class PruebaEstudiante {
    public static void main(String[] args) {
    Estudiante estudiante1 = new Estudiante("Mate", "Lopez", 20);
     estudiante1.mostrarInformacion(); System.out.println("-------------------------"); 
     // Crear otra instancia de Estudiante 
     Estudiante estudiante2 = new Estudiante("Mate", "Nadir", 20);
     estudiante2.mostrarInformacion(); 
    }
}
