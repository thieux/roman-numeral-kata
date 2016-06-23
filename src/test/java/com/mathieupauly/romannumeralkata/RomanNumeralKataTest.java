package com.mathieupauly.romannumeralkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralKataTest {

    @Test
    public void zero() {
        assertEquals("", toRoman(0));
    }

    @Test
    public void one() {
        assertEquals("I", toRoman(1));
    }

    @Test
    public void two() {
        assertEquals("II", toRoman(2));
    }

    @Test
    public void three() {
        assertEquals("III", toRoman(3));
    }

    private String toRoman(int arabic) {
        String roman = "";

        for (int n = 0; n < arabic; n++) {
            roman += "I";
        }

        return roman;
    }
}
