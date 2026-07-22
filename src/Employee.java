public class Employee {
    int empId;
    String name;
    double salary;

    public void displayDetails() {
        System.out.println("EmpID:" + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.empId = 123;
        employee.name = "Kasleab";
        employee.salary = 4000.00;
        employee.displayDetails();
    }
}
