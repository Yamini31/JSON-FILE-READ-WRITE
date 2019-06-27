import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadWrite {

	public static void main(String args[]) throws IOException, ParseException
	{
		
		Reader read= new FileReader("/home/qainfotech/eclipse-workspace/JSONReadWrite/JSONREADFILE.json");
		
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(read);
		
		JSONArray arr= new JSONArray();
		arr.add(obj);
		 
		 for(int i=0;i<arr.size();i++)
		 {
		    System.out.println(arr.get(i));
		 }
		
	}
	
}
