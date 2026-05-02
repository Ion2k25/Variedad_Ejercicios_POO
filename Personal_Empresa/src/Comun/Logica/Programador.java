package Comun.Logica;

import java.util.Scanner;

public class Programador extends Trabajador {

    private String lenguaje;


//Constructor


//Getters



//Setters



//Metodos

    @Override
    public double salarioReal(int dias){
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce cuantos días has trabajado");
        dias =sc.nextInt();
        return sueldoDia* dias;
    }
}
