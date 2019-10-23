package com.mystartup.convnumtolettacademicscore;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertTest extends ExampleUnitTest{

    //create Class object
    Convert testConvert;
    @Before
    public void setUp() throws Exception {
        testConvert = new Convert(0);
    }

    @Test
    public void converting() {
        //1.input data
        testConvert.numScore(60.90);

        //2.calling method
        String Actual = testConvert.converting();

        //3.expect data
        String expVal = "BC";

        //4.verify data
        assertEquals(expVal, Actual);
    }
}