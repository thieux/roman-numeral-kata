package com.mathieupauly.romannumeralkata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanNumeralKataTest {

    @Parameterized.Parameters(name = "{0} -> \"{1}\"")
    public static Collection<Object[]> cases() {
        return Arrays.asList(new Object[][] {
                {0, ""},
                {1, "I"},
                {2, "II"},
                {3, "III"},
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
        String roman = "";

        for (int n = 0; n < arabic; n++) {
            roman += "I";
        }

        return roman;
    }
}
