package com.employeeproject.springbootfirstapp.dependancyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    private DataService dataService;
    @Autowired
    public long calculateSum(){
        List<Integer> data = DataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
