import java.util.Arrays;
import java.util.Objects;

public class EmployeeService {

    private final Employee[] worker;
    private int size;
    private double salary;

    public EmployeeService() {
        this.worker = new Employee[10];
    }

    public void printAllWorkersInfo(Employee[] worker) {
        for (Employee employee : worker) {
            if (employee != null) {
                System.out.println("Сотрудник: " + employee);
            }
        }
    }

    public void printAllWorkersNames(Employee[] worker) {
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : worker) {
            if (employee != null) {

                System.out.println(employee.getWorker());
            }
        }
    }

    public double findTotalSalary(Employee[] worker) {
        double totalSalary = 0;
        for (Employee employee : worker) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }

        }
        return totalSalary;

    }

    public double findAverageSalary(Employee[] worker) {
        double averageSalary = findTotalSalary(worker) / 10;
        return averageSalary;
    }


    public void findWorkerWithMinSalary(Employee[] worker) {
        double minSalary = worker[0].getSalary();
        Employee workerWithMinSalary = null;

        for (Employee employee : worker) {


            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                workerWithMinSalary = employee;

            }
        }
        System.out.println(workerWithMinSalary);
    }

    public void findWorkerWithMaxSalary(Employee[] worker) {
        double maxSalary = worker[0].getSalary();
        Employee workerWithMaxSalary = null;

        for (Employee employee : worker) {


            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                workerWithMaxSalary = employee;

            }
        }
        System.out.println(workerWithMaxSalary);
    }
}
