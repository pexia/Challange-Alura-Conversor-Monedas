package com.pexdev.conversor.service;

import com.google.gson.Gson;
import com.pexdev.conversor.model.Moneda;

public class ConversorDatos {

    public Moneda formatearJson(String json) {
        try {
            Gson gson = new Gson();
            return gson.fromJson(json, Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al transformar los datos de la moneda");
        }
    }
}
