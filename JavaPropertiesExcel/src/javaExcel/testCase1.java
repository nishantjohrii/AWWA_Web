package javaExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testCase1 {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Nishant\\eclipse-workspace\\JavaPropertiesExcel\\src\\javaExcel\\object.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
	}

}
