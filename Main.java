package lesson_04;

public class Main {
    // * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    public static void increaseSalary(Employee[] employees, int money, int age) {
        for (int i = 0; i < employees.length; i++) {
            Employee person = employees[i];

            if (person.getAge() > age) {
                int newSalary = person.getSalary() + money;
                person.setSalary(newSalary);
            }
        }
    }

    // * Средние арифметические возраста и зарплаты.
    public static int averageAge (Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee person = employees[i];
            sum = sum + person.getAge();
        }
        return sum / employees.length;
    }

    public static int averageSalary (Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee person = employees[i];
            sum = sum + person.getSalary();
        }
        return sum / employees.length;
    }

    public static Employee findById(Employee[] employees, int id) {
        for (int i = 0; i < employees.length; i++) {
            Employee person = employees[i];
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }


    public static void main (String[] args) {
        // Вывести при помощи методов из пункта 3 ФИО и должность.
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich ", "driver", "5657499", 25000, 25);
        System.out.println("Full name is: " + employee1.getFullName());
        System.out.println("Position is: " + employee1.getPosition());

        // Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee[] list = new Employee[5];
        list[0] = new Employee("Petrov Petr Petrovich", "doctor", "5548963", 35000, 39);
        list[1] = new Employee("Vasiliiev Vasilii Vasilievich", "director", "7954623", 100000, 55);
        list[2] = new Employee("Nikolaev Nikolay Nikolaevich", "bodyguard", "8796214", 45000, 42);
        list[3] = new Employee("Aleksanrov Aleksandr Aleksandrovich", "manager", "7964785", 32000, 28);
        list[4] = new Employee("Alekseev Aleksey Alekseevich", "lawyer", "8763245", 70000, 48);

        for (int i = 0; i < list.length; i++) {
            Employee person = list[i];

            if (person.getAge() > 40) {
                System.out.printf(
                    "Name: %s, Position: %s, Number: %s, Salary: %d, Age: %d\n",
                    person.getFullName(), person.getPosition(), person.getNumber(), person.getSalary(), person.getAge()
                );
            }
        }

        System.out.println("\nIncreasing salary...");
        increaseSalary(list, 5000, 45);

        for (int i = 0; i < list.length; i++) {
            Employee person = list[i];

            System.out.printf("ID: %d, Name: %s, Position: %s, Number: %s, Salary: %d, Age: %d\n",
                    person.getId(), person.getFullName(), person.getPosition(), person.getNumber(), person.getSalary(), person.getAge()
            );
        }

        System.out.println("\nAverage age of our employees is " + averageAge(list));
        System.out.println("\nAverage salary of our employees is " + averageSalary(list));

        Employee employee4 = findById(list, 4);
        System.out.printf("\nID: %d, Name: %s, Position: %s, Number: %s, Salary: %d, Age: %d\n",
            employee4.getId(), employee4.getFullName(), employee4.getPosition(), employee4.getNumber(), employee4.getSalary(), employee4.getAge()
        );
    }
}
