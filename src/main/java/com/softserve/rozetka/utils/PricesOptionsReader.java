package com.softserve.rozetka.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PricesOptionsReader {
    private static final Properties properties = new Properties();
    private static PricesOptionsReader instance;

    private PricesOptionsReader(){}

    public static PricesOptionsReader get(){
        if(instance == null){
            instance = new PricesOptionsReader();
            try{
                properties.load(new FileInputStream("src/resources/prices_range_data.properties"));
            } catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
        return instance;
    }
    public String getMinPriceRange(){
        return properties.getProperty("test.data.min_price_range");
    }
    public String getMaxPriceRange(){
        return properties.getProperty("test.data.max_price_range");
    }
}
