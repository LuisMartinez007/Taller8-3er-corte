package Taller8.Ejercicio2;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String matricula,String nombre,int edad){
        super(nombre,edad);
        this.matricula=matricula;
    }

    public String getMatricula() { 
        return matricula;
     } 
     
     public void setMatricula(String matricula) { 
        this.matricula = matricula;
     }
       @Override 
       public void mostrarInformacion() { 
        super.mostrarInformacion(); 
        System.out.println("Matrícula: " + matricula); 
    }
}
