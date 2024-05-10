import java.util.Objects;

public class Employee {

    private final String fullName;
    private int department;
    private float salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int department, float salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        counter++;
        this.id = getCounter();
    }

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID " + this.id + ", ФИО - " + this.fullName + ", отдел " + this.department + ", зарплата " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }
}