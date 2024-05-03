import java.util.Objects;

public class Employee {
    private final String worker;
    private int department;
    private double salary;
    private final int id;
    private static int counter;


    public Employee(String worker, int department, double salary) {
        this.worker = worker;
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

    public String getWorker(){
        return this.worker;
    }
    public int getDepartment(){
        return this.department;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setDepartment(){
        this.department = department;
    }
    public void setSalary(){
        this.salary = salary;
    }
    public String toString(){
        return "ID " + this.id + ", ФИО - " + this.worker + ", отдел " + this.department + ", зарплата " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(worker, employee.worker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, department, salary, id);
    }
}
