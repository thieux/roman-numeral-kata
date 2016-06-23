package com.mathieupauly.romannumeralkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralKataTest {
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
        if (3 == arabic) {
            return "I" + "I" + "I";
        }
        if (2 == arabic) {
            return "I" + "I";
        }
        return "I";
    }
}
