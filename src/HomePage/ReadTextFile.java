package HomePage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Fpath="C:\\Users\\hp\\OneDrive\\Documents\\New_Version.txt";
		
		BufferedReader bf=new BufferedReader(new FileReader(Fpath));
		
		String strtline;
		
		while((strtline=bf.readLine())!= null) 
		{
			System.out.println(strtline);
		}
		
		

	}

}
