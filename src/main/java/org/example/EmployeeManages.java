package org.example;


import java.util.Scanner;

public class EmployeeManages {

    public Employee create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        System.out.println("Введите год рождения");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите месяц рождения");
        int birthMonth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите день рождения");
        int birthDay = scanner.nextInt();
        scanner.nextLine();
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
        return employee;
    }

    public void list(Employee[] employees) {
        boolean hasEmployees = false;
        System.out.println("Список работников:");
        for (Employee employee : employees) {
            if (employee != null) {
                hasEmployees = true;
                System.out.printf("Имя: %s, Фамилия: %s, Должность: %s, Зарплата: %s%n",
                        employee.getPerson().getName(),
                        employee.getPerson().getSurname(),
                        employee.getAppointment(),
                        employee.getSalary());
            }
        }
        if (!hasEmployees) {
            System.out.println("Работников пока нет.");
        }
    }

    public void printEmployee(String name, String surname, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getPerson().getName().equals(name) &&
                        employee.getPerson().getSurname().equals(surname)) {
                    System.out.printf("Работник%nИмя: %s,%nФамилия: %s,%nДолжность: %s,%nВозраст: %d,%nЗарплата: %s.%nПроживает по адресу: %s, %s, %s, %s - %s%n",
                            employee.getPerson().getName(),
                            employee.getPerson().getSurname(),
                            employee.getAppointment(),
                            employee.getPerson().age(),
                            employee.getSalary(),
                            employee.getPerson().getAddress().getState(),
                            employee.getPerson().getAddress().getCity(),
                            employee.getPerson().getAddress().getStreet(),
                            employee.getPerson().getAddress().getHouse(),
                            employee.getPerson().getAddress().getRoom());
                    return;
                }
            }
        }
        System.out.println("Работник с таким именем и фамилией не найден.");
    }

    public void editEmployee(String name, String surname, Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getPerson().getName().equals(name) &&
                        employee.getPerson().getSurname().equals(surname)) {
                    System.out.println("Введите новое имя");
                    String newName = scanner.nextLine();
                    System.out.println("Введите новую фамилию");
                    String newSurname = scanner.nextLine();
                    System.out.println("Введите новый год рождения");
                    int newBirthYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите новый месяц рождения");
                    int newBirthMonth = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите новый день рождения");
                    int newBirthDay = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите новый город");
                    String newCity = scanner.nextLine();
                    System.out.println("Введите новую улицу");
                    String newStreet = scanner.nextLine();
                    System.out.println("Введите новый дом");
                    String newHouse = scanner.nextLine();
                    System.out.println("Введите новую квартиру");
                    String newRoom = scanner.nextLine();
                    System.out.println("Введите новый регион");
                    String newState = scanner.nextLine();
                    System.out.println("Введите новый индекс");
                    String newZip = scanner.nextLine();
                    System.out.println("Введите новую должность");
                    String newAppointment = scanner.nextLine();
                    System.out.println("Введите новую зарплату");
                    String newSalary = scanner.nextLine();

                    employee.getPerson().setName(newName);
                    employee.getPerson().setSurname(newSurname);
                    employee.getPerson().setBirthYear(newBirthYear);
                    employee.getPerson().setBirthMonth(newBirthMonth);
                    employee.getPerson().setBirthDay(newBirthDay);
                    employee.getPerson().getAddress().setCity(newCity);
                    employee.getPerson().getAddress().setStreet(newStreet);
                    employee.getPerson().getAddress().setHouse(newHouse);
                    employee.getPerson().getAddress().setRoom(newRoom);
                    employee.getPerson().getAddress().setState(newState);
                    employee.getPerson().getAddress().setZip(newZip);
                    employee.setAppointment(newAppointment);
                    employee.setSalary(newSalary);
                    System.out.println("Запись обновлена.");
                    return;
    }
}
        }
        System.out.println("Работник с таким именем и фамилией не найден.");
    }
}
