package com.techreturners.exercise003;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

public class Exercise003Test {

    private Exercise003 ex003;

    @Before
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Ignore("You can remove this @ignore annotation to run the test")
    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));

        expected = 9;

        assertNotEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));


    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        String []flavours=ex003.iceCreamFlavours();

        assertArrayEquals(expected, flavours);
        //asserts that flavour is populated
        assertNotEquals(0, flavours.length);
    }

    @Test
    public void testNoSuchIceCreamFlavourForCode() {
        boolean thrown = false;
        String iceCreamFlavour = "Guava";
        try {
            ex003.getIceCreamCode(iceCreamFlavour);
        } catch (NoSuchIceCreamFlavourException e) {
            thrown = true;
        }

        assertTrue(thrown);
    }
}
