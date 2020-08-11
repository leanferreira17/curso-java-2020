# Java Básico 2020 - Módulo III

### Programa
Estructuras de datos: Arreglos. Estructuras condicionales if, if else, else if, switch. 
Bucles: for, while, do while. 
Sentencias break y continue. 

### Arreglos
Un arreglo es un tipo de objeto en Java que nos permite almacenar datos indexados (asocia un índice a cada elemento).
La sintaxis para declararlo es la siguiente:
    
    tipo de dato + nombre de la variable + [] = new tipo de dato [cantidad de elementos]; 
    
Este tipo de objeto necesita que le pasemos la cantidad de elementos que contendra cuando lo instanciamos. Ese
valor conocido como "n" sera el largo de nuestro arreglo y una vez definido no se podra cambiar.
El primer elemento de todo arreglo se ubica en el índice 0 (cero) y llega hasta n (cantidad de elementos) - 1.

Si nuestro arreglo tiene 10 elementos, los indices que tendrá seran estos: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

Primer elemento: 0

Ultimo elemento: 9 (n - 1 ó 10 - 1)

#### Cómo acceder al contenido de cada casillero o celda en un arreglo?
Para acceder al contenido indexado dentro de un arreglo utilizaremos la siguiente declaracion:

    arreglo[indice];
    tipo variable = arreglo[indice];

Dado el siguiente arreglo de tipo entero con cantidad de elementos igual a 5 (n = 5) queremos multiplicar
su 4to elemento por 100 y luego imprimirlo.
    
    int arregloDeEnteros [] = {1, 5, 6, 7, 2};
    arregloDeEnteros[4] = arregloDeEnteros[4] * 100;
    
    System.out.println("El valor es: " + arregloDeEnteros[4]); 
    
Cuando inicializamos un arreglo siempre contendrá en sus elementos el valor por default que lleve su tipo.
Por ejemplo, 
para un arreglo de tipo int y longitud 10, será de esta forma:

    int [] arreglo = new int [10];
    0 0 0 0 0 0 0 0 0 0 // 10 elementos con valor 0  

para un arreglo de tipo boolean y longitud 5, será de esta forma:

    boolean arreglo [] = new boolean [5];
    false false false false false // 5 elementos con valor false

Por último, a la hora de inicializar un arreglo y conociendo los valores de antemano podemos declararlos 
con ayuda de la siguiente estructura: 

    int arreglo [] = {2, 4, 5, 6, 7, 8, 9};
    
Lo cual ubica al valor 2 bajo el indice 0 y al 9 en el indice 6.
Esta forma es practica cuando sabemos los valores antes de inicializar nuestro arreglo. 
Por ejemplo queremos construir un arreglo para guardar los posibles valores que pueda tomar la variable
"hora del dia". Los mismos van desde 00 hasta 23, por lo tanto podemos hacer esto:

    int horasDelDia [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

### Uso de estructuras condicionales: if else
Java cuenta con operadores que soportan las siguientes comparaciones:
- Menor que: p < q
- Menor o igual que: p <= q
- Mayor que: p > q
- Mayor o igual que: p >= q
- Igual a: p == q
- Distinto a: p != q

Podemos utilizar cualquiera de las comparaciones arriba listadas para realizar acciones, en otras palabras podemos
decidir el camino que tomará nuestro programa en base al cumplimiento o no de determinadas decisiones lógicas.

### Condicionales
Java cuenta con los siguientes condicionales:

- Usamos *if* para especificar un bloque de código que será ejecutado, solo si la condición evaluada es *true* (verdadera).
- Usamos *else* para especificar un bloque de código que será ejecutado, solo si la condición evaluada es *false* (falsa).
- Usamos *else if* para especificar una nueva condición a probar, si la primer condición es *false* (falsa).
- Usamos *switch* para especificar varios bloques de código a ser ejecutados.

### Sintaxis
#### if
    if (condición a evaluar) {
        // bloque de código que será ejecutado si la condición a evaluar es verdadera (true) 
    }
    
#### else
    if (condición a evaluar) {
            // bloque de código que será ejecutado si la condición a evaluar es verdadera (true) 
    }
    else {
            // bloque de código que será ejecutado si la condición a evaluar es falsa (false)
    }
#### else if
    if (condición 1) {
            // bloque de código que será ejecutado si la condición 1 es true
    }
    else if (condicion 2) {
            // bloque de código que será ejecutado si la condición 1 es false y la condicion 2 es true
    }
    else {
            // bloque de código que será ejecutado si las condiciones 1 y 2 son false
    }
    
 ### Bucles: 
 #### for
 Un bucle es una estructura que nos permite iterar una determinada cantidad de ciclos (vueltas) y ejecutar un bloque
 de código cada vez.
 
 *Utilizamos este bucle cuando sabemos con certeza la cantidad de iteraciones que haremos.*
 
 #### Sintaxis
    for (declaración 1; declaración 2; declaración 3) {
        // bloque de código que será ejecutado en cada iteración
    }  
    
Declaración 1 es ejecutada (solo una vez) antes de la ejecución del bloque de código.

Declaración 2 define la condición para ejecutar el bloque de código.

Declaración 3 es ejecutada (cada vez) después de ejecutar el bloque de código.

#### while

*Utilizamos este bucle cuando NO sabemos con certeza la cantidad de iteraciones que haremos.*

Este tipo de bucle itera y ejecuta un bloque de código siempre y cuando la condición que se evalua sea "true".

#### Sintaxis

    while (condicion a evaluar) {
        bloque de código que se ejecutará cada vez
    }
    
    int valor = 5;
    
    while (valor < 10) {
        System.out.println("El valor es: " + valor);
        valor = valor + 1;
    }
    
Esto imprimirá por consola lo siguiente:

    El valor es: 5
    El valor es: 6
    El valor es: 7
    El valor es: 8
    El valor es: 9

#### do while

Este bucle es una variante del while, la diferencia es que ejecuta el bloque de código antes de evaluar
la condición. Tomemos el ejemplo anterior y cambiemos la condición:

#### Sintaxis

        do {
            bloque de código que se ejecutará cada vez
        } 
        while (condicion a evaluar);     
        
        int valor = 5;
        
        do {
            System.out.println("El valor es: " + valor);
            valor = valor + 1;
        }
        while (valor > 10);
      
Esto imprimirá por consola lo siguiente:

    El valor es: 5
        
La diferencia radica en que el bloque de código se ejecutará al menos una vez por mas que la 
condición sea falsa.

### Uso de la declaración break
Cuando estamos dentro de un bucle, sea cual sea, tenemos la posibilidad de salirnos de él con la declaración
llamada "break". Vamos a ver cómo se usa:

    for (int i = 0; i < 10000; i++) {
        if (i == 5) {
            System.out.println("Fin del bucle for.");
            break;
        }
        System.out.println("El valor de i es: " + i);
    }

### Uso de la declaración continue
Esta declaración es similar al break solo que en lugar de salir del bucle nos permite saltarnos esa iteración
y continuar con la siguiente. Veamos un ejemplo:

    for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("El valor de i es: " + i);
    }
    
### Uso de la sentencia switch
Utilizamos esta estructura cuando tenemos varias opciones y necesitamos ejecutar un bloque de código específico 
para cada una.

#### Sintaxis

    switch(expresión) {
      case 1:
        // bloque de código a ejecutarse si hay coincidencia
        break;
      case 2:
        // bloque de código a ejecutarse si hay coincidencia
        break;
      default:
        // bloque de código a ejecutarse si no hay coincidencias
        // puede estar o no
    }
    
Asi es como funciona:

- La expresión es evaluada solo una vez.
- La expresión puede ser de tipo numerico o String (revisar detalles del JDK).
- El valor de la expresión es comparado con los valores de los casos.
- Si hay una coincidencia entre los valores, entonces el bloque de código asociado se ejecutará.
- Los palabras reservadas default y break son opcionales.


    