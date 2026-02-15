package com.example.patient.registration.system.service;


import com.example.patient.registration.system.model.doctor;
import com.example.patient.registration.system.model.patientregistry;
import com.example.patient.registration.system.repositry.doctorrepo;
import com.example.patient.registration.system.repositry.patientregistryrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class doctorservice {

    @Autowired
    doctorrepo doctorrepo;

    @Autowired
    patientregistryrepo patientregistryrepo;
    //List<doctor>li=new ArrayList<>();
    public List<doctor> getdoctor() {
        return doctorrepo.findAll();

    }

    public List<patientregistry> enrolledpatient() {
       return patientregistryrepo.findAll();
    }

    public void registerPatient(String name, int age, String gender, long contactno, String address, String symptoms) {

        patientregistry patientregistry=new patientregistry(name,age,gender,contactno,address,symptoms);
        patientregistryrepo.save(patientregistry);
    }
}
