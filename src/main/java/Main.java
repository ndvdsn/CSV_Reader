import csvexample.StockData;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StockData stockData = new StockData();
        stockData.loadDataFromFile("/Users/neildavidson/Projects/PROGRAMMING/JAVA/CSVExample/inventory.csv");

        System.out.println(stockData.getNumberOfRecords());


    }
}

