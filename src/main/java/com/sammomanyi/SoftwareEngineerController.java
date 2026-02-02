package com.sammomanyi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    //a method to return software engineers
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James West",
                         List.of(
                                 "js","node","react","tailwindcss"
                        )

                ),
                new SoftwareEngineer(
                        2,
                        "Jamila Oti",
                        List.of(
                                "java","spring","spring boot"
                        )
                )
                );
    }
}
