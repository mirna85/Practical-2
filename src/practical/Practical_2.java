package practical;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Practical_2 {

	static String filepath;

	public static void main(String[] args) throws IOException {

		doesFileExist("./src/Config.properties");

	}

	public static void doesFileExist(String path) throws IOException {

		try {
			filepath = path;
			Properties prop = new Properties();
			FileInputStream read = new FileInputStream(filepath);
			prop.load(read);

			for (Object key : prop.keySet()) {
				System.out.println("Word " + key + "\r\n" + prop.getProperty(key.toString())
						.replaceAll(",", "\r\nMeaning 2:").replace("-", "Meaning 1:"));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
