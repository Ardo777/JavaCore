package Homework.employee;

import java.util.Scanner;

public class employeemain {
    static Scanner scanner = new Scanner(System.in);
    static employeeStorage employeeStorage = new employeeStorage();

    public static void main(String[] args) {
        boolean isrun = true;
        while (isrun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isrun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    SearchbyId();
                    break;
                case "4":
                    SearchEmployebyCompany();
                    break;
                case "5":
                    deleteByID();
                    break;
                case "6":
                    ChangeEmployeebyId();
                    break;
                default:
                    System.out.println("Invalid command,Try Again!");
            }
        }
    }

    private static void ChangeEmployeebyId() {
        System.out.println("Please input ID of the employee you want to edit");
        String tmp = scanner.nextLine();
        employeeStorage.Changeemployeebyid(tmp);
    }

    private static void deleteByID() {
        System.out.println("Please input employes ID");
        String tmp = scanner.nextLine();
        employeeStorage.deletebyid(tmp);
    }

    private static void SearchEmployebyCompany() {
        System.out.println("Please input keyword");
        String keyword = scanner.next();
        employeeStorage.searchbyCompanyName(keyword);
    }

    private static void SearchbyId() {
        System.out.println("Please input Employes ID");
        String tmp = scanner.nextLine();
        employeeStorage.searchbyId(tmp);
    }

    private static void addEmployee() {
        System.out.println("Please input employes name");
        String name = scanner.nextLine();
        System.out.println("Please input employes surname");
        String surname = scanner.nextLine();
        System.out.println("Please input employes ID");
        String employesID = scanner.nextLine();
        System.out.println("Please input  salary amount");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input company name");
        String company = scanner.nextLine();
        System.out.println("Please input employes position");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, employesID, salary, company, position);
        employeeStorage.add(employee);
        System.out.println("Employee created!");
    }

    public static void printCommand() {
        System.out.println("""
                1.  Add employees:
                2.  Watch all employees:
                3.  Search employee by ID:
                4.  Search employee by company name:
                5.  Delete by ID:
                6.  Change employee by ID:
                0.  Exit:
                """);
    }


}

