package com.tiy.hospital;


public class Pediatrician extends HospitalDoctor implements Doctor {

    // Added default constructor
    public Pediatrician() {
    }

    // Added constructor that calls to HospitalDoctor constructor
    public Pediatrician (String firstName, String lastName, String college, String type) {
        super(firstName, lastName, college, type);
    }

    public Diagnosis diagnose(int illness) {
        return new Diagnosis(illness);
    }

    public boolean treat(Patient patient) {
        int randomNum = (int)(Math.random() * 10);
        if (randomNum > 5) {
            patient.setSick(false);
            return true;
        } else {
            patient.setSick(true);
            return false;
        }
    }
}