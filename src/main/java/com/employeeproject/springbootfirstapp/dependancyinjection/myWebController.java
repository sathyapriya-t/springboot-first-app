package com.employeeproject.springbootfirstapp.dependancyinjection;

import org.springframework.stereotype.Component;

@Component
public class myWebController {
    private BusinessService businessService;

    public myWebController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public long valueFromBusiness(){
        return businessService.calculateSum();
    }
}
