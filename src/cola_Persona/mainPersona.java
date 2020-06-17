
package cola_Persona;

import java.util.Scanner;


public class mainPersona {
    
    static cola_Persona cola;
    static Scanner sc = new Scanner(System.in);
    static int pos=0;
    public static void main(String[] argv) {
        menu();
    }

    static void creaCola() {
        int tam;
        System.out.print("Ingrese Tamaño de la Cola: ");
        tam = sc.nextInt();
        cola = new cola_Persona(tam);
        System.out.println("Cola creada... ");
    }

    static void linea() {
        System.out.println("*********************************");
    }
    static void registrar(){
            sc.nextLine();
            System.out.print(pos+1+".- Ingrese su codigo: ");
            String cod=sc.nextLine();
            System.out.print(pos+1+".- Ingrese su Nombre: ");
            String nom=sc.nextLine();
            System.out.print(pos+1+".- Ingrese Tarifa por Hora: ");
            double tar=sc.nextDouble();
            System.out.print(pos+1+".- Ingrese Horas: ");
            int h=sc.nextInt();         
            cola.insertarCola(pos,cod, nom, tar, h);            
            pos++;
    }
    
    
    public static void menu() {
        int opcion;
        do {
            linea();
            System.out.println("\t Menu de Opciones "
                    + "\n1.- Crear Cola"
                    + "\n2.- Ingresar datos "
                    + "\n3.- Mostrar datos"
                    + "\n4.- Eliminar datos"                    
                    + "\n0.- Salir");
            linea();
            System.out.print("Ingrese una alternativa: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    creaCola();
                    break;
                case 2:
                    registrar();
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    cola.eliminarCola();
                    break;               
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese opcion correcta");
                    break;

            }
        } while (opcion != 0);

    }
}
