# Java Básico 2020 - Módulo V

### Programa
Polimorfismo: concepto. Abstracción: concepto. Clases abstractas y estáticas.Uso de final. Uso de instanceof. 
Operador ternario. Interfaces.

### Polimorfismo
Se refiere a la propiedad por la que es posible enviar mensajes sintácticamente iguales a objetos de tipos distintos. El único requisito que deben cumplir los objetos es saber responder al mensaje que se les envía.

### Abstracción
Pensar en términos de objetos es muy parecido a cómo lo haríamos en la vida real. Una analogía sería modelizar un auto en un esquema de POO. Diríamos que el auto es el elemento principal que tiene una serie de características, como podrían ser el color, el modelo o la marca. La capacidad de reconocer los elementos comúnes y generalizarlos es lo que llamamos justamente abstracción.
Clases concretas, estáticas y abstractas

Una clase es una plantilla que define la forma de un objeto. Los objetos son instancias de una clase.


### Clase Abstracta (abstract class)
Son clases que no pueden ser instanciadas, es decir, no se pueden crear objetos a partir de ellas. 
Sirven como superclases para sus clases hijas.

    public abstract class Persona {
        protected String especie = "Humana";
    
        public abstract String getEspecie();
    }

Sus métodos tiene las siguientes características:
- No tienen cuerpo (llaves): sólo constan de signatura con paréntesis.
- Su signatura termina con un punto y coma.
- Los métodos abstractos sólo pueden existir dentro de una clase abstracta. 
De esta forma se evita que haya métodos que no se puedan ejecutar dentro de clases concretas. 
Visto de otra manera, si una clase incluye un método abstracto, forzosamente la clase será una clase abstracta.
- Los métodos abstractos forzosamente habrán de estar sobreescritos en las subclases. 
Si una subclase no implementa un método abstracto de la superclase tiene un método no ejecutable, 
lo que la fuerza a ser una subclase abstracta. 
Para que la subclase sea concreta habrá de implementar métodos sobreescritos para todos los métodos abstractos 
de sus superclases.

### Clase Estática (static class)
En Java tenemos 2 contextos, el estático y el dinámico. Pensemoslos como dos universos o espacios separados.
El contexto estático es el universo de las plantillas o clases y el contexto dinámico es el universo de los objetos.

Desde un contexto dinámico podemos acceder a otro estático, pero no al revés. Desde un contexto estático NO podemos
acceder a uno dinámico.

### Sintaxis
Los atributos y métodos que esten marcados como *static* son asociados a la clase, por lo tanto pertenecen
al contexto estático. Los demas que no estan marcados pertenecen a la instancia u objeto de la clase. 
    
    public class EstadisticasCovid19Argentina {
        public static long estimacionDeCasosPorDia = 2000; // estatico
        public static final int cantidadDeDiasPromedioMensual = 30; // estatico
        public static long casos = 0; // estático
        private String version = "1.0.0 A"; // dinámico
    
        // método asociado al contexto estático
        public static void incrementarContadorDeEnfermos(long cantidadDeEnfermos) {
            casos += cantidadDeEnfermos;
        }
    
        // método asociado al contexto estático
        public static long getCasos() {
            return casos;
        }
    
        // método asociado al contexto dinámico
        public String getVersion() {
            return this.version;
        }
    }

La directiva static permite el acceso a métodos y variables de clase sin la necesidad de instanciar un objeto 
de dicha clase, permitiendo la inicialización de forma cómoda y durante la carga de clase. 
Además los import estáticos mejoran la legibilidad de nuestro código, 
así como las clases estáticas internas la cohesión.
Todo lo que sea estático es compartido por las instancias de esa clase.


#### Uso del *final*
Este modificador define las siguientes restricciones:
- Utilizada en variables: no permite que el valor sea cambiado. Es una especie de candado.
- Utilizada en metodos: no permite la re definicion de un método en una subclase. No permite sobreescribirlos.
- Utilizada en objetos: no permite heredar. Evita la creación de una subclase.

### Variables constantes en Java
Cuando tenemos definida una variable como: 

    public static final int anio = 2020;
    public static final float indiceDeInflacion = 0.20F;

Utilizando la siguiente estructura de definición: public + static + final, se dice que estamos ante una variable
constante, por lo cual la sintaxis deberia ser de esta forma:

    public static final int ANIO = 2020;
    public static final float INDICE_DE_INFLACION = 0.20F; 

### Uso de instanceof
El operador instanceof sirve para conocer si un objeto es de un tipo determinado. 
De manera resumida podemos comprobar si nuestro objeto apunta a determinada clase.

    if (objetoPersona instanceof Object) {
        // es true, ya que todos los objetos heredan de Object
    }

    
    
### Uso del operador ternario
Es la forma resumida del bloque if else:

    (condicion) ? valor a asignar si es true : valor a asignar si es false;
    
    String mensaje = (objetoAbuelo instanceof Object) ? "Es una instancia de Object" : "La pifiaste";
    System.out.println(mensaje);

    
### Interfaces
Una interfaz es como una clase Java pero solo tiene constantes estáticas y métodos abstractos. Java usa la interfaz para implementar herencia múltiple. Una clase Java puede implementar múltiples interfaces Java. Todos los métodos en una interfaz son implícitamente públicos y abstractos.
Diferencias entre Interfaces y Clases Abstractas

- La diferencia principal es que los métodos de las interfaces son implicitamente abstractos y no pueden tener implementaciones. Una clase abstracta Java puede tener métodos de instancia que implementan un comportamiento por default.
- Todas las variables declaradas en una interface son de tipo final por default. Una clase abstracta puede contener variables que no sean final.
- Los miembros de una interface son publicos por default. En una clase abstracta los miembros pueden ser private, public, protected.
- Una interface deberia ser implementada utilizando la palabra reservada "implements"; una clase abstracta deberia ser heredada utilizando la palabra "extends".
- Una interface puede heredar solo de otra interface, una clase abstracta puede heredar de otra clase e implementar multiples interfaces.
- Una clase puede implementar múltiples interfaces pero solo puede heredar de una clase padre.
