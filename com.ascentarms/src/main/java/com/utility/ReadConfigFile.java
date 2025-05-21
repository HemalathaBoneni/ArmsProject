package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile 
{
	Properties property;
 public Properties ReadConfig()
 {
	 String projectPath= System.getProperty("user.dir");
	 File src = new File(projectPath+"//Configproperties//config.properties//");
	 try
	 {
		FileInputStream fin =  new FileInputStream(src);
		property = new Properties();
		property.load(fin);
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception is "+e.getMessage());
	 }
 	 	 
	return property;
	
 }
 
 public String openBrowser()
 {
	return ReadConfig().getProperty("browser");
 }
 public String getUrl()
 {
	return ReadConfig().getProperty("url");
 }
 public String getNum()
 {
	return ReadConfig().getProperty("Email");
 }
 public String getPlan()
 {
	return ReadConfig().getProperty("Password");
	 
 }
}

