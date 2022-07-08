package com.sofka.Patient;

public class Dog extends Patient{

    protected Dog(String name, String breed, Owner owner, boolean isVaccinated, String date) {
        super(name, breed, owner, isVaccinated, date);
    }


    @Override
    public void generateNumber() {
        //algo for generation of number
        this.clinicHistoryNumber = clinicHistoryNumber;
    }
}
