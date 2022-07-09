package com.sofka;


import com.sofka.Employee.Doctor;
import com.sofka.Employee.Stylist;
import com.sofka.Menu.Menu;
import com.sofka.appointment.Appointment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sanipet {


    public static void main(String[] args) {

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


        Doctor doc1 = new Doctor(schDoc1);

        Doctor doc2 = new Doctor(schDoc1);

        Doctor doc3 = new Doctor(schDoc2);

        Stylist sty1 = new Stylist(schSty);

        Stylist sty2 = new Stylist(schSty);

        ArrayList<Appointment> appointments = new ArrayList<>();

        Menu.menu(appointments);



    }
}