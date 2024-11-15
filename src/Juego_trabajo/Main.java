package Juego_trabajo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese los datos del jugador:" +
                "\n Ingrese el Nombre: ");
        String nombre=scanner.next();
        System.out.println("Ingresa la Edad: ");
        int edad=scanner.nextInt();


        Portero portero = new Portero("Juan", 30, "Equipo A", 100, 20,10);
        Defensa defensa = new Defensa("Carlos", 25, "Equipo B", 50);
        Delantero delantero = new Delantero("Pedro", 22, "Equipo C");

        portero.mostrarInfo();
        System.out.println();
        defensa.mostrarInfo();
        System.out.println();
        delantero.mostrarInfo();
    }
}