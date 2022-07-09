package com.sofka.Employee;

import java.util.HashMap;

public class Schedule {

        //Schedule 1


        public static HashMap<String,String> schDoc1(){
            HashMap<String,String> schDoc1 = new HashMap<>();
            schDoc1.put("Monday", "08:00-19:00");
            schDoc1.put("Tuesday", "08:00-19:00");
            schDoc1.put("Wednesday", "08:00-19:00");

            return schDoc1;

        }

        public static HashMap<String,String> schDoc2(){
            HashMap<String,String> schDoc2 = new HashMap<String, String>();

            schDoc2.put("Thursday", "08:00-19:00");
            schDoc2.put("Friday", "08:00-19:00");
            schDoc2.put("Saturday", "09:00-15:00");

            return schDoc2;}

        public static HashMap<String,String> schSty(){
            HashMap<String,String> schSty = new HashMap<String, String>();
            schSty.put("Monday", "08:00-16:00");
            schSty.put("Tuesday", "08:00-16:00");
            schSty.put("Wednesday", "09:00-16:00");
            schSty.put("Thursday", "08:00-16:00");
            schSty.put("Friday", "08:00-16:00");
            schSty.put("Saturday", "09:00-15:00");

            return schSty();
    }
}
// Schedule sch1;

