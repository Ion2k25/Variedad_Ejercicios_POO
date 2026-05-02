package Comun.Logica;

import java.util.Scanner;

public class JefeProyecto extends Trabajador{

    private double sueldoBase;


//Constructores

    public JefeProyecto(String nombre, String apellidos, Fecha fechaIncor, Double sueldoDia, String departamento, Double sueldoBase) {
        super(nombre, apellidos, fechaIncor, sueldoDia, departamento);
        this.sueldoBase = sueldoBase;
    }


//Getters



//Setters



//Metodos


    @Override
    public double salarioReal(int dias) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantos dias has trabajado?");
        dias =sc.nextInt();

        System.out.println("Cuantas personas a tu cargo tienes?");
        int personasCargo= sc.nextInt();

        return (sueldoDia*dias) + (personasCargo*(0.0002*(sueldoDia*dias)));
    }


}

