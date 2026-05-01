package Comun.Logica;

public class Playa_grande extends Playa{

    private String bandera;





//Constructor
    public Playa_grande() {
    }


//Getters
    public String getBandera() {
        return bandera;
    }


//Setters

    public void setBandera(String bandera) {
        if( bandera.equalsIgnoreCase("Roja")||
            bandera.equalsIgnoreCase("Amarilla")||
            bandera.equalsIgnoreCase("Verde")){

            this.bandera = bandera;
        }else{
            System.out.println("Bandera no válida, se asigna verde por defecto");
            this.bandera ="Verde";
        }
    }






//METODOS

    @Override  //Por si te has equivocado al escribir el getPuntuacion, te avisa
                //Y llama al metodo padre y le puedes modificar este método como quieras
    public double getPuntuacion() {

        double puntuacion = super.valoracionMedia();
                            //Llama al método de la clase padre

        if(longitud>2000 && bandera.equals("Verde")){
            puntuacion +=1;
        }

        return puntuacion;
        //RESUMEN---------
        //puntuacion es ese +1 que se necesita, se declara como double, llamas
        //al otro método con el super. y si cumple la condicion, se suma +1 y devuelve
        //puntuacion
    }

@Override
    public String toString() {
        return super.toString() + "\nBandera: " +bandera;
    }
}
