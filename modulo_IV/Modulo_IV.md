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
    
En Java todas las clases heredan de la clase Object, aunque no lo hagamos de manera explícita. 
El compilador de Java (si, el mismo que nos agregaba de una el constructor sin parámetros) nos 
agrega esta herencia sin consultarnos.

    public class Persona {
    }

    public class Persona extends Object {
    }
    
Por cuando creamos un objeto de nuestra clase Persona podemos acceder a métodos que nunca definimos,
los estamos heredando de la super clase Object.
    
A tener en cuenta:
- En Java solo podremos encontrar lo que se conoce como herencia simple, ya que solo podremos heredar de un solo tipo
- Los atributos y métodos de la clase padre que sean privados no podrá ser heredados por sus hijos
- Los atributos y métodos de la clase padre que tengan protected como modificador seran visibles para
los hijos aunque nos encontremos en otro paquete
- Los métodos constructores no se heredan

### Accediendo al constructor de la clase padre
Para poder hacer uso del constructor de la clase padre utilizamos (desde la clase hija) la llamada a
*super()*

Para acceder a los miembros de la clase padre utilizamos la palabra *super*

### Polimorfismo
Se refiere a la propiedad por la que es posible enviar mensajes sintácticamente iguales a objetos de tipos distintos. El único requisito que deben cumplir los objetos es saber responder al mensaje que se les envía.

### Abstracción
Pensar en términos de objetos es muy parecido a cómo lo haríamos en la vida real. Una analogía sería modelizar un auto en un esquema de POO. Diríamos que el auto es el elemento principal que tiene una serie de características, como podrían ser el color, el modelo o la marca. La capacidad de reconocer los elementos comúnes y generalizarlos es lo que llamamos justamente abstracción.
Clases concretas, estáticas y abstractas

Una clase es una plantilla que define la forma de un objeto. Los objetos son instancias de una clase.


### Clase Abstracta (abstract class)
Son clases que no pueden ser instanciadas, es decir, no se pueden crear objetos a partir de ellas. Sirven como superclases para sus clases hijas.

Sus características son:
- No tienen cuerpo (llaves): sólo constan de signatura con paréntesis.
- Su signatura termina con un punto y coma.
- Los métodos abstractos sólo pueden existir dentro de una clase abstracta. De esta forma se evita que haya métodos que no se puedan ejecutar dentro de clases concretas. Visto de otra manera, si una clase incluye un método abstracto, forzosamente la clase será una clase abstracta.
- Los métodos abstractos forzosamente habrán de estar sobreescritos en las subclases. Si una subclase no implementa un método abstracto de la superclase tiene un método no ejecutable, lo que la fuerza a ser una subclase abstracta. Para que la subclase sea concreta habrá de implementar métodos sobreescritos para todos los métodos abstractos de sus superclases.

### Clase Estática (static class)
La directiva static permite el acceso a métodos y variables de clase sin la necesidad de instanciar un objeto de dicha clase, permitiendo la inicialización de forma cómoda y durante la carga de clase. Además, los import estáticos mejoran la legibilidad de nuestro código, así como las clases estáticas internas la cohesión.

### Uso de instanceof
El operador instanceof sirve para conocer si un objeto es de un tipo determinado. Por tipo, nos referimos a clase o interfaz (interface), es decir, si el objeto pasaría el test «ES UN» para esa clase o ese interfaz, especificado a la derecha del operador. 