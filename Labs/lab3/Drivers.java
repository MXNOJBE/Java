import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Drivers {

    public static void main(String[] args) {
        String file = "dataFiles\\season22_drivers.csv";
        String[][] data = driverData(file, 14);
        for (int i = 0; i < data.length; i++) {
            System.out.println(String.join(",", data[i]));
        }
    }

    public static String[][] driverData(String filepath, int amountofFields) {
        List<String> recordsList = new ArrayList<String>();

        String delimiter = ",";
        String currentLine;

        try {
            FileReader fr = new FileReader(filepath);
            try (BufferedReader br = new BufferedReader(fr)) {
                while ((currentLine = br.readLine()) != null) {
                    recordsList.add(currentLine);
                }
            }
            int recordCount = recordsList.size();
            String arrayToReturn[][] = new String[recordCount][amountofFields];
            String[] data;
            for (int i = 0; i < recordCount; i++) {
                data = recordsList.get(i).split(delimiter);
                for (int j = 0; j < data.length; j++) {
                    arrayToReturn[i][j] = data[j];
                }

            }
            return arrayToReturn;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}

/*
 * public static String[] driverName = {
 * "Max Verstappen",
 * "Charles Leclerc",
 * "Sergio Perez",
 * "George Russell",
 * "Carlos Sainz",
 * "Lewis Hamilton",
 * "Lando Norris",
 * "Esteban Ocon",
 * "Fernando Alonso",
 * "Valtteri Bottas",
 * "Daniel Ricciardo",
 * "Sebastian Vettel",
 * "Kevin Magnussen",
 * "Pierre Gasly",
 * "Lance Stroll",
 * "Mick Schumacher",
 * "Yuki Tsunoda",
 * "Guanyu Zhou",
 * "Alexander Albon",
 * "Nicholas Latifi",
 * "Nyck De Vries",
 * "Nico Hulkenberg"
 * };
 * 
 * public int[] driverNum = { 44, 63 };
 * public int[] driverAge = { 38, 24 };
 * public String[] driverNation = { "United Kingdom", "United Kingdom" };
 * public int[] driverPodiumsCount;
 * public String[] recentWin;
 * public int[] driverFastestLapcount;
 * public int[] driverDebutYear;
 * public String[] driverCurrentTeam;
 * public int[] driverRaceStartCount;
 * 
 */
