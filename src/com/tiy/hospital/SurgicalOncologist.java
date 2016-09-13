package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class SurgicalOncologist extends HospitalDoctor implements Surgeon {

    public SurgicalOncologist() {
    }

    public SurgicalOncologist(String firstName, String lastName, String college, String type) {
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