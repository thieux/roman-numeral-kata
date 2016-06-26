package com.mathieupauly.romannumeralkata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanNumeralKataTest {

    @Parameterized.Parameters(name = "{0} -> \"{1}\"")
    public static Collection<Object[]> cases() {
        return Arrays.asList(new Object[][]{
                {0, ""},
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {5, "V"},
                {6, "VI"},
                {7, "VII"},
                {10, "X"},
                {11, "XI"},
                {12, "XII"},
                {50, "L"},
        });
    }

    private final int arabic;
    private final String expected;

    public RomanNumeralKataTest(int arabic, String expected) {
        this.arabic = arabic;
        this.expected = expected;
    }

    @Test
    public void testToRoman() {
        assertEquals(expected, toRoman(arabic));
    }

    private String toRoman(int arabic) {
        Map<Integer, String> bases = new HashMap<>();
        bases.put(1, "I");
        bases.put(5, "V");
        bases.put(10, "X");
        bases.put(50, "L");

        if (arabic >= 50) {
            return bases.get(50) + toRoman(arabic - 50);
        }

        if (arabic >= 10) {
            return bases.get(10) + toRoman(arabic - 10);
        }

        if (arabic >= 5) {
            return bases.get(5) + toRoman(arabic - 5);
        }

        if (arabic >= 1) {
            return bases.get(1) + toRoman(arabic - 1);
        }

        return "";
    }
}
