package com.gatech.edu.soloTechno.m4_login;

import org.junit.Test;

import com.gatech.edu.soloTechno.m4_login.controllers.Validator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Created by Joshua on 4/10/17.
 */



public class isValidDateTest {

    Validator validator;

    @Before
    public void setUp()
    {
        validator = new Validator();
    }

    @Test//Failing Cases
    public void date_invalid_checker() {

        System.out.println("Testing Method:isValidDate for failing cases");


        // testing the failing conditions
        assertEquals(false,validator.isValidDate(2018, 10, 31));
        assertEquals(false, validator.isValidDate(0, 0, 1));

    }

    @Test//Passing Cases
    public void date_valid_checker() {

        System.out.println("Testing Method:isValidDate for passing cases");
        // test the passing conditions
        assertEquals(true,validator.isValidDate(2017, 4, 3));
        assertEquals(true,validator.isValidDate(2017, 9, 3));
    }
}
