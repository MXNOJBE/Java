import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFileInto2DArrayJava {
    public static void main(String[] args) {
        String file = "dataFiles\\season22_drivers.csv";
        String[][] data = ReadFileInto2DArray(file, 14);
        for (int i = 0; i < data.length; i++) {
            System.out.println(String.join(",", data[i]));
        }
    }

    public static String[][] ReadFileInto2DArray(String filepath, int amountofFields) {
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
