public class Teams {
    public static String[] teamName = {
            "Ferrari",
            "Red Bull Racing",
            "Mercedes",
            "McLaren",
            "Alpine",
            "Alfa Romeo",
            "McLaren",
            "Aston Martin",
            "Haas F1 Team",
            "Aston Martin",
            "Haas F1 Team",
            "AlphaTauri",
            "Alfa Romeo",
            "Williams",
    };
    public String[] headQuarters = { "Brackley, England", "Milton Keynes" };
    public String[] teamprincipalsName = { "Toto Wolf", "Christian Horner", "Mattia Binotto" };
    public String[] brandName = { "Mercedes Benz", "RedBull", "Ferrari" };
    public int[] championshipswonCount;
    public int[] yearsparticioatedCount;
    public String[] titlesponsorsName = { "Petronas", "Oracle", "None" };
    public String[] ownersName;
    public String[] carmodelName = { "W13", "RB18", "F1-75" };
    public String[] engineusedName;

    public static void printdriversname() {
        for (String driver : Drivers.values[0]) {
            System.out.println(driver);
        }
    }

    public static void main(String[] args) {
        printdriversname();

    }

}
