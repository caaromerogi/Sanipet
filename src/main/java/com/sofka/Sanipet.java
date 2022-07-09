package com.sofka;


import com.sofka.Employee.Doctor;
import com.sofka.Employee.Stylist;
import com.sofka.Menu.Menu;
import com.sofka.Patient.Cat;
import com.sofka.Patient.Dog;
import com.sofka.Patient.Owner;
import com.sun.xml.internal.ws.message.saaj.SAAJHeader;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;

public class Sanipet {


    public static void main(String[] args) {


        Doctor doc1 = new Doctor(Schedule.schDoc1());

        Doctor doc2 = new Doctor(Schedule.schDoc1());

        Doctor doc3 = new Doctor(Schedule.schDoc2());

        Stylist sty1 = new Stylist(Schedule.schSty());

        Stylist sty2 = new Stylist(Schedule.schSty());

        Menu.menu();

        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();

        switch (respuesta){
            case 1:
                Menu.menu1();

            case 2:
                Menu.menu2();

        }

    }
}