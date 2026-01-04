package dev.angellechuga.proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaEstatica {

    /*Generar una lista estática que me permita realizar las siguientes acciones
    * - Listar
    * - Agregar
    * - Eliminar
    * - Actualizar
    * - Tengo que generar un menú*/

    // -->Crear mi lsita vacía
    static String[] nombres = new String[10];

    // -- contador de nombres
    static int contaNames = 0;

    static int i;

    // Función validadora
    public static boolean vacia (){
        return contaNames <=0;
        }


    // función para listar elementos
    public static void listar () {
        if (vacia()){
            System.out.println("\n\n\t No hay elementos para mostrar");
            return;
        }
        //--> imprimir elementos del arreglo
        for(i=0; i<contaNames; i++){
            System.out.println(nombres[i] + "\n\t");
        }
    }

    // función para agregar elementos
    public static void agregar(){
        // --> primero usar el Early return pattern para verificar si hay lugares disponibles
        if ( contaNames >= 10) {
            System.out.println("No puedes agregar más nombres");
            return; //--> nos regresa de una, de allí el Early return
        }
        // --> Solicitar elemento a agregar
        System.out.println("\n\n\t Ingresa un nombre:\t");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        // --> Agregar a arreglo nombres, toma el valor del contador y lo agrega a su posición
        nombres[contaNames] = nombre;
        // --> Un número más al contador
        contaNames++;
    }

    // función para eliminar elemento
    public static void eliminar(){
        if(contaNames<=0){
            System.out.println("\n\t No hay elementos para eliminar");
            return;
        }
        // indica índice -1 por el tamaño y asignas nuevo valor 'null'
        nombres[contaNames -1] = null;
        contaNames--;
        listar();
    }

    //Función para actualizar
    public static void actualizar(){
        if (vacia()) {
            System.out.println("Lista vacía");
            return;
        }

        //--> elemento que quieres actualizar
        System.out.println("Ingresa el nombre a actualizar: \t");

        Scanner scanner = new Scanner (System.in);
        String nombre = scanner.nextLine();

        int j = -1;

        //--> buscar si el valor que queremos actualizar existe en el array
        for (i=0;i<contaNames;i++){
            if(nombres[i].equals(nombre)){
                j=i;
                break; //para salir
            }
        }

        //--> cuando no se encuentra el nombre
        if(j==-1){
            System.out.println("nombre no encontrado en la lista");
            return;
        }

        //--> Ingreso de valor para actualizar
        System.out.println("Ingresa el nuevo nombre: \t");
        nombres[j] = scanner.nextLine();

        listar();

    }

    // -->  INICIO DE PROGRAMA
    public static void main(String[] args) {

        int respuesta;

        System.out.println("\n\n\t Bienvenido al proyecto 1 del curso de Java desde Cero\n\tSelecciona una opción");

        do{

            System.out.println("1. Listar");
            System.out.println("2. Agregar");
            System.out.println("3. Eliminar");
            System.out.println("4. Actualizar");
            System.out.println("0. Salir");
            System.out.println("Respuesta: ");

            /*try{
                respuesta = scanner.nextInt();
            } catch (InputMismatchException e){
                respuesta = -1;
                scanner.nextLine();
            }*/

            Scanner scanner = new Scanner(System.in);
            respuesta = scanner.nextInt();

            switch (respuesta) {

                case 1: {
                    // Invocar función de listar
                    listar();
                } break;
                case 2: {
                    //invocar función agregar
                    agregar();
                } break;
                case 3: {
                    eliminar();
                } break;
                case 4: {
                    actualizar();
                } break;
                case 0: {
                    System.out.println("adiós");
                } break;
                default:
                    System.out.println("No es una opción válida, intenta de nuevo");
            }
        }while(respuesta != 0);
    }
}
