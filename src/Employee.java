public class Employee {
    // статический счётчик ID
    private static int idNumber = 1;

    private final int id;
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private int departmentNumber;
    private int salary;


    public Employee(String lastName, String firstName, String patronymic, int departmentNumber, int salary) {
        id = idNumber++;

        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "id=" + id +
                " Фамилия- " + lastName +
                " Имя- " + firstName +
                " Отчество- " + patronymic +
                ", отдел №" + departmentNumber +
                ", зарплата- " + salary + " руб.";
    }
}


