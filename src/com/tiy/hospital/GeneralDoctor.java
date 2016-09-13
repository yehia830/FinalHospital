package com.tiy.hospital;


public class GeneralDoctor extends HospitalDoctor implements Doctor {

    public Diagnosis diagnose(int illness) {
        return new Diagnosis(illness);
    }
}
