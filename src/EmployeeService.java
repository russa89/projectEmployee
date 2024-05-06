import java.util.Arrays;

public class EmployeeService {

    private final Employee[] worker;
    private int size;

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

    public void printAllWorkersNames(Employee[] worker){
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : worker){
            if (employee != null){

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



    public int findWorkerWithMinSalary(Employee[] worker) {


        int minSalary = 10_000_000;
//        Employee workerWithMinSalary;
            for (int i = 0; i < worker.length; i++) {
                    if (i < minSalary) {
                        minSalary = i;
                    }
                }
        return minSalary;

    }
}






