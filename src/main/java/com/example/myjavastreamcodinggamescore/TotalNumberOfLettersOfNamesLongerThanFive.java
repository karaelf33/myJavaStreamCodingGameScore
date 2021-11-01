package com.example.myjavastreamcodinggamescore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TotalNumberOfLettersOfNamesLongerThanFive {

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return 0;
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFiveWithStream(String... names) {
        return Arrays.stream(names).filter(name -> name.length() > 5).mapToInt(String::length).sum();
    }

}
