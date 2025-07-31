package de.tum.in.ase.eist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyTest {

    private final Money m12CHF = new Money(12, Currency.CHF);
    private final Money m14CHF = new Money(14, Currency.CHF);

    @Test
    void testSimpleAdd() {
        Money expected = new Money(26, Currency.CHF);
        Money observed = m12CHF.add(m14CHF);
        Assertions.assertEquals(observed, expected);


        // TODO Task 2: implement the assertion
        //fail("Test case not implemented yet");
    }

    @Test
    void testSimpleSubtract() {
        Money expected = new Money(2, Currency.CHF);
        Money observed = m14CHF.subtract(m12CHF);
        Assertions.assertEquals(observed, expected);
        // TODO Task 3: implement the test case
        //fail("Test case not implemented yet");
    }

    @Test
    void testInvalidAdd() {
        Money m14USD = new Money(14, Currency.USD);
//        Money m12CHF = new Money(14, Currency.CHF);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            m12CHF.add(m14USD);
        });


        // TODO Task 4: implement the test case
        //fail("Test case not implemented yet");
    }
}
