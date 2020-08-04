# Java Básico 2020 - Módulo III

### Programa
Estructuras de datos: Arreglos. Estructuras condicionales if else. Bucles: for.


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
    
 ### Bucles: for
 Un bucle es una estructura que nos permite iterar una determinada cantidad de ciclos (vueltas) y ejecutar un bloque
 de código cada vez.
 
 ### Sintaxis
    for (declaración 1; declaración 2; declaración 3) {
        // bloque de código que será ejecutado en cada iteración
    }  
    
Declaración 1 es ejecutada (solo una vez) antes de la ejecución del bloque de código.

Declaración 2 define la condición para ejecutar el bloque de código.

Declaración 3 es ejecutada (cada vez) después de ejecutar el bloque de código.
    