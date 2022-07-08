package com.sofka.appointment;

import com.sofka.Patient.Patient;

public class Appointment {
    private String type;
    private Patient patient;
    private String status = "Not started";
    private String date;

    public Appointment(String type, Patient patient, String date) {
        this.type = type;
        this.patient = patient;
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
