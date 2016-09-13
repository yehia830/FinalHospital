package com.tiy.hospital;

/**
 * Created by Yehia830 on 9/13/16.
 */
public class Cardiologist extends HospitalDoctor implements Doctor {

    // Added default constructor
    public Cardiologist() {
    }

    // Added constructor that calls to HospitalDoctor constructor
    public Cardiologist (String firstName, String lastName, String college, String type) {
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