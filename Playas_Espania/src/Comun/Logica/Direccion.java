package Comun.Logica;

public class Direccion {

    String calle;
    String codPostal;
    String comunidad;



//Constructor
    public Direccion() {
    }



//Getters
    public String getComunidad() {
        return comunidad;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getCalle() {
        return calle;
    }



    //Setters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public void setComunidad(String comunidad) {

        if ((comunidad.equalsIgnoreCase("Anadlucia") ||
                comunidad.equalsIgnoreCase("Aragon") ||
                comunidad.equalsIgnoreCase("Asturias")) ||
                comunidad.equalsIgnoreCase("Baleares") ||
                comunidad.equalsIgnoreCase("Canarias") ||
                comunidad.equalsIgnoreCase("Cantabria") ||
                comunidad.equalsIgnoreCase("Castilla La Macha") ||
                comunidad.equalsIgnoreCase("Cataluña") ||
                comunidad.equalsIgnoreCase("Valenciana") ||
                comunidad.equalsIgnoreCase("Extremadura") ||
                comunidad.equalsIgnoreCase("Galicia") ||
                comunidad.equalsIgnoreCase("La Rioja") ||
                comunidad.equalsIgnoreCase("Castilla y Leon") ||
                comunidad.equalsIgnoreCase("Madrid") ||
                comunidad.equalsIgnoreCase("Murcia") ||
                comunidad.equalsIgnoreCase("Navarra") ||
                comunidad.equalsIgnoreCase("Pais Vasco")) {

            this.comunidad=comunidad;
        } else {
            System.out.println("No existe dicha comunidad, se asigna Madrid por defecto");
            this.comunidad="Madrid";
        }
    }


}
