package com.mathieupauly.romannumeralkata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

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
        Map<Integer, String> bases = new TreeMap<>(Comparator.reverseOrder());
        bases.put(1, "I");
        bases.put(5, "V");
        bases.put(10, "X");
        bases.put(50, "L");

        for (Integer base : bases.keySet()) {
            if (arabic >= base) {
                return bases.get(base) + toRoman(arabic - base);
            }
        }

        return "";
    }
}
