package Homework.employee;

import classwork.libraray.Book;

import java.util.Scanner;

public class employeeStorage {
    private Employee[] employes = new Employee[10];
    private int size;
    Scanner scanner = new Scanner(System.in);

    public void add(Employee employee) {
        if (size == employes.length) {
            extend();
        }
        employes[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employes.length + 10];
        System.arraycopy(employes, 0, tmp, 0, employes.length);
        employes = tmp;
    }

    public void print() {
        System.out.println("-----------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(employes[i].getName() + " " + employes[i].getSurname() + " " + employes[i].getEmployeeID() + " " + employes[i].getSalary() + " " + employes[i].getCompany() + " " + employes[i].getPosition());
        }
        System.out.println("-----------------------");
    }

    public void searchbyId(String tmp) {
        for (int i = 0; i < size; i++) {
            if (employes[i].getEmployeeID().equals(tmp)) {
                System.out.println(employes[i].getName() + " " + employes[i].getSurname() + " " + employes[i].getEmployeeID() + " " + employes[i].getSalary() + " " + employes[i].getCompany() + " " + employes[i].getPosition());
            }

        }
    }

    public void searchbyCompanyName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (employes[i].getCompany().contains(keyword)) {
                System.out.println(employes[i].getName() + " " + employes[i].getSurname() + " " + employes[i].getEmployeeID() + " " + employes[i].getSalary() + " " + employes[i].getCompany() + " " + employes[i].getPosition());
            }
        }

    }

    public void deletebyid(String tmp) {

        for (int i = 0; i < size; i++) {
            if (tmp.equals(employes[i].getEmployeeID())) {
                for (int j = i; j < size; j++) {
                    employes[i] = employes[i + 1];
                }
                size--;
            }
        }
        System.out.println("Employes " + tmp + " deleted!");

    }

    public void Changeemployeebyid(String tmp) {

        for (int i = 0; i < size; i++) {
            if (tmp.equals(employes[i].getEmployeeID())) {
                System.out.println("Please edit employes name");
                employes[i].setName(scanner.nextLine());
                System.out.println("Please edit employes surname");
                employes[i].setSurname(scanner.nextLine());
                System.out.println("Please edit employes salary");
                employes[i].setSalary(Double.parseDouble(scanner.nextLine()));
                System.out.println("Please edit employes company");
                employes[i].setCompany(scanner.nextLine());
                System.out.println("Please edit employes position");
                employes[i].setPosition(scanner.nextLine());

                break;
            }
        }
        System.out.println("Employe " + tmp + " changed");
    }


}

