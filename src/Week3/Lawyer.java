package Week3;

public class Lawyer extends Employee1 {
    private String sues;

    public Lawyer(int yearsWorked) {
        super(yearsWorked);
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 10000;
    }

    @Override
    public int getHours() {
        return super.getHours() + 5;
    }

    public String getSues() {
        return "sues";
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Lawyer: " + getSues());
    }
}
