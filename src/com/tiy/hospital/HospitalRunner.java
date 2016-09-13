package com.tiy.hospital;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dbashizi on 8/16/16.
 */
public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("HospitalRunner.main() ...");

        Hospital myHospital = new Hospital("Grady");

        Scanner myScanner = new Scanner(System.in);

        ArrayList<HospitalDoctor> myDoctorsList = new ArrayList<HospitalDoctor>();

        HospitalDoctor genDoc = new GeneralDoctor();

        System.out.print("How many doctors are at the hospital? ");
        int numDocs = myScanner.nextInt();
        myScanner.nextLine();

        for (int counter = 0; counter < numDocs; counter++) {
            System.out.print("Enter doctor " + (counter + 1) + "'s first name: ");
            String docFirstName = myScanner.nextLine();
            System.out.print("Enter doctor " + (counter + 1) + "'s last name: ");
            String docLastName = myScanner.nextLine();
            System.out.print("Enter doctor " + (counter + 1) + "'s college: ");
            String docCollege = myScanner.nextLine();
            try {
                System.out.println("What type of doctor is it? ");
                System.out.println(" 1. Pediatrician");
                System.out.println(" 2. Cardiologist");
                System.out.println(" 3. Surgical Oncologist");
                System.out.println(" 4. Neurosurgeon");
                int doctorType = myScanner.nextInt();
                myScanner.nextLine();

                HospitalDoctor inLoopDoc;
                if (doctorType == 1) {
                    inLoopDoc = new Pediatrician(docFirstName, docLastName, docCollege, "Pediatrician");
                } else if (doctorType == 2) {
                    inLoopDoc = new Cardiologist(docFirstName, docLastName, docCollege, "Cardiologist");
                } else if (doctorType == 3) {
                    inLoopDoc = new SurgicalOncologist(docFirstName, docLastName, docCollege, "Surgical Oncologist");
                } else if (doctorType == 4) {
                    inLoopDoc = new Neurosurgeon(docFirstName, docLastName, docCollege, "Neurosurgeon");
                } else {
                    System.out.println("Not valid.");
                    throw new Exception("You must enter a number from the given list!");
                }
                myDoctorsList.add(inLoopDoc);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("Doctors list");
        System.out.println("___________________________");
        int counter = 1;
        for (HospitalDoctor doctor : myDoctorsList) {
            System.out.println("Doctor " + counter + ":");
            System.out.println(doctor.getDoctorInfo());
            counter++;
            System.out.println();
        }

        System.out.println("Getting info....");
        System.out.print("What is the patient's first name? ");
        String patientFirstName = myScanner.nextLine();
        System.out.print("What is the patient's last name? ");
        String patientLastName = myScanner.nextLine();
        Patient myPatient = new Patient(patientFirstName, patientLastName);
        System.out.println("Why is the patient here? ");
        System.out.println(" 1. Child problems");
        System.out.println(" 2. Heart disease");
        System.out.println(" 3. Brain disease");
        System.out.println(" 4. Cancer");
        System.out.println(" 5. Other");

        int illnessType = myScanner.nextInt();
        myScanner.nextLine();

        if (illnessType == 1) {
            myPatient.setPatientDiagnosis(genDoc.diagnose(1));
            myPatient.setIllnessInt(1);
            myPatient.setIllness(myPatient.patientDiagnosisToString());
            for (HospitalDoctor doctor : myDoctorsList) {
                if (doctor instanceof Pediatrician) {
                    myHospital.setDocIsHere(true);
                    System.out.println("You will be seeing the following doctor: ");
                    System.out.println(doctor.getDoctorInfo());
                    System.out.println();
                    System.out.println("You have: " + myPatient.patientDiagnosisToString());
                    System.out.println();
                    System.out.println("Wait for it...");
                    System.out.println();
                    boolean success = ((Pediatrician)doctor).treat(myPatient);
                    if (success) {
                        System.out.println("Successful treatment!");
                    } else {
                        System.out.println("DEAD!");
                    }
                }
            }
            if (!myHospital.isDocIsHere()) {
                System.out.println("The doctor you need is not here. Please go to another hospital.");
            }
        } else if (illnessType == 2) {
            myPatient.setPatientDiagnosis(genDoc.diagnose(2));
            myPatient.setIllnessInt(2);
            myPatient.setIllness(myPatient.patientDiagnosisToString());
            for (HospitalDoctor doctor : myDoctorsList) {
                if (doctor instanceof Cardiologist) {
                    myHospital.setDocIsHere(true);
                    System.out.println("You will be seeing the following doctor: ");
                    System.out.println(doctor.getDoctorInfo());
                    System.out.println();
                    System.out.println("Wait for it.....");
                    System.out.println();
                    boolean success = ((Cardiologist)doctor).treat(myPatient);
                    if (success) {
                        System.out.println("Successful treatment!");
                    } else {
                        System.out.println("DEAD!");
                    }
                }
            }
            if (!myHospital.isDocIsHere()) {
                System.out.println("The doctor you need is not here. Please go to another hospital.");
            }
        } else if (illnessType == 3) {
            myPatient.setPatientDiagnosis(genDoc.diagnose(3));
            myPatient.setIllnessInt(3);
            myPatient.setIllness(myPatient.patientDiagnosisToString());
            for (HospitalDoctor doctor : myDoctorsList) {
                if (doctor instanceof Neurosurgeon) {
                    myHospital.setDocIsHere(true);
                    System.out.println("You will be seeing the following doctor: ");
                    System.out.println(doctor.getDoctorInfo());
                    System.out.println();
                    System.out.println("Wait for it...");
                    System.out.println();
                    boolean success = ((Neurosurgeon)doctor).operate(myPatient);
                    if (success) {
                        System.out.println("Successful operation!");
                    } else {
                        System.out.println("FAIL!");
                    }
                }
            }
            if (!myHospital.isDocIsHere()) {
                System.out.println("The doctor you need is not here. Please go to another hospital.");
            }
        } else if (illnessType == 4) {
            myPatient.setPatientDiagnosis(genDoc.diagnose(4));
            myPatient.setIllnessInt(4);
            myPatient.setIllness(myPatient.patientDiagnosisToString());
            for (HospitalDoctor doctor : myDoctorsList) {
                if (doctor instanceof SurgicalOncologist) {
                    myHospital.setDocIsHere(true);
                    System.out.println("You will be seeing the following doctor: ");
                    System.out.println(doctor.getDoctorInfo());
                    System.out.println();
                    System.out.println("Wait for it...");
                    System.out.println();
                    boolean success = ((SurgicalOncologist)doctor).operate(myPatient);
                    if (success) {
                        System.out.println("Successful operation!");
                    } else {
                        System.out.println("DEAD!");
                    }
                }
            }
            if (!myHospital.isDocIsHere()) {
                System.out.println("The doctor you need is not here. Please go to another hospital.");
            }
        } else if (illnessType == 5) {
            myPatient.setPatientDiagnosis(genDoc.diagnose(5));
            myPatient.setIllnessInt(5);
            myPatient.setIllness(myPatient.patientDiagnosisToString());
            System.out.println("The doctor you need is not here. Please go to another hospital.");
        } else {
            System.out.println("Invalid.");
        }
    }
}
