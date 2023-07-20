package ServicioPOSTMAN;
// QUE ES POSTMAN?
//
// Postman es una aplicacion para realizar pruebas o peticiones contra API's utilizando el protocolo http
// Y al obtener las respuestas se pueden ejecutar tests para verficar que algo funciona o que algo no funciona
// Principalmente se utiliza a la hora de depurar API's o de invocar API's manualmente sin utilizar herramientas
// de lineas de comando como curl
// Con PostMan podemos enviar peticiones directamente a la API de facebook o twitter e interactuar con ella

// COMO CREAMOS UNA PETICION UTILIZANDO POSTMAN?
//
// -Entremos a la coleccion que queramos, le damos a la flechita para que se despliegue
// -Clikamos en add a request. Y se nos abrira el formulario de peticiones.
// -En new request le vamos a dar un titulo a la peticion. En el desplegable de debajo utilizaremos uno de los metodos
// -http que soporte mi destino osea mi aplicacion web
// "headers" postman envia una serie de peticiones o cabeceras al servidor. Estas se pueden modificar.
// "body" es donde esta la respuesta la podemos ver en "pretty";"raw"(raw con formato);"preview";"visualize"

// Peticion en json; En body marcamos en raw
// "nombre": "Prueba en Postman",
// "valor": 1.2345

// CREAR UNA VARIABLE
//
// "Variables"
// Definimos la variable url. Si cambiamos de puerto con cambiarlo en la variable de mi conexion se sustituye en las llamadas de postman

// ENTORNOS - ENVIROMENT
// Un entorno es una coleccion de variables
//
// Como se crea?

// SCOPE
// Es donde has definido la variable que en ese momento tiene uso.

//Status 200 - OK

// TESTS
//pm.test("Estado es 200", function() {
//    pm.response.to.have.status(200);
//});
//  
//pm.test("Primer elemento es uno", function() {
// reply = pm.response.json();
// pm.expect(reply[0].nombre).nombre).to.eql("uno");
//});
//
//TEST DE LATENCIA
//pm.test("Respuesta en menos de 15ms", () => {
//    pm.expected(pm.response.responseTime).to.be.below(10);
//});
//
public class Main {
}
