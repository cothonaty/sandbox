/**
 * @author Ivan L
 */
public enum Weekdays {
    SUNDAY(7,true), MONDAY(1,false),
    TUESDAY(2, false), WEDNESDAY(3,false),
    THURSDAY(4,false), FRIDAY(5,false), SATURDAY(6,true);
    final int numberOfDay;
    final boolean isWeekend;
    public void method(){
        System.out.println("enum method");
    }

    Weekdays(int numberOfDay, boolean isWeekend){
        this.isWeekend = isWeekend;
        this.numberOfDay = numberOfDay;
    }
}
