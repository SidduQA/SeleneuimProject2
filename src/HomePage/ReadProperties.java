package HomePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p1=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\Stud1.properties");
		
		p1.load(fis);
		
		System.out.println(p1.getProperty("Name"));
		System.out.println(p1.getProperty("Course"));
		System.out.println(p1.getProperty("Time"));
		System.out.println(p1.getProperty("Sub-course"));


	}

}
