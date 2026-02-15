package com.example.patient.registration.system.repositry;

import com.example.patient.registration.system.model.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface doctorrepo extends JpaRepository<doctor,Integer> {

}
