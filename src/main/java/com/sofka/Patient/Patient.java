package com.sofka.Patient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Patient {
    protected String clinicHistoryNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected boolean isVaccinated;

    protected String date;
    protected Date deparasitization;

    public String getClinicHistoryNumber() {
        return clinicHistoryNumber;
    }

    public String getName() {
        return name;

    }

    protected Patient(String name, String breed, Owner owner, boolean isVaccinated, String date) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.isVaccinated = isVaccinated;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.deparasitization = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }




    }

    //It could not be an abstract method
    public abstract void generateNumber();



}
