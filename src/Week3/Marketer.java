package Week3;

public class Marketer extends Employee1{
    private String developsPlans;

    public Marketer(int yearsWorked) {
        super(yearsWorked);
    }

    public String getDevelopsPlans() {
        return "develops plans";
    }

    @Override
    public int getSalary() {
        return super.getSalary() - 10000;
    }

    @Override
    public int getHours() {
        return super.getHours() - 4;
    }

    public int getVacationDays() {
        return 2*super.getVacationDays();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Marketer: I " + getDevelopsPlans());
    }
}
