package com.sofka;

import java.util.HashMap;
import java.util.HashSet;

public class Schedule {
    private HashMap<String, String> schedules = new HashMap<String, String>();

    public void addValues(String key, String value){
        schedules.put(key, value);
    }

}
// Schedule sch1;

