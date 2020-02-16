package Week3;

public class FamilyLawyer extends Lawyer {
    private String custody;
    private String divorce;

    public FamilyLawyer(int yearsWorked) {
        super(yearsWorked);
    }

    public String getCustody() {
        return "custody";
    }

    public String getDivorce() {
        return "divorce";
    }

    public int getSalary() {
        return super.getSalary() + 7000;
    }

    public int getHours() {
        return super.getHours() + 5;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Family Lawyer: I handle "
                + getDivorce() +  " and " + getCustody());
    }
}
