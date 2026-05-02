package com.parabank.utils;
import java.util.Properties;

import java.io.FileInputStream;

public class ConfigReader {

    private static Properties prop = new Properties();
   static
    {
        try {
          prop.load(new FileInputStream("./src/test/resources/config.properties"));

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }


    public static String get(String key)
    {
        return prop.getProperty(key);
    }
}
