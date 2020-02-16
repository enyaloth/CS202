// 1/7/20 Christina (Rebekah) Parkhurst - Employee Class

public class Employee {
    // State of an employee
    private String firstName, lastName;
    private int baseSalary, overtime, rate;

    // Constructor. Called with Employee emp = new Employee();
    public Employee(String firstName, String lastName, int baseSalary, int overtime, int rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.overtime = overtime;
        this.rate = rate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRate() {
        if (rate < 100) {
            throw new IllegalArgumentException("Rate cannot be less than $100.");
        } else {
            this.rate = rate;
        }
        return rate;
    }

    public int getOvertime() {
        if (overtime > 20) {
            throw new IllegalArgumentException("Overtime cannot exceed 20 hours.");
        } else {
            return overtime;
        }
    }

    public int getBaseSalary() {
        if (baseSalary > 100000) {
            throw new IllegalArgumentException("Rate cannot exceed $100,000.");
        } else {
            this.baseSalary = baseSalary;
        }
        return baseSalary;
    }

 }
