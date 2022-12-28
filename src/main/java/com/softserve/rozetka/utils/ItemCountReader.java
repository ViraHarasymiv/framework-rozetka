package com.softserve.rozetka.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ItemCountReader {
    private static final Properties properties = new Properties();
    private static ItemCountReader instance;

    private ItemCountReader(){}

    public static ItemCountReader get(){
        if(instance == null){
            instance = new ItemCountReader();
            try{
                properties.load(new FileInputStream("src/resources/item_count.properties"));
            } catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
        return instance;
    }
    public String getItemCount(){
        return properties.getProperty("test.data.item.count");
    }
}
