package com.org.team.app.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
    private static Properties mainProperties;
    private PropertiesUtils(){

    }

    public static Properties getProperties(){
        if(mainProperties==null){
            mainProperties= new Properties();
        }
        return mainProperties;
    }

    public static Properties realAllProperties(String path) {
        File folder= new File(path);
        File[] listofFiles= folder.listFiles();
        for(File file:listofFiles) {
            if (file.isFile() && file.getName().endsWith(".properties"))
                mainProperties.putAll(setProperties(path, file.getName()));
        }
        return mainProperties;
        }

public static Properties setProperties(String propPath, String fileName){
        Properties properties= new Properties();
    try {
        FileInputStream input= new FileInputStream(new File(propPath+fileName));
        properties.load(new FileInputStream(propPath+fileName));
    } catch (IOException e) {
        e.printStackTrace();
    }
return properties;
}
}
