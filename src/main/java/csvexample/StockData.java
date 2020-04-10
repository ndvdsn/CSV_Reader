package csvexample;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static com.sun.tools.doclets.internal.toolkit.util.Util.getTypeName;

public class StockData {
    private ArrayList<StockRecord> records;

    public StockRecord getRecordNumber(int i){
        return records.get(i);
    }

    public int getNumberOfRecords(){
        return records.size();
    }

    public StockData(){
        records = new ArrayList<StockRecord>();
    }

    public void loadDataFromFile(String filepath) throws IOException {
        try{
            Reader reader = Files.newBufferedReader(Paths.get(filepath));
            CSVReader csvReader = new CSVReader(reader);
//            StockRecord record;
            String [] results;

            while((results = csvReader.readNext())!=null){


                StockRecord record = new StockRecord(results[0], results[1], results[2], results[3], results[4], results[5], results[6], results[7]);
                System.out.println(record);
                records.add(record);
                System.out.println(records.size());



            }
            reader.close();

        }catch (IOException | CsvValidationException i){
            i.printStackTrace();
        }
    }
}
