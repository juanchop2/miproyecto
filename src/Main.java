import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {




        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese el tamano que quiera que tenga el staff");
        int tamano_staff = entrada1.nextInt();

        System.out.println("El Staff tiene tamano de " + tamano_staff);









       Persona[] staff = new Persona[tamano_staff];


    //        staff[0] = new Persona();
    //        staff[1] = new Persona();
    //        staff[2] = new Persona();


        for (int i = 0; i < staff.length  ; i++) {


//



            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el ID de un estudiandte #" + (i+1));
            int IDentrada = entrada.nextInt();

            staff[i].setID(IDentrada);

            System.out.println("Ingrese nombre del estudiante");
            String NombreEntrada = entrada.next();

            staff[i].setNombre(NombreEntrada);

            if (IDentrada != 0) {
                int id_nuevo = Funciones.IDvalido(staff[i].getID(), staff[i].getNombre());
                staff[i].setID(id_nuevo);
               // System.out.println("Integrante # " + (i+1) +" con nombre :"+ staff[i].getNombre() + " ,  su nuevo ID es " + staff[i].getID());

            }

            System.out.println("Ingrese la edad del estudiante" );
            int EdadEntrada = entrada.nextInt();
            staff[i].setEdad(EdadEntrada);







            System.out.print(staff[i].toString() + "\n"); // imprime en pantalla el resumen de toda la identificacion de cada miembro del staff




            





            /*        System.out.println("Los integrantes del staff son : " + staff[0].getNombre() + ","+ staff[1].getNombre() + ","+ staff[2].getNombre() +"\n");*/

           // System.out.println(staff[0].toString());

/*        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el ID de un estudiandte");
        int IDentrada = entrada.nextInt();

        System.out.println("Ingrese nombre del estudiante");
        String NombreEntrada = entrada.next();

        staff[3].setID(IDentrada);

        System.out.println("el numero de identificacion del miembro");



        Persona mensajero = new Persona();

        mensajero.setID(IDentrada);
        mensajero.setNombre(NombreEntrada);*/

/*        System.out.println("El ID que usted esta ingresando es : " + IDentrada +"\n");
        System.out.println("El Nombre que usted esta ingresando es: "+ NombreEntrada + "\n");*/

            /* Funciones.IDvalido(mensajero.getID(), mensajero.getNombre());*/


        }
    }




}
