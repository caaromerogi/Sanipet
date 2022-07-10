package com.sofka.Patient;

public class Cat extends Patient {


    public Cat(String name, String breed, Owner owner, boolean isVaccinated, String date) {
        super(name, breed, owner, isVaccinated, date);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", owner=" + owner +
                ", isVaccinated=" + isVaccinated +
                ", date='" + date + '\'' +
                '}';
    }
}
