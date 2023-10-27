package Homework.medicalCenter.storage;

import Homework.medicalCenter.model.Doctor;
import Homework.medicalCenter.model.Patient;
import Homework.medicalCenter.model.Person;

import javax.print.Doc;
import java.util.Calendar;
import java.util.Date;

public class MedicalCenterStorage {

    Person[] persons = new Person[10];
    int size;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;

    }

    private void extend() {
        Person[] newPersons = new Person[persons.length + 10];
        System.arraycopy(persons, 0, newPersons, 0, persons.length);
        persons = newPersons;

    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];

            if (person instanceof Doctor) {


                if (profession.equals(((Doctor) persons[i]).getProfession())) {
                    System.out.println(persons[i]);

                }


            }
        }
    }

    public void printAllDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println(persons[i]);
            }

        }
    }

    public void printAllPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println(persons[i]);
            }

        }
    }


    public void deleteDoctorById(String doctorID) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (doctorID.equals(person.getId()) && person instanceof Doctor)
                for (int j = i; j < size; j++) {
                    deleteByIndex(i);
                }
            break;
        }

    }

    public void deletePatientById(String patientID) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                if (person.getId().equals(patientID)) {
                    deleteByIndex(i);
                    break;
                }
            }
        }

    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    public Doctor getDoctorById(String Id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(Id) && person instanceof Doctor) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient patient) {
                if (doctor.equals(patient.getDoctor())) {
                    System.out.println(patient);
                }

            }
        }

    }

    public boolean checkForVisit(Doctor doctor, Date dateForVisit) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient patient) {
                if (doctor.equals(patient.getDoctor())) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(patient.getDateForVisit());
                    calendar.add(Calendar.MINUTE, 29);
                    Date time = calendar.getTime();
                    if (time.after(dateForVisit)) {
                        return false;
                    }

                }
            }
        }
        return true;

    }
}
