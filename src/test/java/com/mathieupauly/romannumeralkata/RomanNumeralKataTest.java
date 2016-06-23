package com.mathieupauly.romannumeralkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralKataTest {
    @Test
    public void one() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int arabic) {
        return "I";
    }
}
