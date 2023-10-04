package Homework.employee;

import java.util.Scanner;

public class employeemain {
    public static void main(String[] args) {
        employeeStorage employeeStorage = new employeeStorage();
        boolean isrun = true;
        while (isrun) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1.  Add employees:
                    2.  Watch all employees:
                    3.  Search employee by ID:
                    4.  Search employee by company name:
                    0.  Exit:
                    """);
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isrun = false;
                    break;
                case "1":
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
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input Employes ID");
                    String tmp = scanner.nextLine();
                    employeeStorage.searchbyId(tmp);
                    break;
                case "4":
                    System.out.println("Please input keyword");
                    String keyword = scanner.next();
                    employeeStorage.searchbyCompanyName(keyword);
                    break;
                default:
                    System.out.println("Invalid command,Try Again!");
            }
        }
    }
}
