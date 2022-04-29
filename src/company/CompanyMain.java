package company;

public class CompanyMain {
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];
        employees[0] = new Employee("Jan",300);
        employees[1] = new Manager("Krzysztof",400,50);
        employees[2] = new Secretary("Beatrycze",350);
        for (Employee employee : employees) {
            employee.show();
            System.out.println(employee.getSalary());
        }

    }
}
