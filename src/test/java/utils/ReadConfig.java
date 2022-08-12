package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	

	//This class is used to read data from the properties file

	Properties pro;

	public ReadConfig() {
		File src=new File(System.getProperty("user.dir")+"//src//test//Resources//config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			System.out.println("file readed");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

	public String getUrl() {
		String url= pro.getProperty("qaUrl");
		return url;
	}
	
	public String getBrowser() {
		String browser= pro.getProperty("browser");
		return browser;
	}
	
	public String getEmail() {
		String email= pro.getProperty("email");
		return email;
	}
	
	public String getPassword() {
		String password= pro.getProperty("password");
		return password;
	}
	
	

}
