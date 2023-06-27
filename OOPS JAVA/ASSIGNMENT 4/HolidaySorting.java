import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HolidaySorting {
    public static void main(String[] args) {
        // Create a list of holidays
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(2018, Month.JANUARY, 26)); // Republic day
        holidays.add(LocalDate.of(2018, Month.MARCH, 2)); // Holi
        holidays.add(LocalDate.of(2018, Month.AUGUST, 15)); // Independence day
        holidays.add(LocalDate.of(2018, Month.OCTOBER, 2)); // Gandhi Jayanti
        holidays.add(LocalDate.of(2019, Month.JANUARY, 26)); // Republic day
        holidays.add(LocalDate.of(2019, Month.MARCH, 4)); // Maha Shivratri
        holidays.add(LocalDate.of(2019, Month.AUGUST, 15)); // Independence day
        holidays.add(LocalDate.of(2019, Month.OCTOBER, 2)); // Gandhi Jayanti
        holidays.add(LocalDate.of(2020, Month.JANUARY, 26)); // Republic day
        holidays.add(LocalDate.of(2020, Month.MARCH, 10)); // Holi
        holidays.add(LocalDate.of(2020, Month.AUGUST, 15)); // Independence day
        holidays.add(LocalDate.of(2020, Month.OCTOBER, 2)); // Gandhi Jayanti
        holidays.add(LocalDate.of(2021, Month.JANUARY, 26)); // Republic day
        holidays.add(LocalDate.of(2021, Month.MARCH, 29)); // Holi
        holidays.add(LocalDate.of(2021, Month.AUGUST, 15)); // Independence day
        holidays.add(LocalDate.of(2021, Month.OCTOBER, 2)); // Gandhi Jayanti
        
        // Sort the list based on the chronological occurrence of holidays
        Collections.sort(holidays);
        
        // Insert your date of birth into the sorted list
        LocalDate dob = LocalDate.of(1990, Month.APRIL, 1);
        holidays.add(dob);
        
        // Print the sorted list of holidays including your date of birth
        for (LocalDate holiday : holidays) {
            System.out.println(holiday);
        }
    }
}
