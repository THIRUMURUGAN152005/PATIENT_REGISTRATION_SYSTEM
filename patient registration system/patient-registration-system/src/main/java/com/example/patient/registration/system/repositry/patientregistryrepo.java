package com.example.patient.registration.system.repositry;

import com.example.patient.registration.system.model.patientregistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientregistryrepo extends JpaRepository<patientregistry,Integer> {


}
