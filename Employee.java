// 1. Создать класс Employee с полями: ФИО, должность, email, телефон, зарплата, возраст.
// Конструктор класса должен заполнять эти поля при создании объекта.
// Внутри класса Employee написать метод, который выводит информацию об объекте в консоль.


public class Employee {
    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, int phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public void printInfo() {
        System.out.println("ФИО: " + this.name);
        System.out.println("Должность: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Телефон: " + this.phoneNumber);
        System.out.printf("Зарплата: %.2f", this.salary);
        System.out.println();
        System.out.println("Возраст: " + this.age);
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иван Петров", "Программист", "petrov_i@company.ru.com", 5646456, 100000.00, 26);
        employees[1] = new Employee("Василиса Премудрова", "Менеджер", "premudrova_v@company.ru", 4564563, 80000.00, 32);
        employees[2] = new Employee("Артур Дентов", "Аналитик", "dentov_a@company.ru", 456656225, 60000.00, 36);
        employees[3] = new Employee("Анна Иванова", "Бухгалтер", "ivanova_a@company.ru", 345345225, 50000.00, 28);
        employees[4] = new Employee("Пётр Первов", "Руководитель отдела", "pervov_p@company.ru", 1451526465, 150000.00, 40);

        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }
    }

}
