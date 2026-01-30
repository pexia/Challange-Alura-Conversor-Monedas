# Challange-Alura-Conversor-Monedas

🪙 Conversor de Moneda

Este proyecto es una aplicación de consola desarrollada en Java que permite convertir valores entre distintas monedas utilizando tasas de cambio obtenidas desde la API de ExchangeRate.

La app guía al usuario mediante un menú interactivo, permitiéndole:

Seleccionar moneda de origen.

Seleccionar moneda de destino.

Ingresar un monto.

Obtener el valor convertido en tiempo real.


🚀 Funcionalidades

Conversión entre monedas. 

Consulta en tiempo real a la API ExchangeRate.

Menú interactivo por consola.

Validación básica de entradas.

🛠 Tecnologías utilizadas

Java
API ExchangeRate
HttpClient
Programación Orientada a Objetos


▶️ Ejecución del proyecto

Descargar o clonar el proyecto.

Abrirlo en tu IDE.

Ejecutar la clase:

Main.java

Seguir las instrucciones que aparecen en la consola.


🔑 Configuración de la API Key

La aplicación utiliza la API de ExchangeRate:

👉 https://www.exchangerate-api.com/

Para que funcione correctamente debes usar tu propia API Key.

📌 Paso 1 – Obtener tu API Key

Ingresar a:
https://www.exchangerate-api.com/

Registrarse gratuitamente.

Copiar tu API Key personal.

📌 Paso 2 – Insertar la API Key en el proyecto

Abrir la clase:

ConsultaMoneda.java


Dentro encontrarás esta línea:

private final String apiKey = "8bc8b2a0c9caa761b44ff0e3"; //Escriba aqui su ApiKey de ExchangeRate


Reemplázala por tu propia clave:

private final String apiKey = "TU_API_KEY_AQUI";


Luego la URL base se completa internamente con:

https://v6.exchangerate-api.com/v6/


⚠️ Importante:
No compartas tu API Key en repositorios públicos.

💱 Modificar las monedas disponibles

Las monedas que ofrece la aplicación están hardcodeadas.

Puedes consultar las monedas válidas en la documentación oficial de la API:

👉 https://www.exchangerate-api.com/docs/supported-currencies

📌 Paso 1 – Elegir monedas válidas

En la web encontrarás códigos como:

USD - United States Dollar  
ARS - Argentine Peso  
EUR - Euro  
JPY - Japanese Yen  
BRL - Brazilian Real


Debes usar siempre los códigos de 3 letras.

📌 Paso 2 – Modificar la lista de monedas

Abrí la clase:

Menu.java


Dentro encontrarás el arreglo:

private final String[] listaMonedas = {
"ARS",
"USD",
...
};


Podés reemplazar o agregar monedas, por ejemplo:

private final String[] listaMonedas = {
"USD",
"EUR",
"ARS",
"BRL",
"JPY"
};


Estas serán las monedas que el usuario verá en el menú.

📌 Paso 3 – Guardar y ejecutar

Una vez modificada la lista:

Guardar el archivo.

Ejecutar nuevamente Main.java.

La app mostrará automáticamente las nuevas monedas.

🎓 Nota académica

Este proyecto se desarrolla con fines educativos.

Por el momento:

La API Key se define manualmente.

Las monedas están hardcodeadas.

No se usa configuración externa.

No se implementa persistencia.

El objetivo es comprender primero la lógica base antes de escalar a implementaciones más complejas.

📌 Posibles mejoras futuras

Historial de conversiones.

Cache de tasas.

Interfaz gráfica.

Configuración externa.

Manejo avanzado de errores.

👤 Autor

Proyecto desarrollado con fines académicos por peripe.