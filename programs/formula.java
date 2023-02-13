import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//import javax.swing.*;

public class formula {

    public static String teamdata() {

        for (String team : teams.teamName) {
            System.out.println(team);
            String element = team;
            String arr[] = { "" };
            String arrNew[] = new String[arr.length + 1];
            int i;
            for (i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[i] = element;

            for (String s : arrNew) {
                System.out.println(s);

            }

        }

        return teamdata();
    }

    public static String driversdata() {
        for (String driver : drivers.driverName) {
            System.out.println(driver);
            return driver;
        }
        return driversdata();
    }

    public static void table() {
        JFrame f;
        f = new JFrame();
        String data[][] = { { "team" }, { "driver" } };
        String column[] = { "ID", "NAME", "SALARY" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        teamdata();
        driversdata();
        table();

    }
}
