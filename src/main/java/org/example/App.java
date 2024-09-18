package org.example;

import java.util.Scanner;

public class App {
    private Employee[] employees = new Employee[100];

    public void run() {
        boolean repeat = true;
        System.out.println("Отдел кадров");
        System.out.println("------------------");
        EmployeeManages employeeManages = new EmployeeManages();

        do {
            System.out.println("Список задач:");
            System.out.println("0. Exit");
            System.out.println("1. Добавить Работника");
            System.out.println("2. Список Работников");
            System.out.println("3. Работник по имени и фамилии");
            System.out.println("4. Редактировать запись");
            System.out.println("Выберите действие");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выход");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Добавить Работника");
                    Employee employee = employeeManages.create();
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i] == null) {
                            employees[i] = employee;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Список Работников");
                    employeeManages.list(employees);
                    break;
                case 3:
                    System.out.println("Работник по имени и фамилии");
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите фамилию: ");
                    String surname = scanner.nextLine();
                    employeeManages.printEmployee(name, surname, employees);
                    break;
                case 4:
                    System.out.println("Редактировать запись");
                    System.out.print("Введите имя: ");
                    name = scanner.nextLine();
                    System.out.print("Введите фамилию: ");
                    surname = scanner.nextLine();
                    employeeManages.editEmployee(name, surname, employees);

                    break;
                default:
                    System.out.println("Нет такого действия");
                    break;
            }
        } while (repeat);
        System.out.println("Bye!");
    }
}
