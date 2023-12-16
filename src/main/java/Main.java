/**
 * @author Ivan L
 */
public class Main {
    int someNumber;
    public void someMethod(Weekdays weekdays){
        if(weekdays.isWeekend) System.out.println("This day is weekend");
    }
    public static void main(String[] args) {
        new Main().someMethod(Weekdays.TUESDAY);
    }
}
