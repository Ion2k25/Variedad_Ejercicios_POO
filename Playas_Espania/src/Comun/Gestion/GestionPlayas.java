package Comun.Gestion;

import Comun.Logica.Cala;
import Comun.Logica.Direccion;
import Comun.Logica.Playa;
import Comun.Logica.Playa_grande;

import java.util.Scanner;

public class GestionPlayas {
    private Playa[] playas;


    //Constructor-1 > Van a ser si o si 10 playas
    public GestionPlayas() {
        playas = new Playa[10]; //Con esto solamente creas los huecos,
        //no las playas en sí

        for (int i = 0; i < playas.length; i++) {
            if (i % 2 == 0) {   //Las playas pares pues serán Grandes
                playas[i] = new Playa_grande();
            } else { //Playas impares seran calas
                playas[i] = new Cala();
            }
        }
    }

    //Constructor-2 > Aquí el usuario puede elegir las playas que quiera ( solo cambia el int tamaño)
    public GestionPlayas(int tamano) {
        playas = new Playa[tamano];

        for (int i = 0; i < playas.length; i++) {
            if (i % 2 == 0) {   //Las playas pares pues serán Grandes
                playas[i] = new Playa_grande();
            } else { //Playas impares seran calas
                playas[i] = new Cala();
            }
        }
    }


//Metodos

    public boolean darDeBaja(int id) {

        for (int i = 0; i < playas.length; i++) {

            if (playas[i] != null && playas[i].getId() == id) {  //  "!=" significa "distinto de"
                //lo que quiere decir es, si el ID de la playa, corresponde con el ID
                //introducido por teclado
                playas[i] = null; //se asigna esa playa como null, no esque la elimine y quede vacio el hueco.

                return true;
            }
        }
        return false; //No se puede poner un Syso porque es un boolean
    }


    //Metodo de crear playa-----------------
    public Playa crearPlaya() {
        Scanner sc = new Scanner(System.in);

        //Elegir tipo de playa
        System.out.println("Elige tipo de playa: \n1 = Playa Grande\n2 = Cala");
        int tipo = sc.nextInt();
        sc.nextLine(); // MUY IMPORTANTE > Porque suele dar fallo el salto de linea, y con eso lo evitas internamente.

        //Asignar el id de la playa
        System.out.println("Introduce el identificador de la playa > entre 1 y 100");
        int id = sc.nextInt();
        sc.nextLine();

        //Asignar nombre de la playa
        System.out.println("Cual es el nombre de la playa?");
        String nombre = sc.nextLine();

        //Asignar longitud de la playa
        System.out.println("Cual es la longitud en metro de la playa?");
        double longitud = sc.nextDouble();
        sc.nextLine();

        Playa playa;  //Aqui lo que haces, es que directamente le da el nombre como playa y la guarda. NO SOBREESCRIBE

        if (tipo == 1) {
            playa = new Playa_grande();

            System.out.println("Que bandera tiene la playa?\nRoja\nAmarilla\nVerde");
            String bandera = sc.nextLine();

            ((Playa_grande) playa).setBandera(bandera);

        } else {
            playa = new Cala();

            System.out.println("Es accesible? \ntrue\nfalse");
            boolean accesible = sc.nextBoolean();

            ((Cala) playa).setAccesible(accesible);

        }

        playa.setNombre(nombre);
        playa.setLongitud(longitud);
        playa.setId(id);


        System.out.println("Introduce el nombre de la calle");
        String nomCalle = sc.nextLine();


        System.out.println("Introduce el codigo postal");
        String cd = sc.nextLine();

        System.out.println("Introduce la Comunidad Autonoma a la que pertenece");
        String com = sc.nextLine();

        Direccion d = new Direccion();

        d.setCalle(nomCalle);
        d.setComunidad(com);
        d.setCodPostal(cd);


        playa.setDireccion(d);

        System.out.println("\n\nSe ha creado correctamente tu playa llamada" +playa.getNombre()+ "\n\n"+ playa);
        return playa;
    }

    //Muestra listadoo-----------------
    public int mostrarListadoPlayas(double longitud_actual) {

        int contador = 0;

        for (int i = 0; i < playas.length; i++) {

            if (playas[i] != null && playas[i].getLongitud() > longitud_actual) {

                System.out.println(playas[i]);
                contador++;
            }
        }
        return contador;
    }


    //Muestra informacion------------------
    public void mostrarInfo(String comunidad) {

        for (int i = 0; i < playas.length; i++) {

            if (playas[i] != null && playas[i].getDireccion().getComunidad().equalsIgnoreCase(comunidad)) {

                System.out.println(playas[i]);
            }

        }
    }


//Modificar longitud playa-------------

    public boolean modificarLongitud() {  //Un boolean mucho mejor > Porque si no encuentra la playa, con VOID, no te mostrará el mensaje de "No existe la playa". Sin ese mensaje, valdria un Void

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la playa");
        String nombreIntroducido = sc.nextLine();

        System.out.println("Cual sería la nueva longitud?");
        double longitud1 = sc.nextDouble();
        sc.nextLine();


        for (int i = 0; i < playas.length; i++) {

            if (playas[i] != null && playas[i].getNombre().equalsIgnoreCase(nombreIntroducido)) {  //Los Strings se comparan con el .equalIgnoreCase

                playas[i].setLongitud(longitud1);
                return true;
            }
        }
        System.out.println("No existe esa playa");
        return false;
    }


//Modificar bandera-----------------

    public boolean modificarBandera() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la playa");
        String nombreIntroducido = sc.nextLine();

        System.out.println("Cual sería el nuevo color de bandera?");
        String nuevaBandera = sc.nextLine();


        for (int i = 0; i < playas.length; i++) {

            if (playas[i] != null && playas[i].getNombre().equalsIgnoreCase(nombreIntroducido) && playas[i] instanceof Playa_grande) {  //Instanceof, lo que hace es, recalcar, que se refiere a Playa_grande

                ((Playa_grande) playas[i]).setBandera(nuevaBandera);

                return true;
            }
        }
        System.out.println("No existe esa playa");
        return false;
    }


//Ordenar el Array

    public Playa[] ordenarPlayas() {

        Playa[] copia = new Playa[playas.length];

        for (int i = 0; i < playas.length; i++) {           //Te crea una copia sobre la que trabajar, no modifica el array principal por completo
            copia[i] = playas[i];
        }


        //El bucle que hace que se ordenen los Arrays
        for (int i = 0; i < copia.length - 1; i++) {

            for (int j = 0; j < copia.length - i - 1; j++) {

                if (copia[j] != null && copia[j + 1] != null && copia[j].getPuntuacion() < copia[j + 1].getPuntuacion()) {  //se hace la comparacion Y se ordena de > a <


                    Playa aux = copia[j];
                    copia[j] = copia[j + 1];   //Aqui lo que haces es gracias a una variable "aux" haces que se cambien y se ordenen
                    copia[j + 1] = aux;


                }
            }

        }

        return copia;
    }

}
