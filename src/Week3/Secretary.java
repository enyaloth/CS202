package Week3;

public class Secretary extends Employee1{
    private String scheduleAppts;
    private String takeNotes;

    public Secretary(int yearsWorked) {
        super(yearsWorked);
    }

    public String getScheduleAppts() {
        return "scheduleAppts";
    }

    public String getTakeNotes() {
        return "takeNotes";
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 5000;
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays();
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Secretary: I " + getScheduleAppts() + " and " + getTakeNotes());
    }
}
