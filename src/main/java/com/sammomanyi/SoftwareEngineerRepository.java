package com.sammomanyi;

import org.springframework.data.jpa.repository.JpaRepository;

//generic types are for the class and the id datatype
public interface SoftwareEngineerRepository  extends JpaRepository<SoftwareEngineer, Integer> {

}
