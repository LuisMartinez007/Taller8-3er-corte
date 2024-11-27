package Taller8.Ejercicio1;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(int numeroPuertas,String marca, double velocidadMax){
        super(marca, velocidadMax);
        this.numeroPuertas=numeroPuertas;
    }

    @Override 
    public void mostrarInformacion() { 
        super.mostrarInformacion(); 
        System.out.println("Número de Puertas: " + numeroPuertas); 
    } 
    public int getNumeroDePuertas() {
         return numeroPuertas; 
        }
}
