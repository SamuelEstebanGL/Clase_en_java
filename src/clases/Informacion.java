package clases;

import java.util.Scanner;

public class Informacion {

    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        Persona persona1 = new Persona();
        System.out.print("por favor Digite el Nombre de la persona que quiere imprimir en pantalla: ");
        persona1.Nombre = consola.nextLine();
        System.out.print("por favor Digite el Apellido de la persona que quiere imprimir en pantalla: ");
        persona1.Apellido = consola.nextLine();
        persona1.desplegarInformacion();
    }
}
