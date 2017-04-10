package com.gatech.edu.soloTechno.m4_login;

import com.gatech.edu.soloTechno.m4_login.model.Validator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {

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

    @Test
    public void email_checker() {

        System.out.println("Now Testing Method:isValidEmail");

        // testing the basic failing conditions
        assertFalse(vld.isValidEmail(null));
        assertFalse(vld.isValidEmail(""));

        // testing the failing pattern failing conditions
        assertFalse(vld.isValidEmail("sasdasads"));
        assertFalse(vld.isValidEmail("adsd223@2223232"));
        assertFalse(vld.isValidEmail("2132231"));


        // test the passing conditions
        assertTrue(vld.isValidEmail("abc@example.com")); //just small case
        assertTrue(vld.isValidEmail("abc232@example.com")); // small case and number
        assertTrue(vld.isValidEmail("ab332c@example343.com")); // small case and number #2
        assertTrue(vld.isValidEmail("Abc12@example.us")); // upper case , small case, number mixture
    }

}