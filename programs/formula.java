//import javax.swing.*;

public class formula {

    public static void teamdata() {

        for (String team : teams.teamName) {
            System.out.println(team);
        }
    }

    public static void driversdata() {
        for (String driver : drivers.driverName) {
            System.out.println(driver);
        }
    }

    public static void main(String[] args) {
        teamdata();
        driversdata();
    }
}
