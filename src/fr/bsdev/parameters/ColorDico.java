package fr.bsdev.parameters;

import fr.bsdev.structures.Dico;
import fr.bsdev.parameters.*;

public class ColorDico implements Constantes{
	  private Dico<String,String> dico_color = null;
	  private volatile static ColorDico instance = null;
	  
	  /**
	   * Singleton constructor
	   */
	  private ColorDico() {
		  super();
		  this.dico_color = new Dico<>();
		  this.init();
	  }
	  
	  /**
	   * This method returns the dictionary containing the colors.
	   * @return
	   */
	  private Dico<String, String> getDico() {
		  return this.dico_color;
	  }
	  
	  /**
	   * This method calls the Colorprint object; if the object doesn't exist, the object is created.
	   * @return  a Colorprint object instance
	   */
	  public static synchronized  ColorDico getInstance() {
			if(instance==null)
				instance = new ColorDico();
			return instance;
	  }
	  
	  
	  /**
	   * This method returns the color code to apply.
	   * @param color color to apply
	   * @return a string of characters representing the color code to be applied
	   * @throws errorDataStructure if the index is out of range (index < 0 || index >= size())
	   */
	  public String getColor(String color)  {
		  Dico<String, String> dico = ColorDico.getInstance().getDico();
		  
		  if(dico.keyExist(color)) {
			  return dico.getValue(color).get(0);
		  }else
			  return dico.getValue(BLACK).get(0);
	  }
	  
      /**
       * This method loads the dictionary
       */
	  private  void init() {
		  this.dico_color.put("BLACK", 			"30m");
		  this.dico_color.put("RED", 			"31m");
		  this.dico_color.put("GREEN", 			"32m");
		  this.dico_color.put("YELLOW", 		"33m");
		  this.dico_color.put("BLUE", 			"34m");
		  this.dico_color.put("MAGENTA", 		"35m");
		  this.dico_color.put("CYAN", 			"36m");
		  this.dico_color.put("WHITE", 			"37m");
		  
		  this.dico_color.put("INVERSEBLACK", 	"40m");
		  this.dico_color.put("INVERSERED", 	"41m");
		  this.dico_color.put("INVERSEGREEN", 	"42m");
		  this.dico_color.put("INVERSEYELLOW",	"43m");
		  this.dico_color.put("INVERSEBLUE",  	"44m");
		  this.dico_color.put("INVERSEMAGENTA", "45m");
		  this.dico_color.put("INVERSECYAN", 	"46m");
		  this.dico_color.put("INVERSEWHITE", 	"47m");
		  
		  this.dico_color.put("LIGHTBLACK", 	"90m");
		  this.dico_color.put("LIGHTRED", 		"91m");
		  this.dico_color.put("LIGHTGREEN", 	"92m");
		  this.dico_color.put("LIGHTYELLOW",	"93m");
		  this.dico_color.put("LIGHTBLUE",  	"94m");
		  this.dico_color.put("LIGHTMAGENTA",	"95m");
		  this.dico_color.put("LIGHTCYAN", 		"96m");
		  this.dico_color.put("LIGHTWHITE", 	"97m");
		  
		  this.dico_color.put("LIGHTINVERSEBLACK", 	"100m");
		  this.dico_color.put("LIGHTINVERSERED", 	"101m");
		  this.dico_color.put("LIGHTINVERSEGREEN", 	"102m");
		  this.dico_color.put("LIGHTINVERSEYELLOW",	"103m");
		  this.dico_color.put("LIGHTINVERSEBLUE",  	"104m");
		  this.dico_color.put("LIGHTINVERSEMAGENTA","105m");
		  this.dico_color.put("LIGHTINVERSECYAN", 	"106m");
		  this.dico_color.put("LIGHTINVERSEWHITE", 	"107m");
		  
		  
		  
		  this.dico_color.put("ORANGE", "38;2;255;127;0m");
		  this.dico_color.put("BROWN", "38;2;97;48;48m");
		  this.dico_color.put("GRAY", "38;2;95;95;95m");
		  this.dico_color.put("PURPLE", "38;2;136;86;177m");
		  
		  this.dico_color.put("INVERSEORANGE", "48;2;255;127;0m");
		  this.dico_color.put("INVERSEBROWN", "48;2;97;48;48m");
		  this.dico_color.put("INVERSEGRAY", "48;2;95;95;95m");
		  this.dico_color.put("INVERSEPURPLE", "48;2;136;86;177m");
		  
	  }
}
