package com.sofka.Patient;

public class Cat extends Patient {

    protected Cat(String name, String breed, Owner owner, boolean isVaccinated, String date) {
        super(name, breed, owner, isVaccinated, date);
    }


    @Override
    public void generateNumber() {
        //
    }
}
