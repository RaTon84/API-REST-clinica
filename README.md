#  API-REST JAVA-SpringBoot
## Clinica medica

#### Tecnologia/practicas usadas

- •	Usar la clase ResponseEntity, de Spring, para personalizar los retornos de los métodos de una clase Controller

  •	Modificar el código HTTP devuelto en las respuestas de la API;

  •	Agregar encabezados a las respuestas de la API;

  •	Utilice los códigos HTTP más apropiados para cada operación realizada en la API.
  

- •	Crear una clase para aislar el manejo de excepciones de API, utilizando la anotación @RestControllerAdvice.
  
  •	Utilizar la anotación @ExceptionHandler, de Spring, para indicar qué excepción debe capturar un determinado método de la clase de manejo de errores.
  
  •	Manejar errores 404 (Not Found) en la clase de manejo de errores.
  
  •	Manejar errores 400 (Bad Request), para errores de validación de Bean Validation, en la clase de manejo de errores.
  
  •	Simplificar el JSON devuelto por la API en casos de error de validación de Bean Validation.
  

- •	Identificar cómo funciona el proceso de autenticación y autorización en una API Rest.

  •	Agregar Spring Security al proyecto.
  
  •	Cómo funciona el comportamiento padrón de Spring Security en una aplicación.
  
  •	Implementar el proceso de autenticación en la API, de forma Stateless, utilizando clases y configuraciones de Spring Security.
  

- •	Agregar la biblioteca Auth0 java-jwt como una dependencia del proyecto.
  
  •	Utilizar esta biblioteca para generar un token en la API.
  
  •	Inyectar una propiedad del archivo application.properties en una clase administrada por Spring, usando la anotación @Value.
  
  •	Devolver un token generado en la API cuando un usuario se autentica.

- •	Los Filters funcionan en una solicitud;
•	Implementar un Filter creando una clase que herede de la clase OncePerRequestFilter de Spring;
•	Utilizar la biblioteca Auth0 java-jwt para validar los tokens recibidos en la API;
•	Realizar el proceso de autenticación de la solicitud, utilizando la clase SecurityContextHolder de Spring;
•	Liberar y restringir solicitudes, según la URL y el verbo del protocolo HTTP.
