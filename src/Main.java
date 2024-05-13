public class Main {
    private static Employee[] worker = new Employee[10];

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        worker[0] = new Employee("Иванов Иван Иванович", 3, 42000);
        worker[1] = new Employee("Сидоров Семен Семенович", 1, 56000);
        worker[2] = new Employee("Петров Петр Петрович", 1, 52000);
        worker[3] = new Employee("Копейкин Вячеслав Александрович", 1, 70000);
        worker[4] = new Employee("Федоров Федор Федорович", 2, 117000);
        worker[5] = new Employee("Синицин Павел Егорович", 3, 37000);
        worker[6] = new Employee("Чистяков Борис Семенович", 4, 80000);
        worker[7] = new Employee("Андреев Андрей Андреевич", 4, 76000);
        worker[8] = new Employee("Козлов Виталий Борисович", 5, 61000);


        employeeService.printAllWorkersInfo(worker);

        employeeService.findTotalSalary(worker);

        employeeService.findWorkerWithMinSalary(worker);

        employeeService.findWorkerWithMaxSalary(worker);

        employeeService.findAverageSalary(worker);

        employeeService.printAllWorkersNames(worker);

        employeeService.salaryIncrease(worker, 10);

        employeeService.findWorkerWithMinSalaryByDep(worker, 1);

        employeeService.findWorkerWithMaxSalaryByDep(worker, 1);

        employeeService.findTotalSalaryByDep(worker, 1);

        employeeService.findAverageSalaryByDep(worker, 1);

        employeeService.increaseSalaryByDep(worker, 1, 10);

        employeeService.printAllWorkersByDep(worker, 1);

        employeeService.findAndPrintWorkersWithSalaryLowerThanMark(worker, 60000);

        employeeService.findAndPrintWorkersWithSalaryMoreOrEqualThanMark(worker, 100000);

        employeeService.addNewWorker(new Employee("Пупкин Василий Федорович", 3, 50000));

        employeeService.deleteWorker(3);
    }
}