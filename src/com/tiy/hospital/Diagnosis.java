package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class Diagnosis {
    /*
    public static final int LUNG_CANCER = 1;
    public static final int BRAIN_CANCER = 2;
    public static final int COMMON_COLD = 3;
    public static final int STREP_THROAT = 4;
    public static final int BRAIN_DISEASE = 5;
    public static final int HEART_DISEASE = 6;
    public static final int UNDIAGONOSED = -1;
*/
    public static final int STREP_THROAT = 1;
    public static final int HEART_DISEASE = 2;
    public static final int BRAIN_DISEASE = 3;
    public static final int CANCER = 4;
    public static final int OTHER = 5;
    public static final int UNDIAGONOSED = -1;

    private int illness = UNDIAGONOSED;

    public Diagnosis(int illness) {
        this.illness = illness;
    }



}