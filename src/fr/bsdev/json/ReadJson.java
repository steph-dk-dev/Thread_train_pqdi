package fr.bsdev.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import fr.bsdev.beans.ObjectTrain;
import fr.bsdev.structures.Tuple;

public class ReadJson {

	private static String filename="json/trains.json";
	
	public static List<ObjectTrain> getList(){
		List<ObjectTrain> listTrain = new ArrayList<ObjectTrain>();
		
		FileReader reader;
		try {
	        
			Tuple tr =  Myfile.getReader(filename, false);
			reader = (FileReader) tr.get(0);
			char[] data = new char[(int) tr.get(1)];
			int is = reader.read(data);
			
			JSONObject jsonobject = new JSONObject(new String(data));
			JSONArray jsonarray = jsonobject.getJSONArray("train");
			
			System.out.println("dimension :"+jsonarray.length());
			for(int pt = 0;pt<jsonarray.length();pt++) {
				
				JSONObject subobject = jsonarray.getJSONObject(pt);
				@SuppressWarnings("unchecked")
				Iterator<JSONObject> it = subobject.keys();
				ObjectTrain objtrain = new ObjectTrain();
				while(it.hasNext()) {
					
					Object key = it.next();
					if(((String)key).equals("speedMin"))
						objtrain.setSpeedMin((Integer)subobject.get((String)key));
					
					if(((String)key).equals("speedTunnelMin"))
						objtrain.setSpeedTunnelMin((Integer)subobject.get((String)key));
					
					if(((String)key).equals("color"))
						objtrain.setColor((String)subobject.get((String)key));
					
					if(((String)key).equals("name")) {
						//System.out.println("key "+key+" value ="+subobject.get((String)key));
						objtrain.setName((String)subobject.get((String)key));
					}
					if(((String)key).equals("style"))
						objtrain.setStyle((String)subobject.get((String)key));
					
					System.out.print("key   :"+key+" -- ");
					System.out.println("value :"+subobject.get((String)key));
				}
				listTrain.add(objtrain);
				objtrain = null;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ErrorFile e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listTrain;
	}
}
