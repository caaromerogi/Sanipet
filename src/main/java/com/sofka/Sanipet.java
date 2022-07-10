package com.sofka;


import com.sofka.Employee.Doctor;
import com.sofka.Employee.Stylist;
import com.sofka.Medicine.Medicine;
import com.sofka.Medicine.presentation;
import com.sofka.Medicine.quantity;
import com.sofka.Medicine.usage;
import com.sofka.Menu.Menu;
import com.sofka.Patient.Cat;
import com.sofka.Patient.Dog;
import com.sofka.Patient.Owner;
import com.sofka.Patient.Patient;
import com.sofka.appointment.Appointment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sanipet {


    public static void main(String[] args) {
        boolean isActivated = true;

        HashMap<String,String> schDoc1 = new HashMap<>();
        schDoc1.put("Monday", "08:00-19:00");
        schDoc1.put("Tuesday", "08:00-19:00");
        schDoc1.put("Wednesday", "08:00-19:00");

        HashMap<String,String> schDoc2 = new HashMap<String, String>();

        schDoc2.put("Thursday", "08:00-19:00");
        schDoc2.put("Friday", "08:00-19:00");
        schDoc2.put("Saturday", "09:00-15:00");

        HashMap<String,String> schSty = new HashMap<String, String>();
        schSty.put("Monday", "08:00-16:00");
        schSty.put("Tuesday", "08:00-16:00");
        schSty.put("Wednesday", "09:00-16:00");
        schSty.put("Thursday", "08:00-16:00");
        schSty.put("Friday", "08:00-16:00");
        schSty.put("Saturday", "09:00-15:00");

        Medicine dolex = new Medicine("Dolex", presentation.PILLS, usage.HUMAN, quantity.GR, 500);

        Medicine paracetamol = new Medicine("Paracetamol", presentation.PILLS, usage.HUMAN, quantity.GR, 1000);

        Medicine clorhexin = new Medicine("Clorhexin", presentation.SYRUP, usage.VETERINARIAN, quantity.ML, 50);

        Medicine bismopet = new Medicine("Bismopet", presentation.SYRUP, usage.VETERINARIAN, quantity.ML, 70);

        Medicine ivomec = new Medicine("Ivomec", presentation.PET_CARE, usage.VETERINARIAN, quantity.GR, 200);

        Medicine vaporub = new Medicine("Vaporub", presentation.PET_CARE, usage.VETERINARIAN, quantity.GR, 400);

        ArrayList<Medicine> pills = new ArrayList<>();
        pills.add(dolex);
        pills.add(paracetamol);

        ArrayList<Medicine> syrup = new ArrayList<>();
        syrup.add(clorhexin);
        syrup.add(bismopet);

        ArrayList<Medicine> petCare = new ArrayList<>();
        petCare.add(ivomec);
        petCare.add(vaporub);

        Doctor doc1 = new Doctor(schDoc1);

        Doctor doc2 = new Doctor(schDoc1);

        Doctor doc3 = new Doctor(schDoc2);

        Stylist sty1 = new Stylist(schSty);

        Stylist sty2 = new Stylist(schSty);

        ArrayList<Appointment> appointments = new ArrayList<>();
        ArrayList<Patient> pacient = new ArrayList<>();
        ArrayList<Medicine> medicines = new ArrayList<>();
        ArrayList<Owner> owners = new ArrayList<>();

        Menu.menu(pacient, owners, appointments, pills, syrup, petCare, isActivated);

    }
}