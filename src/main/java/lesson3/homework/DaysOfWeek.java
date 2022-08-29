package lesson3.homework;

public enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    DaysOfWeek() {
    }

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    };

    public boolean isWeekEnd() {
        return this == SATURDAY || this == SUNDAY;
    };


}
