# Java Básico 2020 - Módulo IV

### Programa
Bucles: Foreach. Operadores lógicos (&&, ||, !). 

### Bucles: foreach

Este bucle es una variante del ya conocido bucle for. 

#### Sintaxis

    int arreglo [] = {0, 1, 2, 3, 4, 5};
    
    for (int elemento: arreglo) {
        System.out.println(elemento);
    }

- Comienza con la palabra *for* igual que un bucle *for* normal
- No se declara ni inicializa ninguna variable de conteo de vueltas,
solo se declara una variable que debe ser del mismo tipo que el arreglo seguida de un ":" luego va el nombre del arreglo
- En el cuerpo del bucle usamos el nombre de la variable que apuntará a cada elemento del arreglo en cada iteración
   
A tener en cuenta:
- No está recomendado cuando queremos modificar un elemento del arreglo
- No podemos obtener el índice del arreglo
- Solo se itera hacia adelante, no podemos hacerlo de atras para adelante


### Operadores lógicos en Java
Son utilizados para determinar la lógica entre variables o valores.

#### Operador: And (&&)

    5 > 3 && 4 == 4 -> true
    
    true && true -> true
    true && false -> false
    false && true -> false
    false && false -> false
        
#### Operador: Or (||)

    5 < 7 || 3 < 8 -> true
    
    true || true -> true
    false || true -> true
    true || false -> true
    false || false -> false
    
#### Operador: Not (!)

    5 == 5 -> true
    !(5 == 5) -> false
    
    !true -> false
    !false -> true
    
    
### Modificadores de acceso: 

### Encapsulamiento

Este concepto es uno de los mas importantes en términos de seguridad. 
El encapsulamiento es la forma de proteger nuestros datos dentro del sistema estableciendo los permisos, niveles de visibilidad y acceso a los datos que fluyen dentro de la aplicación.

En Java existen 4 niveles:

- *default o package*: Se puede acceder a los miembros de clase solo en el mismo paquete.
- *public*: Se puede acceder a todos los atributos o métodos de la clase. 
- *protected*: Se puede acceder a los atributos o métodos solo en la misma jerarquía de herencia o dentro del mismo paquete. 
- *private*: Solo se puede acceder a los atributos o métodos de la clase en la que se encuentran.


### default o package
Es el modificador que no se declara y nos permite tener acceso a los miembros de clase de un determinado
tipo desde otro objeto.

    public class Persona {
        // los valores package o default no se declaran explicitamente
        default String nombre; // MAL
        package int edad; // MAL
        float estatura; // BIEN
    }

### private
Cuando un miembro de clase es declarado con este modificador, solo es visible y accesible dentro de la misma clase.

     public class Persona {
        private String nombre;
        private int edad;
        private float estatura;
     }
  
### protected
Al igual que con private, las clases no pueden ser declaradas protected. Sí sus miembros.

    public class Persona {
        protected String nombre;
        protected int edad;
        protected float estatura;
    }
    
### public
Los miembros y clases declarados públicos son accesibles desde cualquier paquete.
    
    public class Persona {
        public String nombre;
        public int edad;
        public float estatura;
    }


### Herencia
Es el mecanismo por el cual una clase permite heredar las características (atributos y métodos) de otra clase. Una clase que se hereda se denomina superclase. La clase que hereda se llama subclase.
La declaramos en el tipo que desea heredar características de otro tipo mediante la palabra *extends*.

    public class Padre {
    }
    
    public class Hijo extends Padre {
    }
    