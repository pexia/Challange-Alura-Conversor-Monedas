package com.pexdev.conversor.ui;

import com.pexdev.conversor.model.Moneda;
import com.pexdev.conversor.service.ConsultaMoneda;
import com.pexdev.conversor.service.ConversorDatos;

import java.util.Scanner;

public class Menu {
    private final Scanner lectura = new Scanner(System.in);
    private final ConsultaMoneda consulta = new ConsultaMoneda();
    private final ConversorDatos conversor = new ConversorDatos();

    private final String[] listaMonedas = {
            "ARS", // Peso Argentino
            "USD", // Dólar Estadounidense
            "EUR", // Euro
            "BRL", // Real Brasileño
            "CLP", // Peso Chileno
            "UYU", // Peso Uruguayo
            "CNY", // Yuan Chino
            "PYG", // Guaraní Paraguayo
            "BOB", // Boliviano
            "GBP", // Libra Esterlina
            "MXN", // Peso Mexicano
            "COP", // Peso Colombiano
            "PEN", // Sol Peruano
            "JPY"  // Yen Japonés
    };


    public void mostrarMenu() {
        int opcion = 0;
        while (opcion != 2) {
            System.out.println("\n=== CONVERSOR DE MONEDAS ===");
            System.out.println("1) Realizar nueva conversión");
            System.out.println("2) Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(lectura.nextLine());
                if (opcion == 1) {
                    iniciarConversion();
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        System.out.println("Gracias por utilizar el conversor de monedas!!");
    }

    private void iniciarConversion() {
        // 1. Seleccionar Moneda Base
        String base = seleccionarMoneda("Seleccione la moneda de ORIGEN:");

        // 2. Seleccionar Moneda Objetivo
        String objetivo = seleccionarMoneda("Seleccione la moneda de DESTINO:");

        // 3. Ingresar Monto
        System.out.print("Ingrese el monto a convertir: ");
        try {
            double monto = Double.parseDouble(lectura.nextLine());

            String json = consulta.consultar(base, objetivo, monto);
            Moneda moneda = conversor.formatearJson(json);

            System.out.println("\n-------------------------------------------");
            System.out.printf("Resultado: %.2f %s son %.2f %s",
                    monto, base, moneda.conversion_result(), objetivo);
            System.out.println("-------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error en la conversión: " + e.getMessage());
        }


    }

    private String seleccionarMoneda(String mensaje) {
        System.out.println("\n" + mensaje);
        for (int i = 0; i < listaMonedas.length; i++) {
            System.out.printf("%d) %s%n", (i + 1), listaMonedas[i]);
        }

        while (true) {
            try {
                System.out.print("Elija el número de la moneda: ");
                int seleccion = Integer.parseInt(lectura.nextLine());
                if (seleccion >= 1 && seleccion <= listaMonedas.length) {
                    return listaMonedas[seleccion - 1];
                }
                System.out.println("Opción fuera de rango. Reintente.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese el número de la opción.");
            }
        }
    }

}
