package lesson_04;

public class Employee {

    private String fullName;
    private String position;
    private String number;
    private int salary;
    private static final int CURRENT_YEAR = 2020;
    private int birthYear;

    // *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер.
    private int id;
    private static int idCounter = 1;

    public Employee(int age) {
        this.birthYear = CURRENT_YEAR - age;
    }

    public Employee(String fullName, String position, String number, int salary, int age) {
        this(age);
        this.fullName = fullName;
        this.position = position;
        this.number = number;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
}
