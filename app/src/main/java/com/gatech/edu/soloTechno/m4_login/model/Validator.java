package com.gatech.edu.soloTechno.m4_login.model;

import java.util.regex.Pattern;

/**
 * Created by anushkmittal on 4/9/17.
 */

public class Validator {

    /**
     * Checks weather the input string is a correct email or not. It uses
     * regular expression pattern to match email addresses. It excludes double quoted local parts and the
     * special characters #&~!^`{}/=$*?| that are included in RFC5321.
     * @param email email entered by a user
     * @return whether an email is valid or not
     */
    public static boolean isValidEmail(String email) {

        if (email == null) {
            return false;
        } else if ("".equals(email)) {
            return false;
        }

        Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
                "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                        "\\@" +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "(" +
                        "\\." +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                        ")+"
        );

        boolean isGoodEmail = EMAIL_ADDRESS_PATTERN.matcher(email).matches();

        if (!isGoodEmail) {
            return false;
        }

        return isGoodEmail;

    }

    /**
     * Internal helper to ensure the name is valid. It checks
     * for empty names and those containing digits. If it has any,
     * it displays an error in either
     * the firstName_text or the lastName_text depending on which has been left blank
     * @param name name entered by a user
     * @return whether a name field is blank or not
     */
    public static boolean isValidName(String name) {
        if (name.equals("")) {
            return false;
        }
        return true;
    }

}
