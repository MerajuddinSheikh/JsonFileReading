package jasonFile;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayJasonFile {

    public static void main(String args[]) {

        String jsonfilepath = "F:\\B.Json";

        // parsing  the file
        try {
            FileReader fr = new FileReader(jsonfilepath);
            JSONParser parser = new JSONParser();
            Object fileread = parser.parse(fr);
            JSONArray ja = (JSONArray) fileread; // SInce JSON file contains array of student details
            // we need JSONArray and not JSONObject.

            System.out.println("Printing the whole array thrugh Object");
            System.out.println(filread);

            System.out.println("\nJSON array size is : " + ja.size());
            System.out.println("Printing the whole array thru JSON Array");
            System.out.println(ja);

            System.out.println("\nPrinting the 5th element ");
            System.out.println(ja.get(4)); // Get the fifth element

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}





}
