import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    //private final static int[] departmentNumber

    private final static Employee[] EMPLOYEES = new Employee[10];

    private static void enteryEmployee() {

        EMPLOYEES[0] = new Employee("Михаил ", "Александрович ", "Барановский ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[1] = new Employee("Борис ", "Исакович ", "Горев ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[2] = new Employee("Олимпий ", "Александрович ", "Квиткин ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[3] = new Employee("Лидия ", "Михайловна ", "Книпович ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[4] = new Employee("Надежда ", "Константиновна ", "Крупская", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[5] = new Employee("Владимир ", "Ильич ", "Ленин ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[6] = new Employee("Михаил ", "Андреевич ", "Рейснер ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[7] = new Employee("Яков ", "Михайлович ", "Свердлов ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[8] = new Employee("Иосиф ", "Виссарионович ", "Джугашвили ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
        EMPLOYEES[9] = new Employee("Емельян ", "Михайлович ", "Ярославский ", RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 500000));
    }

    public static void main(String[] args) {
        enteryEmployee();
        print();
        System.out.println("");
        System.out.println("Затраты на выплату заработной платы: " + salarySum() + " руб.");
        System.out.println("");
        System.out.println("Сотрудник с минимальной заработной платой: " + minSalaryEmployee());
        System.out.println("");
        System.out.println("Сотрудник с максимальной заработной платой: " + maxSalaryEmployee());
        System.out.println("");
        System.out.println("Средняя заработная плата: " + salaryAverage()+ " руб.");
        printFullNames();
        //printIndexationSalary();

    }

    // метод по выводу списка сотрудников
    private static void print() {
        for (Employee employees : EMPLOYEES) {
            System.out.println(employees);
        }
    }

    // метод по выводу затрат на ЗП
    private static int salarySum() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    // методы по выводу максимальной и минимальной зарплаты
    private static Employee minSalaryEmployee() {
        Employee employeeMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;

            }
        }
        return employeeMinSalary;
    }

    private static Employee maxSalaryEmployee() {
        Employee employeeMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }
    // метод расчёта средней заработной платы
    private static double salaryAverage() {
        return (double) salarySum()/ EMPLOYEES.length;
    }
    // вывод ФИО
    private static void printFullNames() {
        for (Employee employee: EMPLOYEES) {
            System.out.printf(employee.getLastName());
            System.out.printf(employee.getFirstName(), " ");
            System.out.printf(employee.getPatronymic(), " ");
            System.out.println("");
        }
    }
    // индексация заработной платы
    //private static void printIndexationSalary() {
    //public static void Employee[] indexatinSalaryEmployee(double increaseSalary) {
     //   double indexationSalary;
       // for (Employee employee : EMPLOYEES) {
         //   indexationSalary = (double)employee.getSalary() * 1.10;
           // employee.setSalary((int)indexationSalary);
            //System.out.println (employees);

        }





