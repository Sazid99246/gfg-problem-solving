import java.util.Calendar;

public class JavaDateAndDay {
    static String findDay(int Day, int Month, int Year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Year, Month - 1, Day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
                "THURSDAY", "FRIDAY", "SATURDAY"};

        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        System.out.println(findDay(29, 11, 2021));
    }
}
