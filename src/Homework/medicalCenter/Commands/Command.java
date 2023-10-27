package Homework.medicalCenter.Commands;

public interface Command {
    String EXIT = "0";
    String FOR_ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String FOR_ADD_PATIENT = "5";
    String PRINT_ALL_PATIENT_BY_DOCTOR = "6";
    String FOR_PRINT_ALL_PATIENTS = "7";
    String FOR_PRINT_ALL_DOCTORS = "8";
    String DELETE_PATIENT_BY_ID = "9";


    static void printCommand() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + FOR_ADD_DOCTOR + " for ADD DOCTOR");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for DELETE DOCTOR BY ID");
        System.out.println("Please input " + CHANGE_DOCTOR_BY_ID + " for CHANGE DOCTOR BY ID");
        System.out.println("Please input " + FOR_ADD_PATIENT + " for ADD PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENT_BY_DOCTOR + " for PRINT DOCTOR'S PATIENTS");
        System.out.println("Please input " + FOR_PRINT_ALL_PATIENTS + " for PRINT ALL PATIENT");
        System.out.println("Please input " + FOR_PRINT_ALL_DOCTORS + " for PRINT ALL DOCTORS");
        System.out.println("Please input " + DELETE_PATIENT_BY_ID + " for DELETE PATIENT BY ID");
    }
}

