package Comun.Logica;

public abstract class Playa {

    int id;
    String nombre;
    Direccion direccion;
    double longitud;
    int valoraciones[] = new int[100];
    int contadorValoraciones = 0;



    //Constructor


    public Playa() {
    }

    public Playa(int id, String nombre, Direccion direccion, double longitud) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.longitud = longitud;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public double getLongitud() {
        return longitud;
    }







//Setters


    public void setId(int id) {
        this.id = id;
    }


    public void setLongitud(double longitud) {
        if (longitud>0){
            this.longitud = longitud;
        }else{
            System.out.println("Longitud no válida");
        }
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }



    //--------TEORIA-MÉTODOS------------
    //public tipoDeRetorno nombreMetodo(parametros)   >Asi es la creación de un método
    //     ( int, double, String...)        (opcionales) datos que tiene en cuenta y trabaja sobre ellos
    //Void no tiene return. Sin VOID > te devuelve lo que quieras


    //Metodos
    public double valoracionMedia() {

        if (contadorValoraciones == 0) {
            return 0;                   //Porque si NO hay valoraciones 0/2, va a dar ERROR
        }

        int suma = 0;

        for (int i = 0; i < contadorValoraciones; i++) { //Recorre TODAS las valoraciones
            suma += valoraciones[i]; //Va sumando, si la val1=2 y val2=3 > Total= 5
        }

        return (double) suma / contadorValoraciones;
        // Hay que indicar ese DOUBLE porque son int los valores que realizan la operacion
    }



    public double getPuntuacion() {
        return valoracionMedia();  //Aqui en PLAYA, solo devuelve lo básico, es en las otras, donde es mas avanzado
                                        //haces un @override en PlayaGrande y la Cala> POLIMORFISMO
    }






//------------DOS MANERAS DE HACER MÉTODO INFORMAR-------------
                //el que prefieras, pero si quieres dejarlo bonito a tu manera, con el Metodo-1

//Metodo-1 ----->> EL MEJOR
    @Override  //Se usa en Playa porque el toString ya existe ese método en JAVA
    public String toString() {
        return "Identificador: " + id + "\nNombre: " + nombre + "\nDirección: " + direccion + "\nLongitud: " + longitud;

        //En el main se usa así "System.out.println(Costa);"
    }

//Método-2
    public  void  informar(){
        System.out.println(this);  //En el Tester, se usa asi "Costa.informar();" y ya te da todo
    }
}

