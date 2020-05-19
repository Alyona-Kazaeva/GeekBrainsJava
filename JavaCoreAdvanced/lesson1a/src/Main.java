public class Main {

    public static void main(String[] args) {
        getWorkingHours(DayOfWeek.TUESDAY);
    }

    static void getWorkingHours(DayOfWeek dayOfWeek) {
        int workHours = 0;
        if (dayOfWeek.workHours == 0) {
            System.out.println("Сегодня выходной");
        } else {
            for (DayOfWeek day : DayOfWeek.values()) {
                if (dayOfWeek.ordinal() <= day.ordinal()) {
                    workHours = workHours + day.workHours;
                }
            }
            System.out.println("Осталось рабочих часов: " + workHours);
        }
    }
}
