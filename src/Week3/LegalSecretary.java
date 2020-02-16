package Week3;

public class LegalSecretary extends Secretary {
    private String files;
    private String schedules;

    public LegalSecretary(int yearsWorked) {
        super(yearsWorked);
    }

    public String getFiles() {
        return "file";
    }

    public String getSchedules() {
        return "schedule";
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 22000;
    }

    @Override
    public int getHours() {
        return super.getHours() - 8;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Legal Secretary: I " + getFiles() + " and " + getSchedules());
    }
}
