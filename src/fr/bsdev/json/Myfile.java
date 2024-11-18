package fr.bsdev.json;

public class Myfile {
	
	private String filename = null;
	
	
	public String getRealPath(String filename) {
		this.filename = filename;
		return this.getClass().getClassLoader().getResource(filename).getPath();
	}

}
