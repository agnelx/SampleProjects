package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {
	
	private Properties properties;
	 private final String propertyFilePath= "config/config.properties";
	 
	 public configFileReader(){
		 BufferedReader reader;
		 try {
		 reader = new BufferedReader(new FileReader(propertyFilePath));
		 properties = new Properties();
		 try {
		 properties.load(reader);
		 reader.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("config.properties not found at " + propertyFilePath);
		 } 
		 }
	 
	 public String getDriverPath(){
		 String driverPath = properties.getProperty("driverPath");
		 if(driverPath!= null) return driverPath;
		 else throw new RuntimeException("driverPath not specified in the config.properties file."); 
		 }
	 
	 public long getImplicitlyWait() { 
		 String implicitwait = properties.getProperty("implicitwait");
		 if(implicitwait != null) return Long.parseLong(implicitwait);
		 else throw new RuntimeException("implicitwait not specified in the config.properties file."); 
		 }
	 

		public String getReportConfigPath(){
		 String reportConfigPath = properties.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the config.properties file for the Key:reportConfigPath"); 
		}

}
