package org.example;

public class App {
    public void run() {
        Address address = new Address();
        address.setCity("Narva");
        address.setState("Ida-Virumaa");
        address.setZip("41536");
        address.setStreet("Kreenholmi");
        address.setHouse("12");
        address.setRoom("34");


        Person person = new Person("Ivan", 1990, "Ivanov", 5, 12, address);
        Employee employee = new Employee(person, "Director", "3000");
        System.out.printf("Имя: %s, Фамилия: %s, Должность: %s, Зарплата: %s, Город: %s, Улица: %s, Дом: %s, Квартира: %s, Почтовый индекс: %s%n, ",
                employee.getPerson().getName(), employee.getPerson().getSurname(), employee.getAppointment(), employee.getSalary(),
                employee.getPerson().getAddress().getCity(), employee.getPerson().getAddress().getStreet(), employee.getPerson().getAddress().getHouse(),
                employee.getPerson().getAddress().getRoom(), employee.getPerson().getAddress().getZip());
    }
}