package Comun.Logica;

import java.util.Scanner;

public abstract class Trabajador {

    //No se instanciará TRABAJDOR > Abstract
    private String nombre;
    private String apellidos;
    Fecha fechaIncor;
    double sueldoDia;
    private String departamento;



//Constructor

    public Trabajador(String nombre, String apellidos, Fecha fechaIncor, Double sueldoDia, String departamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIncor = fechaIncor;
        this.sueldoDia = sueldoDia;
        this.departamento = departamento;
    }

    protected Trabajador() {
    }


//Getters


//Setters



//Metodos
  public abstract double salarioReal(int dias);  //Es un metodo abstracto, porque este metodo solo lo va a usar las HIJAS

}
