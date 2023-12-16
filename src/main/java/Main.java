import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ivan L
 */
public class Main {
    int someNumber;
    public void otherMethod(boolean i, boolean b){
        if(i) System.out.println(i);
    }
    public void someMethod(Weekdays weekdays, Io<Boolean,Boolean> io){
        io.m(true,false);
        if(weekdays.isWeekend) System.out.println("This day is weekend");
    }
    public static void main(String[] args) {
       Main m = new Main();
       m.someMethod(Weekdays.SATURDAY,
            m::otherMethod
                );


        List<String> list = new ArrayList<>(List.of("asd", "qwe"));
        list.sort((c,b) -> b.compareTo(c));
        System.out.println(list);

    }
}
