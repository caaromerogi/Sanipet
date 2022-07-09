package com.sofka.Menu;

import com.sofka.Patient.Cat;
import com.sofka.Patient.Dog;
import com.sofka.Patient.Owner;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        //Menú
        System.out.println("Sanipet - Veterinary care center");
        System.out.println("");
        System.out.println("1. Register patient");
        System.out.println("2. Appointments");
        System.out.println("     2.1 By day");
        System.out.println("     2.2 By Doctor");
        System.out.println("     2.3 By stylist");
        System.out.println("3. Billing");
        System.out.println("4. Medicine stock");
        System.out.println("     4.1 Pills");
        System.out.println("     4.2 Syrup");
        System.out.println("     4.3 Pet Care");
        System.out.println("5. Exit");
    }

    public static void menu1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Datos del propietario \nIntroduzca DNI:");
        String dni = sc.nextLine();

        System.out.println("Introduzca nombre: ");
        String ownerName = sc.nextLine();

        System.out.println("Introduzca surname: ");
        String surname = sc.nextLine();

        System.out.println("Introduzca el celular: ");
        String cellphone = sc.nextLine();

        System.out.println("Introduzca la edad: ");
        int ownerAge = sc.nextInt();

        if (ownerAge < 18) {
            System.out.println("No puede ingresar un propietario menor de 18 años");

        } else {
            Owner own = new Owner(dni, ownerName, surname, cellphone, ownerAge);
            sc.nextLine();
            System.out.println("Ingrese los datos del paciente \n Introduzca nombre:");
            String patientName = sc.nextLine();
            System.out.println("Introduzca la raza: ");
            String breed = sc.nextLine();
            System.out.println("¿Está vacunado?: true - false");
            boolean vaccinated = sc.nextBoolean();
            System.out.println("Ingrese la fecha de registro: dd/mm/yyyy");
            String registerDate = sc.nextLine();
            System.out.println("Perro - Gato");
            String animalType = sc.nextLine();
            if (animalType.equalsIgnoreCase("Perro")) {
                //Without ClinicNumber
                Dog newDog = new Dog(patientName, breed, own, vaccinated, registerDate);
                System.out.println(newDog.getName() + " fue inscrito correctamente");
            }else{
                Cat newCat = new Cat(patientName, breed, own, vaccinated, registerDate);

            }

        }
    }
}
/*
try{
boolean vaccinated = sc.nextBoolean();
}catch (Exception e) {
e.printStackTrace();
System.out.println("Solo se permite ingresar 'true' o 'false'");
boolean vaccinated = sc.nextBoolean();
            }
 */