package com.gatech.edu.soloTechno.m4_login;

import com.gatech.edu.soloTechno.m4_login.controllers.NameValidator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class isValidNameTests {
        NameValidator checker;

    /**
     * calls the nameValidator method to prepare setting up to check
     */
    @Before
    public void setUp()
        {
            checker = new NameValidator();
        }

    /**
     * Tests to check for the failing conditions
     */
    @Test
    public void nameFailTest() {

        System.out.println("Testing Failing Conditions:isValidName");


        // test the failing conditions
        assertEquals(false, checker.isValidName(""));
        assertEquals(false, checker.isValidName(null));
    }

    /**
     * Tests to check for the success conditions
     */
    @Test
    public void nameSuccessTest() {
        System.out.println("Testing Success Conditions: isValidName");

        // test the passing conditions
        assertEquals(true, checker.isValidName("Roy"));
        assertEquals(true, checker.isValidName("Joshua"));
    }
}