# Challange-Alura-Conversor-Monedas

📌 Descripción

Conversor de Moneda es una aplicación de consola desarrollada en Java que permite convertir valores entre distintas monedas utilizando tasas de cambio obtenidas desde la API de ExchangeRate.

El usuario puede:

Seleccionar moneda de origen.

Seleccionar moneda de destino.

Ingresar un monto.
    
Obtener el valor convertido en tiempo real.



🚀 Funcionalidades

✅ Conversión entre monedas.

✅ Consulta en tiempo real a la API.

✅ Menú interactivo por consola.

✅ Validación básica de entradas.

✅ Código organizado por clases.

🛠 Tecnologías

Java

HttpClient

ExchangeRate API

Programación Orientada a Objetos

📁 Estructura del proyecto
com.pexdev.conversor
│
├── Main.java
├── Menu.java
├── Moneda.java
├── ConsultaMoneda.java
└── ConversorDatos.java

▶️ Cómo ejecutar

Cloná o descargá el proyecto.

Abrilo en tu IDE.

Ejecutá la clase:

Main.java


Seguí las instrucciones en consola.

🔑 Configuración de la API Key

La app utiliza la API de ExchangeRate:

👉 https://www.exchangerate-api.com/

1️⃣ Obtener tu API Key

Entrar en
https://www.exchangerate-api.com/

Registrarse.

Copiar la API Key personal.

2️⃣ Insertar la API Key

Abrí el archivo:

ConsultaMoneda.java


Buscá esta línea:

private final String apiKey = "8bc8b2a0c9caa761b44ff0e3"; //Escriba aqui su ApiKey de ExchangeRate

Reemplazala por:

private final String apiKey = "TU_API_KEY_AQUI";

⚠️ No publiques tu API Key en repositorios públicos.

💱 Modificar las monedas disponibles

Las monedas están hardcodeadas en el menú.

Podés consultar las soportadas en:

👉 https://www.exchangerate-api.com/docs/supported-currencies

1️⃣ Elegir monedas

Ejemplos válidos:

USD - United States Dollar  
ARS - Argentine Peso  
EUR - Euro  
BRL - Brazilian Real  
JPY - Japanese Yen  

2️⃣ Editar la lista

Abrí:

Menu.java


Encontrarás:

private final String[] listaMonedas = {
    "ARS",
    "USD"
};


Podés modificarla así:

private final String[] listaMonedas = {
    "USD",
    "EUR",
    "ARS",
    "BRL",
    "JPY"
};


Estas monedas se mostrarán automáticamente en el menú.

3️⃣ Ejecutar nuevamente

Guardá los cambios y ejecutá Main.java.


👤 Autor

Desarrollado con fines académicos por pexiaDev.
