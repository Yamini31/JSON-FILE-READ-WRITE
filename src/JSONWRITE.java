import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWRITE {

	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws IOException
	{
		
		JSONObject obj =new JSONObject();
		obj.put("name", "yamini");
		obj.put("id", "4834");
		
		JSONArray  arr =new JSONArray();
		arr.add("first : Java");
		arr.add("first : SQL");
		arr.add("first : C");
		
		obj.put("Skills",arr);
		
		
	 @SuppressWarnings("resource")
	 FileWriter file = new FileWriter("/home/qainfotech/eclipse-workspace/JSONReadWrite/JSONWRITEFILE.json");
	 try
	 {
		 
	 
{
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
}	
	 }
	 catch(IOException io)
	 {
		 io.printStackTrace();
	 }
	 
	 finally
	 {
		 file.flush();
		 file.close();
		 
	 }
	 
	
}
}