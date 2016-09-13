package com.tiy.hospital;


public class Neurosurgeon extends HospitalDoctor implements Surgeon {

    // Added default constructor
    public Neurosurgeon() {
    }

    // Added constructor that calls to HospitalDoctor constructor
    public Neurosurgeon (String firstName, String lastName, String college, String type) {
        super(firstName, lastName, college, type);
    }

    public Diagnosis diagnose(int illness) {
        return new Diagnosis(illness);
    }

    public boolean operate(Patient patient) {
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