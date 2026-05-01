package Comun.App;

import Comun.Gestion.GestionPlayas;
import Comun.Logica.Playa;
import Comun.Logica.Playa_grande;

public class Pruebas {
    static void main(String[] args) {


        Playa_grande p = new Playa_grande ();

        System.out.println(p);


        GestionPlayas g1= new GestionPlayas();

        g1.crearPlaya();

        System.out.println(p);


    }
}
