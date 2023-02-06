public class teams {
    public static final String[] teamdata = null;
    public static String[] teamName = {"Mercedes AMG Petronas Formula 1 Team","Oracle RedBull Racing","Ferrari"};
    public String[] headQuarters = {"Brackley, England","Milton Keynes"};
    public String[] teamprincipalsName = {"Toto Wolf","Christian Horner","Mattia Binotto"};
    public String[] brandName = {"Mercedes Benz","RedBull","Ferrari"};
    public int[] championshipswonCount;
    public int[] yearsparticioatedCount;
    public String[] titlesponsorsName = {"Petronas","Oracle","None"};
    public String[] ownersName;
    public String[] carmodelName = {"W13","RB18","F1-75"};
    public String[] engineusedName;
    

    public static void printdriversname()
    {
        for (String driver : drivers.driverName) {
            System.out.println(driver); 
    }
}
    public static void main(String[] args) {
        printdriversname();
       
    }

}
