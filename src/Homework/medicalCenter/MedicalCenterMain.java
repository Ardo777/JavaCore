package Homework.medicalCenter;

import Homework.medicalCenter.Commands.Command;
import Homework.medicalCenter.model.Doctor;
import Homework.medicalCenter.model.Patient;
import Homework.medicalCenter.model.Person;
import Homework.medicalCenter.storage.MedicalCenterStorage;
import Homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterMain implements Command {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isRun = true;
    static MedicalCenterStorage mcs = new MedicalCenterStorage();

    public static void main(String[] args) throws ParseException {


        while (isRun) {
            Command.printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case FOR_ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    SearchDoctorBYProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case FOR_ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENT_BY_DOCTOR:
                    printAllPatientByDoctor();
                    break;
                case FOR_PRINT_ALL_PATIENTS:
                    mcs.printAllPatients();
                    break;
                case FOR_PRINT_ALL_DOCTORS:
                    mcs.printAllDoctors();
                    break;
                case DELETE_PATIENT_BY_ID:
                    deletePatientById();
                    break;
                default:
                    System.out.println("Invalid Command Try Again!");
                    break;
            }
        }

    }

    private static void deletePatientById() {
        mcs.printAllPatients();
        System.out.println("Please input Patient Id for delete");
        String patientID = scanner.nextLine();
        mcs.deletePatientById(patientID);
        System.out.println("Patient deleted!");
    }

    private static void printAllPatientByDoctor() {
        mcs.printAllDoctors();
        System.out.println("Please input Doctor Id");
        String doctorID = scanner.nextLine();
        Doctor doctor = mcs.getDoctorById(doctorID);
        if (doctor == null) {
            System.out.println("Person with " + doctorID + " doesn't exists!!!");
            printAllPatientByDoctor();
        }
        mcs.printAllPatientsByDoctor(doctor);
    }

    private static void addPatient()  {
        mcs.printAllDoctors();
        System.out.println("please input doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctor = mcs.getDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("Doctor with " + doctorId + " doesn't exists!!!");
            return;
        }
        System.out.println("please input patient id");
        String id = scanner.nextLine();
        System.out.println("please input patient name");
        String name = scanner.nextLine();
        System.out.println("please input patient surname");
        String surname = scanner.nextLine();
        System.out.println("please input patient phone number");
        String phone = scanner.nextLine();
        System.out.println("please input patient email");
        String email = scanner.nextLine();
        System.out.println("please input date for visit(MM/dd/yyyy | hh:mm)");
        String date = scanner.nextLine();
        Date dateForVisit = null;
        try {
            dateForVisit = DateUtil.StringToDate(date);
        } catch (ParseException e) {
            System.out.println("Invalid Date,Try Again!");
            addPatient();
        }
        if (mcs.checkForVisit(doctor, dateForVisit)) {
            Patient patient = new Patient(id, name, surname, phone, email, doctor, dateForVisit);
            mcs.add(patient);
            System.out.println("Patient Created!");
        } else System.out.println("that time already exist,please choose another date");
    }


    private static void deleteDoctorById() {
        mcs.printAllDoctors();
        System.out.println("Please input Doctor Id for delete");
        String doctorID = scanner.nextLine();
        mcs.deleteDoctorById(doctorID);
        System.out.println("Doctor deleted!");
    }

    private static void SearchDoctorBYProfession() {
        mcs.printAllDoctors();
        System.out.println("Please input Doctor Profession");
        String profession = scanner.nextLine();
        mcs.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input Doctor id");
        String doctorID = scanner.nextLine();
        System.out.println("Please input Doctor name");
        String name = scanner.nextLine();
        System.out.println("Please input Doctor surname");
        String surname = scanner.nextLine();
        System.out.println("Please input Doctor Phone Number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input Doctor Email");
        String email = scanner.nextLine();
        System.out.println("Please input Doctor Profession");
        String profession = scanner.nextLine();
        Doctor doctor = new Doctor(doctorID, name, surname, phoneNumber, email, profession);
        mcs.add(doctor);
        System.out.println("Doctor created!");
    }

    private static void changePersonById(Person person) {
        System.out.println("please input person name");
        person.setName(scanner.nextLine());
        System.out.println("please input person surname");
        person.setSurname(scanner.nextLine());
        System.out.println("please input person phone number");
        person.setphonenumber(scanner.nextLine());
        System.out.println("please input person email");
        person.setEmail(scanner.nextLine());
        if (person instanceof Doctor doctor) {
            System.out.println("please input person profession");
            doctor.setProfession(scanner.nextLine());
            System.out.println("Doctor already changed");
        } else {
            Patient patient = (Patient) person;
            mcs.printAllDoctors();
            System.out.println("please input  id for the change");
            patient.setDoctor(mcs.getDoctorById(scanner.nextLine()));
            System.out.println("Patient already changed");
        }

    }

    private static void changeDoctorById() {
        mcs.printAllDoctors();
        System.out.println("please input Doctor's ID");
        String doctorId = scanner.nextLine();
        Doctor doctor = mcs.getDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("Person with " + doctorId + " doesn't exists!!!");
            return;
        }
        changePersonById(doctor);
    }


}
