public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("John", "Smith", 100000, 10, 100);
        System.out.println("Employee name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Employee wage: " + "$" + (emp.getBaseSalary() + emp.getOvertime() + emp.getRate()) + "\n ");

        Employee emp2 = new Employee("Sue", "Smith", 21000, 10, 150);
        System.out.println("Employee name: " + emp2.getFirstName() + " " + emp2.getLastName());
        System.out.println("Employee wage: " + "$" + (emp2.getBaseSalary() + emp2.getOvertime() + emp2.getRate()) + "\n ");
    }
}
