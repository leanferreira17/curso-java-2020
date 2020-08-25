# Java Básico 2020 - Módulo VI

### Programa
Estructuras de datos: ArrayList, TreeSet y HashMap. Algoritmos de ordenamiento. Collections. Excepciones: checked y 
unchecked. Try, catch, finally. Throws. Json.

### Estructuras de datos: ArrayList, TreeSet y HashMap
### ArrayList
Esta clase es similar a la estructura ya conocida del arreglo[], la diferencia radica en que los ArrayList
son de tamaño dinámico. Los arreglos no. Es beneficioso utilizarlos ya que poseen métodos bastante útiles.
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

### TreeSet
Esta clase maneja una estructura interna de tipo árbol. Los elementos se acomodan de forma ordenada segun su tipo.
https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html

### HashMap
Este objeto almacena los valores bajo la siguiente forma: "key/value" o "clave/valor". Como los dos anteriores, cuenta con 
diversos métodos para facilitarnos un poco la vida a todos.
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html


### Algoritmos de ordenamiento
https://es.wikipedia.org/wiki/Algoritmo_de_ordenamiento

### Collections
Veamos algunas facilidades que nos brinda esta clase.

### Excepciones
En Java existen dos tipos de excepciones:

- Las de tiempo de compilación (se deben controlar antes de ejecutar el programa) y
- Las de tiempo de ejecución (ocurren una vez que la aplicación se está ejecutando y no es obligatorio controlarlas).

Las excepciones en tiempo de ejecución pueden ocurrir cuando se produce un error en alguna de las instrucciones de nuestro programa, como por ejemplo cuando se hace una división entre cero, cuando un objeto es 'null' y no puede serlo, cuando no se abre correctamente un fichero, etc. Cuando se produce una excepción se muestra en la pantalla un mensaje de error y finaliza la ejecución del programa.

Cuando en Java se produce una excepción se crea un objeto de una determina clase (dependiendo del tipo de error que se haya producido) que mantendrá la información sobre el error producido y nos proporcionará los métodos necesarios para obtener dicha información. Estas clases tienen como clase padre a la clase Throwable, por lo tanto se mantiene una jerarquía en las excepciones.

### Excepciones checked vs unchecked
Todas las excepciones en Java heredan de Throwable subdividiéndose en Error y Exception, las primeras son condiciones de error del sistema y las segundas condiciones de error del programa. A su vez las Exception pueden ser checked si heredan de esta y son aquellas que el compilador fuerza a que sean capturadas no pudiendo ignorarse, han de capturarse en una construcción try catch o declarar que el método puede lanzar la excepción no capturada. Las excepciones uncheked heredan de RuntimeException que heredan a su vez de Exception pero tienen la particularidad de que no es necesario capturarlas ni declararlas como que se pueden lanzar debido a que se consideran condiciones de error en la programación como un acceso a un array fuera de rango que produce un ArrayIndexOutOfBounds, el conocido NullPointerException cuando se utiliza una referencia nula, otro es ArithmeticException que se produce al dividir por 0.


### Bloque Try - Catch - Finally

Java nos permite manejar las excepciones para que nuestro programa continue su ejecución y no se detenga cuando surja alguna. Para ello tenemos la estructura "try – catch – finally". Podemos obviar el finally o el catch pero nunca ambos. En el catch podemos agregar un bloque para cada posible excepción esperada y asi ejecutar un algoritmo diferente en cada caso. 


### JSON
JSON es el acrónimo para JavaScript Object Notation, y aunque su nombre lo diga, no es necesariamente parte de 
JavaScript, de hecho es un estándar basado en texto plano para el intercambio de información, por lo que se usa en 
muchos sistemas que requieren mostrar o enviar información para ser interpretada por otros sistemas, la ventaja de JSON 
al ser un formato que es independiente de cualquier lenguaje de programación, es que los servicios que comparten 
información por éste método, no necesitan hablar el mismo idioma, es decir, el emisor puede ser Java y el receptor PHP,
 cada lenguaje tiene su propia librería para codificar y decodificar cadenas de JSON.
 
 #### ¿Cómo se forma una cadena de JSON?
 
 El principio básico es con pares atributo-valor, éstos deben estar encerrados entre llaves { , } que es lo que 
 definen el inicio y el fin del objeto.
 
 Para entender ésto de mejor forma, vamos a formar un objeto JSON para los datos de una persona:
 	
    //Ejemplo de JSON para un objeto tipo Persona
    {
     "nombre":"Juan Vates",
     "edad":27,
     "nacionalidad":"Argentino",
     "altura":"172 cm",
     "peso":75,
     "casado":true
     }
     
JSON también puede almacenar arreglos y otros objetos:

    //Ejemplo de JSON para un objeto tipo Persona
    {
        "nombre":"Juan Vates",
        "edad":27,
        "nacionalidad":"Argentino",
        "altura":"172 cm",
        "peso":75,
        "casado":true,
        "cursosRealizados": ["matematica", "Golang", "Php"],
        "hijo": {
                    "nombre":"Pedro",
                    "edad": 12
                }
    }
    
Por último, si tuviera mas de un hijo deberiamos declarar un arreglo de objetos hijo

    {
         "nombre":"Juan Vates",
         "edad":27,
         "nacionalidad":"Argentino",
         "altura":"172 cm",
         "peso":75,
         "casado":true,
         "CursosRealizados": ["matematica", "Golang", "Php"],
         "hijos": [{
                        "nombre":"Pedro",
                        "edad": 12
                    },
                    {
                        "nombre":"Pedro",
                        "edad": 12
                    }]
    }
         
         
### Consejos útiles y temas fundamentales por aprender:
- NO reinventar la rueda
- Utilizar test unitarios siempre
- Utilizar patrones de diseño
- Utilizar frameworks (Spring, Hibernate, etc...)
