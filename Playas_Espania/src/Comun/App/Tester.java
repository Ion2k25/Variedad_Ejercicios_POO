package Comun.App;

import Comun.Gestion.GestionPlayas;
import Comun.Logica.Playa;

import java.util.Scanner;

public class Tester {
    public void main(String[] args) { //Escribes "psvma"
        Scanner sc = new Scanner(System.in);
        GestionPlayas gestion1 = new GestionPlayas();  //CONSTRUCTOR > Aqui eliges cual quieres, o este o el que entre parentesis pues le dices el tamaño del Array


        int opcion;
        do {
            System.out.println("\n---------MENU---------");
            System.out.println("1. Crear una playa");
            System.out.println("2. Dar de baja una playa");
            System.out.println("3. Mostrar playas mas largas que la cantidad introducida");
            System.out.println("4. Mostrar informacion de las playas");
            System.out.println("5. Modificar longitud");
            System.out.println("6. Modificar la bandera");
            System.out.println("7. Ordenar");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {

                case 1:  //Creacion de una playa
                    gestion1.crearPlaya();
                    break;

                case 2:  //Dar de baja una playa
                    System.out.println("Cual es el identificador de la playa que quieres eliminar?");
                    int id = sc.nextInt();
                    System.out.println(gestion1.darDeBaja(id));
                    break;

                case 3:  //Mostrar playas mas grandes que la introducida
                    System.out.println("Introduce una longitud deseada en metros");
                    int lon= sc.nextInt();
                    sc.nextLine();
                    System.out.println(gestion1.mostrarListadoPlayas(lon));  //Este hay que mirarlo bien, porque no quiero cambiar nada, solo quiero que me muestre cuantas son mayores que lo introducido

                case 4:   //Mostrar informacion de las playas introduciendo la comunidad
                    System.out.println("A que Comunidad Autonoma pertenece la playa?");
                    String comuAut = sc.nextLine();
                    gestion1.mostrarInfo(comuAut);
                    break;

                case 5:
                    gestion1.modificarLongitud();
                    break;

                case 6:
                    gestion1.modificarBandera();
                    break;

                case 7:
                    gestion1.ordenarPlayas();
                    break;

            }
        }while (opcion != 0);

        }

}
