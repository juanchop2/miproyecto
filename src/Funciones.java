import java.util.Random;

public class Funciones {


    public  static int IDvalido(int ID , String nombre) { // funcion que me identifica si el usuario tiene un ID mayot a 10. Si sucede esto se le generera de manera random un nuevo ID
        int nuevo_ID = 0;
        if (ID > 10) {
            System.out.println("Este usuario no tiene permitido el paso" + "\n");
            System.out.println("No se le permite el acceso a : " + nombre + "  . Numero de identificacion: " + ID);

            Random ran = new Random();
            nuevo_ID = ran.nextInt(200);

            System.out.println("Su nuevo ID es validado es:" + nuevo_ID);
        }
        else{

            nuevo_ID = ID;

            }


        return nuevo_ID;

    }






}
