package Juego_trabajo;

public class Portero extends Jugador{
    int atajadas;
    int golesRecibidos;
    int numero_camisa;
    public Portero(String nombre,int edad,String equipo,int atajadas,int golesRecibidos,int numero_camisa){
        super(nombre,edad,equipo);
        this.atajadas=atajadas;
        this.golesRecibidos=golesRecibidos;
        this.numero_camisa=numero_camisa;

    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.printf("\n Atajadas:"+atajadas+"\n Goles Recibidos: "+golesRecibidos+"\n Numero de camiceta: "+numero_camisa);
    }

}