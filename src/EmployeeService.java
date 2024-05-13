import java.util.Arrays;

public class EmployeeService {
    private final int SIZE = 10;

    private final Employee[] worker;

    public EmployeeService() {
        this.worker = new Employee[SIZE];
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

                System.out.println(employee.getFullName());
            }
        }
    }

    public float findTotalSalary(Employee[] worker) {
        float totalSalary = 0;
        for (Employee employee : worker) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }

        }
        return totalSalary;

    }

    public float findAverageSalary(Employee[] worker) {
        int workersQtty = 0;
        float averageSalary = 0;
        for (Employee employee : worker) {
            if (employee != null) {
                workersQtty++;
            }
        }
        System.out.println();
        if (workersQtty != 0) {

            averageSalary = findTotalSalary(worker) / workersQtty;
        }
        return averageSalary;
    }


    public Employee findWorkerWithMinSalary(Employee[] worker) {
        float minSalary = worker[0].getSalary();
        Employee workerWithMinSalary = null;

        for (Employee employee : worker) {
            if (employee != null) {

                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    workerWithMinSalary = employee;

                }
            }
        }
        return workerWithMinSalary;
    }

    public Employee findWorkerWithMaxSalary(Employee[] worker) {
        float maxSalary = worker[0].getSalary();
        Employee workerWithMaxSalary = null;

        for (Employee employee : worker) {
            if (employee != null) {

                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    workerWithMaxSalary = employee;

                }
            }
        }
        return workerWithMaxSalary;
    }

    public void salaryIncrease(Employee[] worker, float salaryIncreaseIndex) {
        for (Employee employee : worker) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * salaryIncreaseIndex) / 100);
            }
            System.out.println(employee);
        }
    }

    public Employee[] department(Employee[] worker, int department) {
        Employee[] dep = new Employee[5];
        int numberOfWorkersInDep = 0;
        for (Employee employee : worker) {
            if (employee != null && employee.getDepartment() == department) {
                dep[numberOfWorkersInDep] = employee;
                numberOfWorkersInDep++;
            }
        }
        return dep;
    }

    public Employee findWorkerWithMinSalaryByDep(Employee[] worker, int department) {
        Employee[] dep = department(worker, department);
        return findWorkerWithMinSalary(dep);
    }

    public Employee findWorkerWithMaxSalaryByDep(Employee[] worker, int department) {
        Employee[] dep = department(worker, department);
        return findWorkerWithMaxSalary(dep);
    }

    public float findTotalSalaryByDep(Employee[] worker, int department) {
        Employee[] dep = department(worker, department);
        return findTotalSalary(dep);
    }

    public float findAverageSalaryByDep(Employee[] worker, int department) {
        Employee[] dep = department(worker, department);
        return findAverageSalary(dep);
    }

    public void increaseSalaryByDep(Employee[] worker, int department, float salaryIncreaseIndex) {
        Employee[] dep = department(worker, department);
        salaryIncrease(dep, salaryIncreaseIndex);
    }

    public void printAllWorkersByDep(Employee[] worker, int department) {
        Employee[] dep = department(worker, department);
        for (Employee employee : dep) {
            if (employee != null) {
                System.out.println("Сотрудник: ID " + employee.getId() + ", ФИО - " + employee.getFullName() +
                        ", зарплата " + employee.getSalary());
            }
        }
    }

    public void findAndPrintWorkersWithSalaryLowerThanMark(Employee[] worker, float mark) {
        for (Employee employee : worker) {
            if (employee != null && employee.getSalary() < mark) {
                System.out.println("Сотрудник: ID " + employee.getId() + ", ФИО - " + employee.getFullName() +
                        ", зарплата " + employee.getSalary());
            }
        }
    }

    public void findAndPrintWorkersWithSalaryMoreOrEqualThanMark(Employee[] worker, float mark) {
        for (Employee employee : worker) {
            if (employee != null && employee.getSalary() >= mark) {
                System.out.println("Сотрудник: ID " + employee.getId() + ", ФИО - " + employee.getFullName() +
                        ", зарплата " + employee.getSalary());
            }
        }
    }

    public boolean addNewWorker(Employee newWorker) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] == null) {
                worker[i] = newWorker;
                return true;

            }
        }
        return false;

    }

    public boolean deleteWorker(int deletedWorker) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] != null) {
                return worker[i].getId() == deletedWorker;
            }

        }
        return false;
    }
}


