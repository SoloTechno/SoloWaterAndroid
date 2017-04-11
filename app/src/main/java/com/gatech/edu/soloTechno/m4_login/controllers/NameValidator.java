package com.gatech.edu.soloTechno.m4_login.controllers;

/**
 * Created by shong313 on 4/10/17.
 */

public class NameValidator {

    public boolean isValidName(String name) {

        if (name == null) {
            return false;
        }

        if(name.equals("")) {
            return false;
        }

        return true;
    }
}