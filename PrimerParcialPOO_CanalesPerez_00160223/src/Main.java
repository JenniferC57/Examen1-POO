import java.util.ArrayList;
import java.util.Scanner;

import Inventario.ArticuloElectronico;
import Inventario.TelefonoMovil;
import Inventario.Laptop;
import Inventario.Informacion;

public class Main {

    public static void main(String[] args) {

         ArrayList<ArticuloElectronico> Lista;

        Scanner sn = new Scanner(System.in);
        int opcion;

        TelefonoMovil celular = new TelefonoMovil();
        Laptop laptop = new Laptop();

        /**
        System.out.println("-----Agregar telefono----");
        System.out.println("Nombre: ");
        celular.getNombre();
        System.out.println("Marca: ");
        celular.getMarca();
        System.out.println("Numero de telefono: ");
        celular.getNumeroTelefono();
        System.out.println();
         **/

        do {

            System.out.println("--------- Menu ---------");
            System.out.println("1- Agregar Telefono");
            System.out.println("2- Agregar Laptop");
            System.out.println("3- Modificar Telefono");
         System.out.println("4- Modificar Laptop");
            System.out.println("5- Ver articulos de la tienda");
            System.out.println("6- Salir");
            System.out.print("Opcion: ");
            sn.opcion(nextInt);


            switch (opcion){
                case 1:
                    System.out.println("Hola");
                break;
                case 2:

                    break;
                case 3:

                    break;
                    case 4:
                    System.out.println("Hola");
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
            }

        }while(opcion != 4);

    }
}