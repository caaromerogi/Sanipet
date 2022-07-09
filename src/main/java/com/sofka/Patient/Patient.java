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

    public int getId() {
        return id;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", owner=" + owner +
                ", isVaccinated=" + isVaccinated +
                ", date='" + date + '\'' +
                ", deparasitizationDate=" + deparasitizationDate +
                '}';
    }

    protected Patient(String name, String breed, Owner owner, boolean isVaccinated, String date) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.isVaccinated = isVaccinated;



    }



}
