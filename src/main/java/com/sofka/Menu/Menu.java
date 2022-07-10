package com.sofka.Menu;

import com.sofka.Medicine.Medicine;
import com.sofka.Patient.Cat;
import com.sofka.Patient.Dog;
import com.sofka.Patient.Owner;
import com.sofka.Patient.Patient;
import com.sofka.appointment.Appointment;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

     private static Scanner sc = new Scanner(System.in);

    public static void menu(ArrayList<Dog> dogs, ArrayList<Cat> cats, ArrayList<Owner> owners , ArrayList<Appointment> appointments, ArrayList<Medicine> medicines) {

        boolean isActivated = true;
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

        while(isActivated){
            int answer = sc.nextInt();

            switch (answer){
                case 1 : Menu.menu1(dogs,cats,owners);
                break;
                case 2: Menu.menu2(dogs, cats, owners, appointments);
                break;
            }

            Menu.menu(dogs, cats, owners, appointments, medicines);
        }
    }

    public static int validationAge(){

        System.out.println("-------------------\nDatos del propietario ");
        System.out.println("Introduzca la edad: ");
        int ownerAge = sc.nextInt();
        if (ownerAge < 18) {
            System.out.println("No puede ingresar un propietario menor de 18 años");
            Menu.validationAge();
        }
        return ownerAge;
    }

    public static void menu1(ArrayList<Dog> dogs, ArrayList<Cat> cats, ArrayList<Owner> owners) {

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

                dogs.add(newDog);
                System.out.println(newDog.toString());


            }else{
                Cat newCat = new Cat(patientName, breed, own, vaccinated, registerDate);
                System.out.println(newCat.getName() + " fue inscrito correctamente");
                System.out.println("");
                System.out.println("-");
                System.out.println("-");
                System.out.println("");

                cats.add(newCat);
                System.out.println(newCat.toString());

            }

        }

        public static void menu2(ArrayList<Dog> dogs, ArrayList<Cat> cats, ArrayList<Owner> owners, ArrayList<Appointment> appointments){
            System.out.println("2,1 Crear cita");
            System.out.println("2,2 elimiar cita");

            double answer = sc.nextDouble();

            if(answer == 2.1){
                System.out.println("Ingrese por favor el Id de su mascota: ");
                int id = sc.nextInt();
                Dog useDog;
                Cat useCat;



                if(dogs.isEmpty() == true && cats.isEmpty() == true){

                }
                if(dogs.isEmpty()  == false) {
                    for (Dog dog : dogs) {
                        if (id == dog.getId()) {
                            useDog = dog;
                            sc.nextLine();
                            System.out.println("Ingrese el tipo de cita (Medica - Cirugía - Estética");
                            String appointmentType = sc.nextLine();

                            System.out.println("Ingrese la fecha en la que desea la cita (dd/mm/yyyy)");
                            String appointmentDay = sc.nextLine();

                            Appointment appointment = new Appointment(appointmentType, useDog, appointmentDay);
                            appointments.add(appointment);
                            System.out.println("Su cita fue creada exitosamente");
                            System.out.println(appointment.toString());
                            System.out.println(appointments);

                        } else {
                            System.out.println("Por favor, registre a su mascota");
                            Menu.menu1(dogs, cats, owners);
                        }
                    }
                }else {
                    System.out.println("Por favor, registre a su mascota");
                    Menu.menu1(dogs, cats, owners);
                }
            }else if(answer == 2.2){

                System.out.println("Por favor ingrese el ID de su mascota");
                int useId = sc.nextInt();

                if(appointments.isEmpty() == false) {
                    for (Appointment appointment : appointments) {
                        if (useId == appointment.getPatient().getId()) {
                            appointments.remove(appointment);
                            System.out.println("su cita fue eliminada exitosamente");
                            System.out.println(appointments);
                        } else System.out.println("su mascota no tiene citas asignadas");
                    }
                }else System.out.println("su mascota no tiene citas asignadas");
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