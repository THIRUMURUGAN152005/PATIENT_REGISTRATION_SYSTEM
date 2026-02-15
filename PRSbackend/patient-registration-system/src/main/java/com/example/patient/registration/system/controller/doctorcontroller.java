package com.example.patient.registration.system.controller;


import com.example.patient.registration.system.model.doctor;
import com.example.patient.registration.system.model.patientregistry;
import com.example.patient.registration.system.service.doctorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class doctorcontroller {

    @Autowired
     doctorservice doctorservice;
    @GetMapping("doctors")
    public List<doctor> availabedoctor(){

        return doctorservice.getdoctor();



    }
    @GetMapping("doctors/enrolled")
    public List<patientregistry> enrolledpatient(){
        return doctorservice.enrolledpatient();
    }

    @PostMapping("/doctors/register")
    public String register(
            @RequestParam String name,
            @RequestParam int age,
            @RequestParam String gender,
            @RequestParam long contactno,
            @RequestParam String address,
            @RequestParam String symptoms) {

         doctorservice.registerPatient(name, age, gender,
                contactno, address, symptoms);
         return "Congratulations!"+name;

    }

}
