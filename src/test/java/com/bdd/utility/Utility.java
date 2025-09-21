package com.bdd.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utility {

	public static String readConfig(String key) {
		try {
			String filePath = System.getProperty("user.dir") + "/src/test/resources/Config//Config.properties";
			FileInputStream fis = new FileInputStream(new File(filePath));
			Properties prop = new Properties();
			prop.load(fis);
			String value = (String) prop.get(key);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
