package com.sofka.appointment;

import com.sofka.Patient.Patient;

public class Appointment {
    private String type;
    private Patient patient;
    private String status = "Not started";
    private String date;

    @Override
    public String toString() {
        return "Appointment{" +
                "type='" + type + '\'' +
                ", patient=" + patient +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public Patient getPatient() {
        return patient;
    }

    public Appointment(String type, Patient patient, String date) {
        this.type = type;
        this.patient = patient;
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
