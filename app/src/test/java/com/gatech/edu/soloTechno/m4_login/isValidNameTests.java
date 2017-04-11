package com.gatech.edu.soloTechno.m4_login;

import com.gatech.edu.soloTechno.m4_login.controllers.NameValidator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shong313 on 4/10/17.
 */

public class isValidNameTests {
        NameValidator checker;

        @Before
        public void setUp()
        {
            checker = new NameValidator();
        }

        @After
        public void tearDown()
        {

        }

        @Test
        public void nameFailTest() {

            System.out.println("Testing Failing Conditions:isValidName");


            // test the failing conditions
            assertEquals(false, checker.isValidName(""));
            assertEquals(false, checker.isValidName(null));
        }

        @Test
        public void nameSuccessTest() {

            System.out.println("Testing Success Conditions: isValidName");

            // test the passing conditions
            assertEquals(true, checker.isValidName("Roy"));
            assertEquals(true, checker.isValidName("Joshua"));
        }

}