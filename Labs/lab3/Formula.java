//import javax.swing.*;

public class Formula {

    public static void teamdata() {
        System.out.println("-----------------TEAMS LIST---------------------");
        for (String team : Teams.teamName) {
            System.out.println(team);
        }
    }

    public static void driversdata() {
        System.out.println("-------------------DRIVERS LIST-----------------------");
        for (String driver : Drivers.driverData);
        {
            System.out.println(driver);
        }
    }

    public static void main(String[] args) {
        teamdata();
        driversdata();
    }
}
