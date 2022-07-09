package com.sofka;


import com.sofka.Employee.Doctor;
import com.sofka.Employee.Stylist;
import com.sofka.Menu.Menu;
import com.sofka.Patient.Cat;
import com.sofka.Patient.Dog;
import com.sofka.Patient.Owner;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;

public class Sanipet {


    public static void main(String[] args) {

        Owner carlos = new Owner("1037671456", "Carlos", "Romero", "3006625803", 22);

        Dog dog = new Dog("Max", "Poodle", carlos, true, "10/05/2021");

        //Schedule 1
        HashMap<String,String> sch1 = new HashMap<String, String>();

        sch1.put("Monday", "08:00-19:00");
        sch1.put("Tuesday", "08:00-19:00");
        sch1.put("Wednesday", "08:00-19:00");

        //Schedule 2
        HashMap<String,String> sch2 = new HashMap<String, String>();

        sch2.put("Thursday", "08:00-19:00");
        sch2.put("Friday", "08:00-19:00");
        sch2.put("Saturday", "09:00-15:00");

        //Schedule 3
        HashMap<String,String> sch3 = new HashMap<String, String>();
        sch3.put("Monday", "08:00-16:00");
        sch3.put("Tuesday", "08:00-16:00");
        sch3.put("Wednesday", "09:00-16:00");
        sch3.put("Thursday", "08:00-16:00");
        sch3.put("Friday", "08:00-16:00");
        sch3.put("Saturday", "09:00-15:00");

        Doctor doc1 = new Doctor(sch1);

        Doctor doc2 = new Doctor(sch1);

        Doctor doc3 = new Doctor(sch2);

        Stylist sty1 = new Stylist(sch3);

        Stylist sty2 = new Stylist(sch3);

        Menu.menu();

        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();

        switch (respuesta){
            case 1:
            Menu.menu1();
        }






    }
}