package com.sammomanyi;

import jakarta.persistence.*;


import java.util.List;
import java.util.Objects;

//to
@Entity
public class SoftwareEngineer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private List<String> techStack;
    //WE CHANGE THE DATA TYPE FROM STRING
    @Column(columnDefinition = "TEXT")
    private String learningPathRecommendation;

    public SoftwareEngineer() {}
    public SoftwareEngineer(Integer id,
                            String name,
                            List<String> techStack, String lerningPathRecommendation){
        this.id = id;
        this.name = name;
        this.techStack = techStack;
        this.learningPathRecommendation = lerningPathRecommendation;
    }

    public Integer getId1() {
        return id;
    }

    public void setId1(Integer id1) {
        this.id = id1;
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

    public String getLearningPathRecommendation() {
        return learningPathRecommendation;
    }

    public void setLearningPathRecommendation(String lerningPathRecommendation) {
        this.learningPathRecommendation = lerningPathRecommendation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack) && Objects.equals(learningPathRecommendation, that.learningPathRecommendation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack, learningPathRecommendation);
    }
}
