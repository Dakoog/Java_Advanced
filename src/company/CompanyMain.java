package company;

public class CompanyMain {
    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Jan", 300, 23);
        Manager secondEmployee = new Manager("Krzysztof", 400, 50, 32);
        Secretary thirdEmployee = new Secretary("Beatrycze", 350, 27);

        //Polymorphism
        Employee[] employees = new Employee[3];
        employees[0] = firstEmployee;
        employees[1] = secondEmployee;
        employees[2] = thirdEmployee;


        for (Employee employee : employees) {
            employee.show();
            System.out.println(employee.getAge() + " years old.");
            System.out.println(employee.getSalary() + "€.");
        }

    }
}
