package com.sammomanyi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerService {


    @DeleteMapping
    public void DeleteSoftwareEngineer(Integer id){

    }
}
