package com.nconversion;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp() throws Exception {
        converter = new NumberConverter();
    }

    @Test
    public void testConvert_98989() throws Exception {
        Integer convertedNumber = converter.convert("98989");
        assertThat(convertedNumber.intValue(), is(convertedNumber));
    }

    @Test(expected = NoRequiredNumberException.class)
    public void testConvert_0() throws Exception {
        converter.convert("0");
    }
}