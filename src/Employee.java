import java.util.Objects;

public class Employee {
    private Integer id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private Integer departmentNumber;
    private Integer salary;


    public Employee(String lastName, String firstName, String patronymic, Integer departmentNumber, Integer salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public Integer getId() {
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

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(departmentNumber, employee.departmentNumber) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, patronymic, departmentNumber, salary);
    }
}
