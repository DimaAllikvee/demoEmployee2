package org.example;

import java.util.Scanner;

public class App {
    private Employee[] employees = new Employee[100];
    public void run(){
        boolean repeat = true;
        System.out.println("Отдео кадров");
        System.out.println("------------------");
        do {
            System.out.println("Спиоск задач");
            System.out.println("0-exit");
            System.out.println("1. Добавить Работника");
            System.out.println("2. Список Работников");
            System.out.println("3. Работник по имени и фамилии");
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
                    createEmployee();

                    break;
                case 2:
                    System.out.println("Список Работников");
                    for (Employee employee : employees) {
                        if (employee != null) {
                            System.out.printf("Наш работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s%n",
                                    employee.getPerson().getName(),
                                    employee.getPerson().getSurname(),
                                    employee.getAppointment(),
                                    employee.getPerson().age(),
                                    employee.getSalary(),
                                    employee.getPerson().getAddress().getState(),
                                    employee.getPerson().getAddress().getCity(),
                                    employee.getPerson().getAddress().getStreet(),
                                    employee.getPerson().getAddress().getHouse(),
                                    employee.getPerson().getAddress().getRoom()
                            );
                        }
                    }
                    break;
                case 3:
                    System.out.println("Работник по имени и фамилии");
                    System.out.println("Введите имя");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию");
                    String surname = scanner.nextLine();
                    for (Employee employee : employees) {
                        if (employee != null && employee.getPerson().getName().equals(name) && employee.getPerson().getSurname().equals(surname)) {
                            System.out.printf("Наш работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s%n",
                                    employee.getPerson().getName(),
                                    employee.getPerson().getSurname(),
                                    employee.getAppointment(),
                                    employee.getPerson().age(),
                                    employee.getSalary(),
                                    employee.getPerson().getAddress().getState(),
                                    employee.getPerson().getAddress().getCity(),
                                    employee.getPerson().getAddress().getStreet(),
                                    employee.getPerson().getAddress().getHouse(),
                                    employee.getPerson().getAddress().getRoom()
                            );
                        }
                    }
                    break;
                default:
                    System.out.println("Нет такого действия");
                    break;

            }
        } while (repeat);
        System.out.println("Bye!");



//        Address address = new Address();
//        address.setCity("Йыхви");
//        address.setState("Ида-Вирумаа");
//        address.setZip("41536");
//        address.setStreet("Нарвское шоссе");
//        address.setHouse("80");
//        address.setRoom("20");
//
//        Person person = new Person("Ivan","Ivanov", address,10,10,2000);
//        Employee employee = new Employee(person, "слесорь", "3000");
//        System.out.printf("Наш работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s",
//                employee.getPerson().getName(),
//                employee.getPerson().getSurname(),
//                employee.getAppointment(),
//                employee.getPerson().age(),
//                employee.getSalary(),
//                employee.getPerson().getAddress().getState(),
//                employee.getPerson().getAddress().getCity(),
//                employee.getPerson().getAddress().getStreet(),
//                employee.getPerson().getAddress().getHouse(),
//                employee.getPerson().getAddress().getRoom()
//        );
//
//        Person person2 = new Person("Oleg", "Petrov", address, 15, 5, 1995);
//        Employee employee2 = new Employee(person2, "Электрослесарь", "4000");
//        System.out.printf("%nНаш работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s",
//                employee2.getPerson().getName(),
//                employee2.getPerson().getSurname(),
//                employee2.getAppointment(),
//                employee2.getPerson().age(),
//                employee2.getSalary(),
//                employee2.getPerson().getAddress().getState(),
//                employee2.getPerson().getAddress().getCity(),
//                employee2.getPerson().getAddress().getStreet(),
//                employee2.getPerson().getAddress().getHouse(),
//                employee2.getPerson().getAddress().getRoom()
//        );
    }

    private void createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        System.out.println("Введите год рождения");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.println("Введите месяц рождения");
        int birthMonth = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.println("Введите день рождения");
        int birthDay = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.println("Введите город");
        String city = scanner.nextLine();
        System.out.println("Введите улицу");
        String street = scanner.nextLine();
        System.out.println("Введите дом");
        String house = scanner.nextLine();
        System.out.println("Введите квартиру");
        String room = scanner.nextLine();
        System.out.println("Регион");
        String state = scanner.nextLine();
        System.out.println("Введите индекс");
        String zip = scanner.nextLine();
        System.out.println("Введите должность");
        String appointment = scanner.nextLine();
        System.out.println("Введите зарплату");
        String salary = scanner.nextLine();

        Address address = new Address(house, room, street, city, state, zip);
        Person person = new Person(name, surname, address, birthDay, birthMonth, birthYear);
        Employee employee = new Employee(person, appointment, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
        System.out.printf("Наш работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s",
                employee.getPerson().getName(),
                employee.getPerson().getSurname(),
                employee.getAppointment(),
                employee.getPerson().age(),
                employee.getSalary(),
                employee.getPerson().getAddress().getState(),
                employee.getPerson().getAddress().getCity(),
                employee.getPerson().getAddress().getStreet(),
                employee.getPerson().getAddress().getHouse(),
                employee.getPerson().getAddress().getRoom()
        );
    }
}