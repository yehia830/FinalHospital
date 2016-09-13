package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class Patient extends Person {
    private boolean isSick = true;
    private String illness = "";
    private Diagnosis patientDiagnosis;
    private int illnessInt;

    public Diagnosis getPatientDiagnosis() {
        return patientDiagnosis;
    }

    public void setPatientDiagnosis(Diagnosis patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getPatientInfo() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\nReason for visit: " + this.getIllness();
    }

    public int getIllnessInt() {
        return illnessInt;
    }

    public void setIllnessInt(int illnessInt) {
        this.illnessInt = illnessInt;
    }

    public String patientDiagnosisToString() {
        if (this.illnessInt == 1) {
            return "Strep throat";
        } else if (this.illnessInt == 2) {
            return "Heart disease";
        } else if (this.illnessInt == 3) {
            return "Brain disease";
        } else if (this.illnessInt == 4) {
            return "Cancer";
        } else if (this.illnessInt == 5) {
            return "Other";
        }
        return "";

    }

}