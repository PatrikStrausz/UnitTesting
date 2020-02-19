package sk.itsovy.strausz.project.unit.testing.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.strausz.project.unit.testing.Iban;

import static org.junit.Assert.assertEquals;

class IbanTest {
    private Iban iban;

    @BeforeEach
    void setUp() {
        iban = new Iban();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void iban() {

        assertEquals("SK42 1100 0000 0029 3010 5035", iban.iban("1100", "000000", "2930105035"));
        assertEquals("SK65 0900 0000 0029 3555 5035", iban.iban("0900", "000000", "2935555035"));
        assertEquals("SK68 0720 0002 8919 8742 6353", iban.iban("0720", "000289", "1987426353"));

    }
}