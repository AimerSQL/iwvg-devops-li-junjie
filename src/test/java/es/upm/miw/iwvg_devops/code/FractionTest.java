package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    void testDecimal() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal(), 0.001);
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }

    @Test
    void testEquals() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = new Fraction(3, 4);

        assertEquals(fraction1, fraction2);
        assertNotEquals(fraction1, fraction3);
    }

    @Test
    void testSetNumerator() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(5);

        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        Fraction fraction = new Fraction();
        fraction.setDenominator(7);

        assertEquals(7, fraction.getDenominator());
    }
}