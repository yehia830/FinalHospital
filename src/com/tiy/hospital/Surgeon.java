package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public interface Surgeon extends Doctor {
    public boolean operate(Patient patient);
}
