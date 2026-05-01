package Comun.Logica;

public class Cala extends Playa{

    boolean accesible;



//Constructor
    public Cala() {
    }


//Getters

    public boolean isAccesible() {
        return accesible;
    }



    //Setters
    public void setAccesible(boolean accesible) {
        this.accesible = accesible;
    }






 //Metodos
    @Override
    public double getPuntuacion() {

        double puntuacion =super.getPuntuacion();

        if(accesible){   //accesible==true es lo que hay por detrás, pero si solo pones
                            //accesible, te lo lee como true
            puntuacion+=1;
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccesible: " +accesible;
    }
}
