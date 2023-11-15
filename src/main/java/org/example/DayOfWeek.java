package org.example;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
    private final String displayName;

    DayOfWeek(String displayName) {
        this.displayName = displayName;
    }

    public String whichDay(DayOfWeek day){
        if((day==SATURDAY)||(day==SUNDAY)){
            return "Weekend";
        } else {
            return day.displayName;
        }
    }

    public String whichDay2(DayOfWeek day){
        if("MONDAY".equals(day.name())){
        //if(MONDAY.name().equals(day)){
            return "Monday";
        }
        return "Weekend";
    }
}
