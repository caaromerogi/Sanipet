package com.sofka.Patient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Patient {

    protected int id;

    protected static int nextId = 1;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected boolean isVaccinated;

    protected String date;
    protected Date deparasitizationDate;


    public String getName() {
        return name;

    }

    protected Patient(String name, String breed, Owner owner, boolean isVaccinated, String date) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.isVaccinated = isVaccinated;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.deparasitizationDate = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }



}
