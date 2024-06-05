package com.verifyCep.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultCep {

    public static void consultCep(String providedCep) throws IOException, InterruptedException {

        // Creating objects
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        // Defining a consulting structure
        String apiRequested = "https://viacep.com.br/ws/" + providedCep + "/json/";

        try {
            // Request API
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiRequested))
                    .build();
            // Response API
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers
                            .ofString());

            // Transform from JSON using GSON library
            String json = response.body();
            AddressRecord fromJsonFormated = gson.fromJson(json, AddressRecord.class);
            AddressClass addressWithRecordFormat = new AddressClass(fromJsonFormated);

            // Print the formated AddressRecord
            System.out.println(addressWithRecordFormat);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("404: Invalid CEP!");
        }
    }
}
