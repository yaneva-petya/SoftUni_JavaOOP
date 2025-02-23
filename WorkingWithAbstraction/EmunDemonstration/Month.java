package Lab.WorkingWithAbstraction.EmunDemonstration;

public enum Month {
    JANUARY(31,8,23),
    FEBRUARY(28,8,20),
    MARCH(31,8,23),
    APRIL(30,8,22),
    MAY(31,8,23),
    JUNE(31,8,23),
    JULY(31,8,23),
    AUGUST(31,8,23),
    SEPTEMBER(31,8,23),
    OCTOBER(31,8,23),
    NOVEMBER(31,8,23),
    DECEMBER(31,8,23);

    private int days;
    private int nonWorkingDays;
    private int workingDays;

    Month(int days, int nonWorkingDays, int workingDays){
        this.days=days;
        this.nonWorkingDays=nonWorkingDays;
        this.workingDays=workingDays;
    }

    public double calculateSalary(double dailyWage){
        return this.workingDays*dailyWage;
    }

    @Override
    public String toString() {
        return "%s -> days = %d, non working days = %d, working days = %d".formatted(
                this.name(),
                this.days,
                this.nonWorkingDays,
                this.workingDays
        );
    }
}
