package com.gatech.edu.soloTechno.m4_login.controllers;

public class NameValidator {
    /**
     * method that checks whether the name of the user is valid
     * @param name the name of the user
     * @return boolean that indicates whether the name is valid / able to be used
     */
    public boolean isValidName(String name) {

        if (name == null) {
            return false;
        }

        if (name.equals("")) {
            return false;
        }

        return true;
    }
}