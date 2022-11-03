package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintingSqrList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> squareList = integerList.stream().map(x->x*x).collect(Collectors.toList());
        squareList.forEach(System.out::println);
    }
}
