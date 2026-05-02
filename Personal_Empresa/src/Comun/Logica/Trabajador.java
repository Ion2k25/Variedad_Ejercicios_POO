package Comun.Logica;

import java.util.Scanner;

public abstract class Trabajador {

    //No se instanciará TRABAJDOR > Abstract
    private String nombre;
    private String apellidos;
    Fecha fechaIncor;
    private Double sueldoDia;
    private String departamento;



//Constructor



//Getters


//Setters



//Metodos
    public Double salarioReal(Double sueldoDia){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuantos dias has trabajado");
        int dias =sc.nextInt();
        sc.nextLine();

        return dias*sueldoDia;

    }
}
