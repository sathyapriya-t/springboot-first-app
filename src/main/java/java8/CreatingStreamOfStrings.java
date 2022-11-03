package java8;

import java.util.Arrays;
import java.util.List;

public class CreatingStreamOfStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("hi","hello","world");

        listOfStrings.stream().forEach(System.out::println);


    }
}
