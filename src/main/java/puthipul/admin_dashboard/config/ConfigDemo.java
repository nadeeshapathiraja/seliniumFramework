package puthipul.admin_dashboard.config;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;

import puthipul.admin_dashboard.base.Base;



/**
 * @author Nilmini Amarasinghe
 *
 * FutureReady App
 */

public class ConfigDemo {

	public static void main(String[] args) {
		getConfigProperties();
	}
	
	public static void getConfigProperties() {
		String projectpath = System.getProperty("user.dir");
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream(projectpath+"/src/main/java/puthipul/admin_dashboard/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Base.browserName = browser;
			String url = prop.getProperty("url");
			System.out.println(url);
			Base.website = url;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
}
	
	