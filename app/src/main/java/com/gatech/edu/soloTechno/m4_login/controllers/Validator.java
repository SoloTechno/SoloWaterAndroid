package com.gatech.edu.soloTechno.m4_login.controllers;

/**
 * Created by timothybaba on 4/10/17.
 */

public class Validator {
    public boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        if(password == "") {
            return false;
        }

        if (password.length() < 6) {
            return false;
        }

        return true;
    }

}
