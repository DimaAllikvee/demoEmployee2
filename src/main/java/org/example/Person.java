package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private Address address;

    public Person() {
    }

    public Person(String name, String surname, Address address, int birthDay, int birthMonth, int birthYear ) {
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && birthMonth == person.birthMonth && birthDay == person.birthDay && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, birthMonth, birthDay, address);
    }

    public int age(){
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        Period age = Period.between(birthDate, LocalDate.now());
        return age.getYears();
    }
}
