Abrir una terminal en el directorio donde tengamos el archivo rest-service.jar y tipear:
        
        java -jar rest-service.jar

Eso corre nuestro server en el siguiente puerto:

        localhost:8080
        
Para recuperar las frases célebres guardadas hacer un GET a:

        http://localhost:8080/listado
        
Para insertar una nueva frase célebre hacer un PUT a:

        http://localhost:8080/insertar
        
Con la siguiente forma:

        {
            "frase":"frase célebre",
            "autor": "nombre del autor"
        }
        
Para limpiar el listado en el server hacer un POST a:

        http://localhost:8080/limpiar
        
        
En backend.zip tienen el proyecto para modificarlo a gusto. 
Para crear un nuevo archivo .jar deben abrir la solapa de Maven y correr "clean", luego "install". 
Eso genera un nuevo archivo .jar dentro de la carpeta "target". Solo tiene que volver a correr el .jar
con el comando: 

        java -jar rest-service.jar
        
        
Éxitos!