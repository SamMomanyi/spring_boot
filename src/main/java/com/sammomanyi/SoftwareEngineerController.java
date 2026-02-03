package com.sammomanyi;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    //a method to return software engineers
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    //a method to return software engineers
    public SoftwareEngineer getEngineersById(
            @PathVariable Integer id
    ){
        return softwareEngineerService.getSoftwareEngineersById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer( //Request body to map the json body into the class
            @RequestBody  SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }

    @DeleteMapping("{id}")
    public void deleteEngineerById(
            @PathVariable Integer id
    ){
        softwareEngineerService.deleteSoftwareEngineerById(id);
    }

    @PutMapping("{id}")
    public void updateEngineerById(
            @PathVariable Integer id,
            @RequestBody SoftwareEngineer softwareEngineer
    ){
        softwareEngineerService.updateEngineerById(id,softwareEngineer);
    }


    
}
