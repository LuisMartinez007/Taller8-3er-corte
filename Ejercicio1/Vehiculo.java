package Taller8.Ejercicio1;

public class Vehiculo {
    private String marca;
    private double velocidadMax;

    public Vehiculo(String marca, double velocidadMax){
        this.marca=marca;
        this.velocidadMax=velocidadMax;
    }

    public void mostrarInformacion() { 
        System.out.println("Marca: " + marca); 
        System.out.println("Velocidad Máxima: " + velocidadMax+ " km/h"); 
    }
    
    public String getMarca() { 
        return marca;
     } 
     public double getVelocidadMaxima() {
         return velocidadMax; 
        }

}
