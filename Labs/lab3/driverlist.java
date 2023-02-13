import java.io.*;
import java.io.BufferedReader;

public class driverlist {
    public static void main(String[] args) {
        String path = "dataFiles\\season22_drivers.csv";
        BufferedReader reader = null;
        String line = "";// to read each line
        try {
            int count = 0;
            reader = new BufferedReader(new FileReader(path)); // creating a bufferreader object //File reader is an
                                                               // object which is being created using new
            while ((line = reader.readLine()) != null) {
                if (count != 0) { // count == 0 means the first line
                    String[] values = line.split(",");
                    System.out.println(values[0]);
                }
                count++; // count increments as you read lines

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
