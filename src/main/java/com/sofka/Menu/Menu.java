package com.sofka.Menu;

import com.sofka.Medicine.Medicine;
import com.sofka.Patient.*;
import com.sofka.appointment.Appointment;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);

    public static void menu(ArrayList<Patient> pacient, ArrayList<Owner> owners, ArrayList<Appointment> appointments, ArrayList<Medicine> pills, ArrayList<Medicine> syrup, ArrayList<Medicine> petCare, boolean isActivated) {

        while (isActivated) {
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


            int answer = sc.nextInt();
            sc.nextLine();

            switch (answer){
                case 1:
                    Menu.menu1(pacient, owners);
                    break;
                case 2:
                    Menu.menu2(pacient, owners, appointments);
                    break;
                case 3:
                    Menu.menu3();
                    break;
                case 4:
                    Menu.menu4(pills, syrup, petCare);
                    break;
                case 5:
                    isActivated = false;
                    break;
            }
            Menu.menu(pacient, owners, appointments, pills, syrup, petCare, isActivated);
        }

    }

    public static void menu3(){
        System.out.println("Elige que procedimiento deseas\n 3,1 cirugia\n 3,2 medica \n 3,3 estetica" );
        double ans3 = sc.nextDouble();

        int totalPrice = 0;

        if(ans3 == 3.1){
            totalPrice = Prices.getPriceSurgery();
        }
        if(ans3 == 3.2){
            totalPrice = Prices.getPriceMed();
        }
        if(ans3 == 3.3){
            totalPrice = Prices.getPriceStylist();
        }

        System.out.println("Elige la medicina que deseas\n 3,1 Dolex\n 3,2 paracetamol \n 3,3 Clorhexin\n 3,4 Bismopet\n 3,5 ivomec \n 3,6 Vaporub\n" );
        sc.nextLine();
        ans3 = sc.nextDouble();

        if(ans3 == 3.1){
            totalPrice += Prices.getPriceDolex();
        }
        if(ans3 == 3.2){
            totalPrice += Prices.getPriceparacetamol();
        }
        if(ans3 == 3.3){
            totalPrice += Prices.getPriceClorhexin();
        }
        if(ans3 == 3.4){
            totalPrice += Prices.getPriceVismopet();
        }
        if(ans3 == 3.5){
            totalPrice += Prices.getPriceivomec();
        }
        if(ans3 == 3.6){
            totalPrice += Prices.getPriceVaporhub();
        }

        System.out.println("El valor total a pagar es de " + totalPrice +"$ pesos. ");


    }

    public static void menu4(ArrayList<Medicine> pills, ArrayList<Medicine> syrup, ArrayList<Medicine> petCare){
        System.out.println("Por favor ingrese una opción \n 4,1 Pildoras \n 4,2 Jarabe \n 4,3 Pet Care");
        Double ans4 = sc.nextDouble();

        if (ans4 == 4.1) {
            System.out.println(pills);
        }
        if (ans4 == 4.2){
            System.out.println(syrup);
        }
        if (ans4 == 4.3 ) {
            System.out.println(petCare);
        }

    }

    public static int validationAge() {

        System.out.println("-------------------\nDatos del propietario ");
        System.out.println("Introduzca la edad: ");
        int ownerAge = sc.nextInt();
        if (ownerAge < 18) {
            System.out.println("No puede ingresar un propietario menor de 18 años");
            Menu.validationAge();
        }
        return ownerAge;
    }

    public static void menu1(ArrayList<Patient> pacient, ArrayList<Owner> owners) {

        int ownerAge = Menu.validationAge();

        System.out.println("-------------------");
        System.out.println("Introduzca DNI:");
        sc.nextLine();
        String dni = sc.nextLine();

        System.out.println("Introduzca nombre: ");
        String ownerName = sc.nextLine();

        System.out.println("Introduzca surname: ");
        String surname = sc.nextLine();

        System.out.println("Introduzca el celular: ");
        String cellphone = sc.nextLine();


        Owner own = new Owner(dni, ownerName, surname, cellphone, ownerAge);

        owners.add(own);

        System.out.println("Ingrese los datos del paciente \n Introduzca nombre:");
        String patientName = sc.nextLine();
        System.out.println("Introduzca la raza: ");
        String breed = sc.nextLine();
        System.out.println("¿Está vacunado?: true - false");
        boolean vaccinated = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Ingrese la fecha de desparacitacion: dd/mm/yyyy");
        String registerDate = sc.nextLine();

        System.out.println("Perro - Gato");
        String animalType = sc.nextLine();
        if (animalType.equalsIgnoreCase("Perro")) {
            //Without ClinicNumber
            Dog newDog = new Dog(patientName, breed, own, vaccinated, registerDate);
            System.out.println(newDog.getName() + " fue inscrito correctamente");
            System.out.println("");
            System.out.println("-");
            System.out.println("-");
            System.out.println("");

            pacient.add(newDog);
            System.out.println(newDog.toString());


        } else {
            Cat newCat = new Cat(patientName, breed, own, vaccinated, registerDate);
            System.out.println(newCat.getName() + " fue inscrito correctamente");
            System.out.println("");
            System.out.println("-");
            System.out.println("-");
            System.out.println("");

            pacient.add(newCat);
            System.out.println(newCat.toString());

        }

    }
    public static void menu2(ArrayList<Patient> pacient, ArrayList<Owner> owners, ArrayList<Appointment> appointments) {
        System.out.println("2,1 Crear cita");
        System.out.println("2,2 elimiar cita");

        double answer = sc.nextDouble();

        if (answer == 2.1) {
            Appointment idAppointment;
            System.out.println("Ingrese por favor el Id de su mascota: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (pacient.isEmpty() == false) {
                for (Patient p : pacient) {
                    if (id == p.getId()) {
                        Patient pt = p;

                        System.out.println("Ingrese el tipo de cita (Medica - Cirugía - Estética");
                        String appointmentType = sc.nextLine();

                        System.out.println("Ingrese la fecha en la que desea la cita (dd/mm/yyyy)");
                        String appointmentDay = sc.nextLine();

                        Appointment appointment = new Appointment(appointmentType, pt, appointmentDay);
                        appointments.add(appointment);
                        System.out.println("Su cita fue creada exitosamente");
                        System.out.println(appointments);
                    } else {
                        System.out.println("Por favor, registre al paciente");
                        Menu.menu1(pacient, owners);
                    }
                }
            }else{

                System.out.println("Por favor, registre al paciente");
                Menu.menu1(pacient, owners);}
        } else if (answer == 2.2) {

            Appointment idAppointment = null;
            System.out.println("Por favor ingrese el ID de su mascota");
            int useId = sc.nextInt();

            
            if (appointments.isEmpty() == false) {
                for (Appointment appointment : appointments) {
                    if (useId == appointment.getPatient().getId()) {
                        idAppointment = appointment;
                        System.out.println("su cita fue eliminada exitosamente");
                        System.out.println(appointments);

                    }
                }
                appointments.remove(idAppointment);
                System.out.println(appointments);
            } else System.out.println("su mascota no tiene citas asignadas");
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