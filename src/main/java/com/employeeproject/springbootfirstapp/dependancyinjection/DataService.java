package com.employeeproject.springbootfirstapp.dependancyinjection;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public static List<Integer> getData(){
        return Arrays.asList(10,29,30);
    }
}
