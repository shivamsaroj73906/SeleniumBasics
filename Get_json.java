package seleinum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Get_json {

	public static void main(String[] args) throws IOException {
		byte[] byts=Files.readAllBytes(Paths.get("C:\\Users\\Administrator\\Desktop\\code.json"));
		String str=new String(byts);
		System.out.println(str);


		JSONObject root=new JSONObject(str);
		String st=root.getString("type");
		System.out.println(st);
		Number numberprint = root.getNumber("id");
		System.out.println(numberprint);

		JSONObject viewed_obj=root.getJSONObject("viewed");
		Number	vived_time=viewed_obj.getNumber("viewer_id");
		System.out.println( viewed_obj);
		
		JSONArray jsonarr=root.getJSONArray("properties");
		JSONObject jesonobj=jsonarr.getJSONObject(0);
		String objname =jesonobj.getString("name");
		System.out.println(objname);
		
		
		
		




	}

}
