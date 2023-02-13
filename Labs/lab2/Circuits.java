import java.time.LocalTime;


public class Circuits {
    static LocalTime time = LocalTime.parse("1:15:242");
    public static void fastestlap(String driver) {
        System.out.println("Driver holding the record is: " + driver);
    }

    public static void fastestlap(String driver, LocalTime time2) {
        System.out.println("driver.fastestlap()");
        System.out.println("time.fastestlap()");

    }

    public static void fastestlap(String driver, LocalTime time, int year, String circuits) {
        System.out.println("circuits.fastestlap()");
        System.out.println("Lap time is " + time);
        System.out.println("The year the record was put" + year);

    }
    public static void main() {
        fastestlap("Lewis Hamilton");
        fastestlap("Lewis Hamilton",time);
        
    }
}
