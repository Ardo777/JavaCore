package Homework.medicalCenter.model;

import java.util.Date;

public class Patient extends Person {
    private Doctor doctor;
    Date dateForVisit= new Date();

    public Date getDateForVisit() {
        return dateForVisit;
    }

    public void setDateForVisit(Date dateForVisit) {
        this.dateForVisit = dateForVisit;
    }

    public Patient(Doctor doctor) {
        this.doctor = doctor;

    }

    public Patient(String id, String name, String surname, String phonenumber, String email, Doctor doctor, Date dateForVisit) {
        super(id, name, surname, phonenumber, email);
        this.doctor = doctor;
        this.dateForVisit = dateForVisit;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", date for visit='" + dateForVisit + '\''+
                "} ";
    }
}
