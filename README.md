# CRUD de Lista Estática en Java

### Este proyecto es una aplicación de consola desarrollada en Java que implementa un sistema básico de gestión de nombres (CRUD) utilizando arreglos estáticos. Fue creado como parte del aprendizaje de los fundamentos de Java, enfocándose en la manipulación de arreglos, estructuras de control y modularización.
📋 Características

## El programa permite realizar las siguientes operaciones sobre una lista de nombres con capacidad limitada (10 elementos):

    * Listar: Muestra todos los nombres registrados actualmente.

    * Agregar: Inserta un nuevo nombre al final de la lista (incluye validación de espacio disponible).

    * Eliminar: Remueve el último elemento de la lista.

    * Actualizar: Busca un nombre específico y permite reemplazarlo por uno nuevo.

    * Menú Interactivo: Interfaz de consola amigable para navegar entre las funciones.

## 🛠️ Conceptos Aplicados

### Durante el desarrollo de este código se pusieron en práctica los siguientes conceptos técnicos:

    - Arreglos Estáticos: Uso de String[] con un tamaño predefinido.

    - Early Return Pattern: Implementación de retornos tempranos para validar condiciones (ej. lista vacía o llena) antes de ejecutar la lógica principal.

    - Estructuras de Control: Uso de do-while para el ciclo de vida de la app y switch para el menú.

    - Entrada de Datos: Uso de la clase java.util.Scanner para interactuar con el usuario.

## 🚀 Cómo ejecutarlo

    Asegúrate de tener instalado el JDK (Java Development Kit).

    1. Copia el archivo ListaEstatica.java a tu entorno local.

    2. Compila el archivo desde la terminal:
    Bash

    javac ListaEstatica.java

    3. Ejecuta el programa:
    Bash

    java dev.angellechuga.proyecto.ListaEstatica

## 📁 Estructura del Código

### El código está organizado dentro del paquete dev.angellechuga.proyecto y se compone de:

    Atributos estáticos: Para mantener el estado de la lista y el contador de elementos.

    Métodos lógicos:

        vacia(): Validador de estado.

        listar(), agregar(), eliminar(), actualizar(): Funciones del CRUD.

    Método Main: Punto de entrada que gestiona el flujo del menú.
