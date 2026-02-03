package com.sammomanyi;

import jakarta.persistence.Entity;
import jdk.jfr.Enabled;

import java.util.List;
import java.util.Objects;

//to
@Entity
public class SoftwareEngineer {
    private Integer id;
    private String name;
    private List<String> techStack;

    public SoftwareEngineer() {}
    public SoftwareEngineer(Integer id,
                            String name,
                            List<String> techStack){
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer newId){
        this.id = newId;
    }

    public String name (){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setTechStack(List<String> newTechStack) {
        this.techStack = newTechStack;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
