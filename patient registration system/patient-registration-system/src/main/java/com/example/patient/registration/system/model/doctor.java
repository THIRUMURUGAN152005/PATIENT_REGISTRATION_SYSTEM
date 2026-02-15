package com.example.patient.registration.system.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class doctor {

    @Id
    private int doctorid;
    private String doctorname;
    private String specialization;
    private String availableStime;
    private int roomno;

    public String getAvailableStime() {
        return availableStime;
    }

    public void setAvailableStime(String availableStime) {
        this.availableStime = availableStime;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }
}
