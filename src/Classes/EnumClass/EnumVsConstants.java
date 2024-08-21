package Classes.EnumClass;

public class EnumVsConstants {
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;

    public static boolean isWeekday(int day){
        return EnumVsConstants.SATURDAY == day || EnumVsConstants.SUNDAY == day;
    }
}

enum WeekDays{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    SATURDAY,
    SUNDAY;

    public static boolean isWeekDay(WeekDays day){
        return WeekDays.SATURDAY == day || WeekDays.SUNDAY == day;
    }
}