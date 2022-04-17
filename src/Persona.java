public abstract class Persona {


   private String nombre;
   private int edad;
   private float peso;
   private int ID;


    public Persona(String n)
    {
        nombre = n;

    }

    public Persona(int e){
        edad = e;
    }


    public Persona(float p){
        peso =p;

    }






    public abstract String getDescription();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
