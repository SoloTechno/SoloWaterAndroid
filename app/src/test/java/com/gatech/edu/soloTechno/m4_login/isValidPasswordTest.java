package com.gatech.edu.soloTechno.m4_login;

import org.junit.Test;

import com.gatech.edu.soloTechno.m4_login.controllers.Validator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Created by timothybaba on 4/10/17.
 */



public class isValidPasswordTest {

    Validator vld;

    @Before
    public void setUp()
    {
        vld = new Validator();
    }

    @After
    public void tearDown()
    {

    }

    @Test//Failing Cases
    public void password_checker() {

        System.out.println("Testing Method:isValidPassword for failing cases");


        // testing the failing conditions
        assertEquals(true,vld.isValidPassword("123") );
        assertEquals(true, vld.isValidPassword("fgt"));

    }

    @Test//Passing Cases
    public void password_checker2() {

        System.out.println("Testing Method:isValidPassword for passing cases");
        // test the passing conditions
        assertEquals(true,vld.isValidPassword("123456"));
        assertEquals(true,vld.isValidPassword("asd123fgh"));
    }
}