import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HolidayList {
    public static void main(String[] args) {
        // Create a list of holidays for the past 3 years
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.parse("2018-01-26"));
        holidays.add(LocalDate.parse("2018-08-15"));
        holidays.add(LocalDate.parse("2018-10-02"));
        holidays.add(LocalDate.parse("2018-12-25"));
        holidays.add(LocalDate.parse("2019-01-26"));
        holidays.add(LocalDate.parse("2019-03-04"));
        holidays.add(LocalDate.parse("2019-04-14"));
        holidays.add(LocalDate.parse("2019-08-15"));
        holidays.add(LocalDate.parse("2019-10-02"));
        holidays.add(LocalDate.parse("2019-12-25"));
        holidays.add(LocalDate.parse("2020-01-26"));
        holidays.add(LocalDate.parse("2020-08-15"));
        holidays.add(LocalDate.parse("2020-10-02"));
        holidays.add(LocalDate.parse("2020-12-25"));
        holidays.add(LocalDate.parse("2021-01-26"));
        holidays.add(LocalDate.parse("2021-08-15"));
        holidays.add(LocalDate.parse("2021-10-02"));
        holidays.add(LocalDate.parse("2021-12-25"));
        
        // Sort the list by chronological occurrence
        Collections.sort(holidays);
        
        // Insert birthday into the list
        LocalDate myBirthday = LocalDate.parse("2000-09-16");
        for (int i = 0; i < holidays.size(); i++) {
            if (myBirthday.isBefore(holidays.get(i))) {
                holidays.add(i, myBirthday);
                break;
            }
        }
        
        // Print the sorted list
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE");
        for (LocalDate holiday : holidays) {
            System.out.println(formatter.format(holiday));
        }
    }
}
