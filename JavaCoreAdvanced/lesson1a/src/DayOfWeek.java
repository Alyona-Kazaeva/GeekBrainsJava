public enum DayOfWeek {
    MONDAY(8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(8),
    SATURDAY(0),
    SUNDAY(0);

    int workHours;

    DayOfWeek(int workHours) {
        this.workHours = workHours;
    }
}
