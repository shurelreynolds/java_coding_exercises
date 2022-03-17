package com.techreturners.exercise005;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class Exercise005 {

    public boolean isPangram(String input) {
        if (input == null || input.matches("\\d+"))
            return false;

        input = input.toLowerCase();

        //check for ascii character
        if(input.matches("^[\\p{ASCII}]"))
            return false;

        for (char c = 'a'; c < 'z'; c++) {

            if (!input.contains(c + ""))
                return false;
        }

        return true;
    }

}
