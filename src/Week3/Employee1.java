package Week3;

public class Employee1 {
    private int years;

    public int getYears() {
        return years;
    }

    public Employee1(int yearsWorked) {
        years = yearsWorked;
    }

    public int getHours() {
        return 40;
    }

    public int getSalary() {
        return 40000;
    }

    public int getVacationDays() {
        return 10 + 2*getYears();
    }

    public void printInfo() {
        System.out.println(getClass());
        System.out.print("Hours: " + getHours());
        System.out.print(", Salary: $" + getSalary());
        System.out.println(", Vacation days: " + getVacationDays());
    }
}
