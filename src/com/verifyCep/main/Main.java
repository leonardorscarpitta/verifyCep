package com.verifyCep.main;

import com.verifyCep.models.AddressClass;
import com.verifyCep.models.ConsultCep;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Creating objects
        Scanner readInfo = new Scanner(System.in);
        // Defining attributes
        String providedCep = "";
        String divider = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";

        while (true) {
            System.out.println(divider);
            System.out.println("Provide a valid Brazilian CEP to check informations about it:");
            System.out.println(divider);

            providedCep = readInfo.nextLine();
            if (! providedCep.equals("0")) {
                ConsultCep.consultCep(providedCep);
            } else {
                break;
            }
        }

        System.out.println("Program finished with success!");
    }
}
