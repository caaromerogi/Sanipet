package com.sofka.Patient;

public class Owner {
    private String dni;
    private String name;
    private String surname;
    private String cellphone;
    private int age;

    public Owner(String dni, String name, String surname, String cellphone, int age) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.cellphone = cellphone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", age=" + age +
                '}';
    }
}
