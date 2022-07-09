package com.sofka.Patient;

public class Dog extends Patient{

    public Dog(String name, String breed, Owner owner, boolean isVaccinated, String date) {
        super(name, breed, owner, isVaccinated, date);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", owner=" + owner +
                ", isVaccinated=" + isVaccinated +
                ", date='" + date + '\'' +
                ", deparasitizationDate=" + deparasitizationDate +
                '}';
    }
}
