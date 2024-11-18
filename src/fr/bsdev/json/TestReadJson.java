package fr.bsdev.json;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestReadJson {
	
	public static void main(String[] args) {
		
		String filename = "json\\trains.json";
		
		Path path = Paths.get(filename);
		System.out.println("path"+path);
		String realPath =null;
		File file = null;
		try {
			 realPath = path.toRealPath().toString();
			 file = new File(realPath);
			 System.out.println("file :"+file);
			 System.out.println("file :"+file.getAbsolutePath());
			 //F:\02-Programme_PQDI\03_MJ\job\Thread_trains\src\fr\bsdev\files\json\trains.json
			 //F:\02-Programme_PQDI\03_MJ\job\Thread_trains\fr\bsdev\files\json\trains.json
			 
			 //F:\02-Programme_PQDI\03_MJ\job\Thread_trains\json\trains.json
			 //F:\02-Programme_PQDI\03_MJ\job\Thread_trains\fr\bsdev\files\json\trains.json
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader(file);
			
			char[] data = new char[(int)file.length()];
			int is = reader.read(data);
			
			//for(char c : data) {
			//	System.out.print(c);
			//}
			
			JSONObject jsonobject = new JSONObject(new String(data));
			
			if(jsonobject.has("train")) {
				JSONArray jsonarray = jsonobject.getJSONArray("train");
				
				System.out.println(jsonarray.getJSONObject(0));
				JSONObject subobject = jsonarray.getJSONObject(0);
				
				Iterator it = subobject.keys();
				while(it.hasNext()) {
					Object key = it.next();
					System.out.print("key   :"+key+" -- ");
					System.out.println("value :"+subobject.get((String)key));
				}
			}
			
			if(jsonobject.has("train")) {
				JSONArray jsonarray = jsonobject.getJSONArray("train");
				System.out.println("dimension :"+jsonarray.length());
				System.out.println(jsonarray.getJSONObject(1));
				JSONObject subobject = jsonarray.getJSONObject(1);
				
				Iterator it = subobject.keys();
				while(it.hasNext()) {
					Object key = it.next();
					System.out.print("key   :"+key+" -- ");
					System.out.println("value :"+subobject.get((String)key));
				}
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
		}
		
		
	}

}
