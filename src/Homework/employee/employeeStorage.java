package Homework.employee;

import classwork.libraray.Book;

public class employeeStorage {
    private Employee[] employes = new Employee[10];
    private int size;

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


}

