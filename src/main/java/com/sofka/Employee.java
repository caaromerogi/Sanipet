package com.sofka;

import java.util.HashMap;

public abstract class Employee {
    HashMap<String, String> schedule;

    protected Employee(HashMap schedule) {
        this.schedule = schedule;
    }
}
