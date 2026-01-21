import java.util.*;

public class DayToDate {

    public static String suffix(int num) {
        if (num == 1)
            return "ST.";
        else if (num == 2)
            return "ND.";
        else if (num == 3)
            return "RD.";
        else
            return "TH.";
    }

    public static String convert(int dayNo, int year) {
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] monthNames = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER" };

        int i = 0;
        while (dayNo > monthDays[i]) {
            dayNo -= monthDays[i];
            i++;
        }

        return dayNo + suffix(dayNo) + " " + monthNames[i] + " " + year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DAY NUMBER: ");
        int day = sc.nextInt();

        System.out.print("YEAR: ");
        int year = sc.nextInt();

        System.out.print("DATE AFTER: ");
        int N = sc.nextInt();

        String currentDate = convert(day, year);

        day += N;
        while (day > 365) {
            day -= 365;
            year++;
        }

        String futureDate = convert(day, year);

        System.out.println("OUTPUT:");
        System.out.println(currentDate);
        System.out.println("DATE AFTER " + N + " DAYS: " + futureDate);
    }
}
