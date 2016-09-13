package com.tiy.hospital;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private ArrayList<HospitalDoctor> doctorsArrayList;
    private boolean docIsHere = false;

    public Hospital() {
    }

    public Hospital(String name) {
        this.name = name;
    }

    // Name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // doctorsArrayList getter and setter
    public ArrayList<HospitalDoctor> getDoctorsArrayList() {
        return doctorsArrayList;
    }

    public void setDoctorsArraySet(ArrayList<HospitalDoctor> doctorsArrayList) {
        this.doctorsArrayList = doctorsArrayList;
    }

    // docIsHere getter and setter
    public boolean isDocIsHere() {
        return docIsHere;
    }

    public void setDocIsHere(boolean docIsHere) {
        this.docIsHere = docIsHere;
    }
}