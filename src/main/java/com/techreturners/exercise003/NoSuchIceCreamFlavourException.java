/**
 * @author Shurel Reynolds
 */
package com.techreturners.exercise003;

import java.util.NoSuchElementException;

public class NoSuchIceCreamFlavourException extends NoSuchElementException {

    public NoSuchIceCreamFlavourException(String flavour) {
        super(flavour);
    }
}
