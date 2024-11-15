package Juego_trabajo;

public class Jugador {
    protected String nombre;
    protected int edad;
    protected String equipo;

    public Jugador(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public void mostrarInfo() {
        System.out.printf("Datos del Jugador: ");
        System.out.printf("\n Nombre: " + nombre + "\n Edad: " + edad + "\n Equipo: " + equipo);
    }
}