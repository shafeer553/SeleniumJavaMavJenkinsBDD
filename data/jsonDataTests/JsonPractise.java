package jsonDataTests;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;

public class JsonPractise {

	public static void main(String args[]) {
		JSONParser json = new JSONParser();
		try {
			
			FileReader reader = new FileReader("C:\\MAINTENANCE\\LOGS\\firstDetailsJSON.json");
			Object obj = json.parse(reader);
			JSONArray empDetails = (JSONArray) obj;
			System.out.print(empDetails);
			System.out.println("hello");
		} catch (Exception e) {
			System.out.println("exception occured:"+e.getMessage());
		}

	}

}
