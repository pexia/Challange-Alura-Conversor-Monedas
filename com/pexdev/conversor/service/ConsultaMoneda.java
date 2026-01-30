package com.pexdev.conversor.service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    private final String apiKey = "AQUI-TU-API-KEY"; //Escriba aqui su ApiKey de ExchangeRate
    private final String URL = "https://v6.exchangerate-api.com/v6/";

        public String consultar(String monedaBase, String monedaObjetivo, double monto) {

        //Url Final para la solicitud
        String urlFinal = URL + apiKey + "/pair/" + monedaBase + "/" + monedaObjetivo + "/" + monto;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest solicitud = HttpRequest.newBuilder(URI.create(urlFinal)).build();

        try {
            HttpResponse<String> response = client.send(solicitud, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (Exception e) {
            return "Error al realizar la consulta: " + e.getMessage();
        }
    }
}
