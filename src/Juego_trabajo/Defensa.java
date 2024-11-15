package Juego_trabajo;

public class Defensa extends Jugador{
    int bloqueos;
    public Defensa(String nombre,int edad,String equipo,int bloqueos){
        super(nombre,edad,equipo);
        this.bloqueos=bloqueos;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.printf("\n Bloqueos: "+bloqueos);
    }
}