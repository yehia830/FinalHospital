package com.tiy.hospital;


public abstract class HospitalDoctor extends Person implements Doctor {
    private String college;
    //Added type variable
    private String type;

    public HospitalDoctor() {
    }

    public HospitalDoctor(String firstName, String lastName, String college, String type) {
        super(firstName, lastName);
        this.college = college;
        this.type = type;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDoctorInfo() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nCollege: " + this.getCollege() + "\nSpecialty: " + this.getType();
    }
}