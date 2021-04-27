package Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.opencsv.CSVReader;

public class AdminCSV {

    public void ReadCVS(){
        StringBuilder stringBuilder = new StringBuilder();
        Path filePath = Paths.get("world-happiness-report-2021.csv");
        try{
            BufferedReader bufferedReader = Files.newBufferedReader(filePath);
            String line;
                while ((line = bufferedReader.readLine()) != null){
                    stringBuilder.append(line).append("\n");
                }
        }catch (FileNotFoundException e){
            System.out.printf("ERROR - A %s occurred: \n\t%s", e.getClass().toString(), e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}