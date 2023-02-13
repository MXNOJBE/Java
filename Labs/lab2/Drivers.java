public class Drivers {
    public static String[] driverName = {
            "Max Verstappen",
            "Charles Leclerc",
            "Sergio Perez",
            "George Russell",
            "Carlos Sainz",
            "Lewis Hamilton",
            "Lando Norris",
            "Esteban Ocon",
            "Fernando Alonso",
            "Valtteri Bottas",
            "Daniel Ricciardo",
            "Sebastian Vettel",
            "Kevin Magnussen",
            "Pierre Gasly",
            "Lance Stroll",
            "Mick Schumacher",
            "Yuki Tsunoda",
            "Guanyu Zhou",
            "Alexander Albon",
            "Nicholas Latifi",
            "Nyck De Vries",
            "Nico Hulkenberg"
    };
    public int[] driverNum = { 44, 63 };
    public int[] driverAge = { 38, 24 };
    public String[] driverNation = { "United Kingdom", "United Kingdom" };
    public int[] driverPodiumsCount;
    public String[] recentWin;
    public int[] driverFastestLapcount;
    public int[] driverDebutYear;
    public String[] driverCurrentTeam;
    public int[] driverRaceStartCount;

    public static void driversdata(String[] args) {
        // circuits circuitdata = new circuits();
        System.out.println(Teams.teamName);
        for (String driver : driverName) {
            System.out.println(driver);
        }
    }

}