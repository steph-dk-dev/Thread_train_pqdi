package fr.bsdev.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import fr.bsdev.structures.Tuple;

public class Myfile {
	
	
	
	public static  String getRealPath(String filename) {
		Path path = Paths.get(filename);
		try {
			File file = new File(path.toRealPath().toUri());
			return file.getAbsolutePath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static  File getFile(String filename) {
		Path path = Paths.get(filename);
		try {
			File file = new File(path.toRealPath().toUri());
			return file;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static Tuple getStructFile(String filename) {
		Path path = Paths.get(filename);
		try {
			File file = new File(path.toRealPath().toUri());
			return new Tuple(file,file.getAbsolutePath(),(int)file.length());
		} catch (IOException e) {
			System.err.println("le chemin n'a pas été trouvé ...");
			String nomFichier = Thread.currentThread().getContextClassLoader().getResource("filename").getFile();
			File file = new File(nomFichier);
			return new Tuple(file,file.getAbsolutePath(),(int)file.length());
		} catch(NullPointerException np) {
			System.err.println("le fichier n'existe pas ...");
		}
		return null;
		
	}
	
	public static Tuple getReader(String filename,boolean debug) throws ErrorFile {
		
		Tuple StructFile= Myfile.getStructFile(filename);
		
		if(StructFile == null)
			throw new ErrorFile("Erreur :");
		else {
			   File file = (File) StructFile.get(0);
			   int size = (int) StructFile.get(2);
			   FileReader reader;
			   
			try {
				reader = new FileReader(file);
				   if(debug) {
					   char[] data = new char[size];
					   int is = reader.read(data);
					   for(char c : data) {
						 System.out.print(c);
					   }
				   }
				   return new Tuple(reader,size);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String filename ="json/trains.json";
		//String nomFichier = Thread.currentThread().getContextClassLoader().getResource("filename").getFile();
		System.out.println(Thread.currentThread().getContextClassLoader());
		
		
	}
	
	

}
