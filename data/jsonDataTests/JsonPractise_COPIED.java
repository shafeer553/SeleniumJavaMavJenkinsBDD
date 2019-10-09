package jsonDataTests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class JsonPractise_COPIED {

	public static void main(String args[]) {
		JSONParser parser = new JSONParser();
		JSONObject user = null;
		   try {
		        Object obj= parser.parse(new FileReader("C:\\MAINTENANCE\\LOGS\\firstDetailsJSON.json"));                        
		        JSONArray jsonArray = (JSONArray) obj;
		        /*System.out.println(jsonArray.isEmpty());
		        System.out.println(jsonArray.get(2));
		        System.out.println(jsonArray.size());*/
		        for(int i=0;i<jsonArray.size();i++)
		         user = (JSONObject)jsonArray.get(i);
		        System.out.println(user);
		        
		        }
		   		catch (FileNotFoundException ex) {ex.printStackTrace();}
		   		catch (IOException ex) {ex.printStackTrace();}
		   		catch (ParseException ex) {ex.printStackTrace();}
		   		catch (Exception ex) {ex.printStackTrace();}
		   		
		  {}
		   
		   
	}
		
	}
		

