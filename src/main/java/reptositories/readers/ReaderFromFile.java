package reptositories.readers;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderFromFile {


    public ArrayList<String> readCityNamesAndReturnArray() {
        ArrayList<String> cityNames = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("cities.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                cityNames.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cityNames;

    }


}
