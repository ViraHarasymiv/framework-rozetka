package com.softserve.rozetka.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrandsOptionsReader {
    private static final Properties properties = new Properties();
    private static BrandsOptionsReader instance;

    private BrandsOptionsReader(){}

    public static BrandsOptionsReader get(){
        if(instance == null){
            instance = new BrandsOptionsReader();
            try{
                properties.load(new FileInputStream("src/resources/brands_data.properties"));
            } catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
        return instance;
    }
    public String getValidBrand(){
        return properties.getProperty("test.data.valid_brand");
    }
    public String getInValidBrand(){
        return properties.getProperty("test.data.invalid.brand");
    }
}
