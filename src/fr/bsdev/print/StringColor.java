package fr.bsdev.print;

import fr.bsdev.parameters.ColorDico;
import fr.bsdev.parameters.Constantes;

public class StringColor implements Constantes{
	/**
	   * This method returns a String with a color
	   * <pre>
	   * <b> Example </b>
	   * 
	   * 	String choose = colorString(ORANGE,"Your choice...");
	   * 	System.out.println(choose);
	   * 
	   * 	Result :
	   *  	display the orange console message.....
	   * </pre>
	   * @param color   a character string containing the color code, value defined in the Constants interface
	   * @param message a character string containing the message to be coated with the color passed in parameter
	   * @return		the character string passed as parameter, wrapped in the color passed as parameter..
	   * @throws errorDataStructure  if the index is out of range (index &lt; 0 || index &gt;= size())
	   */
	  public static String colorString(String color,String message) {
		  String str_color = ColorDico.getInstance().getColor(color);
		  return String.format("%s%s%s", (PREFIXCOLOR+str_color), message, RESET);
	  }
	  
	  /**
	   * This method returns a String with a color, taking three parameters: red, green and blue.
	   * The value is between 0 and 255, and can be expressed in hexadecimal format.
	   * example : 240 --> 0xF0
	   * 
	   * @param _red 	red color parameter, value between 0 and 255
	   * @param _green  green color parameter, value between 0 and 255
	   * @param _blue  	blue color parameter, value between 0 and 255
	   * @param message a string containing the message to be wrapped in the color passed in parameter.
	   * @param reset	if the value is true, the color is applied only to the message; otherwise, 
	   *                the color will continue to be applied to subsequent displays.
	   * @return 		the string passed in parameter wrapped in the color passed in parameter.
	   * @throws colorError  Exception if color parameter values are outside the limits [0,255].
	   */
	  public static String colorString(int _red,int _green,int _blue,boolean reset,String message) throws colorError {
		  if(_red<0 || _red>255)
			  throw new colorError("Red"," Value must be between 0 and 255");
		  
		  if(_green<0 || _green>255)
			  throw new colorError("Green"," Value must be between 0 and 255");
		  
		  if(_blue<0 || _blue>255)
			  throw new colorError("Blue"," Value must be between 0 and 255");
		  
		  short red = (short) (_red & 255);
		  short green =(short) (_green & 255);
		  short blue = (short) (_blue & 255);
		  
		  if(reset)
			  return String.format("\u001b[38;2;%d;%d;%dm%s\u001b[0m", red, green,blue,message);
		  else
			  return String.format("\u001b[38;2;%d;%d;%dm%s", red, green,blue,message);
	  }
	  
	  /**
	   * This method returns a String with a color.
	   * This method takes a parameter containing the 3 colors expressed in the following form: r *256 * g *16 + b
	   * The value is between 0 and 16777215, and can be expressed in hexadecimal.
	   * example : 16113485 --> 0xF5DF4D 
	   * @param color -  color code: value ranges from 0 to 16777215
	   * @param message - A String containing the message to be coated with the color passed in parameter.
	   * @param reset	- if set to true, the color is applied to the message only; otherwise, 
	   * 				the color will continue to be applied to subsequent displays. 
	   * @return 		- The String passed in parameter wrapped in the color passed in parameter.
	   * @throws colorError  - Exception: if the color parameter values are outside the limits [0,255].
	   */
	  public static String colorString(int color,boolean reset,String message) throws colorError {
		  // 0000 0000 1111 0000 1111 0001 1111 0010
		  
		  if(color<0 || color>16777215)
			  throw new colorError("Couleur ",
					  " La valeur doit-être comprise en 0 et 16777215 soit(0x0 et 0xFFFFFF)");
		  
		  int red = (short) ((color/65536)&255);
		  int green = (short) ((color/256)&255);
		  int blue = (short) (color & 255);
		  
		  if(reset)
		  return String.format("\u001b[38;2;%d;%d;%dm%s\u001b[0m", red, green,blue,message);
		  else
		  return String.format("\u001b[38;2;%d;%d;%dm%s", red, green,blue,message);
	  }
	  
	  /**
	   * This method returns a string of characters to be displayed to the console in italics.
	   * @param message containing the message to be switched to italic
	   * @return the String containing information to be displayed in italics in the console
	   */
	  public static String italicString(String message) {
		  return String.format("\u001b[3m%s \u001b[0m",message);
				  
	  }
	  
	   /**
	    * This method returns a string of characters to be displayed in bold on the console.
	    * @param  message containing the message to be switched to bold
	    * @return the String containing information to be displayed in bold in the console
	    */
	  public static String boldString(String message) {
		  return String.format("\u001b[1m%s \u001b[0m",message);
	  }
	  
	  /**
	   * This method returns a string of characters to be displayed in underlined on the console.
	   * @param  message containing the message to be switched to underlined
	   * @return the String containing information to be displayed in underlined in the console
	   */
	  public static String underlinedString(String message) {
		  return String.format("\u001b[4m%s \u001b[0m",message);
	  }
	  
	  /**
	   * This method returns a string of strikethrough characters to be displayed in the console.
	   * @param message containing the message to be displayed striked out
	   * @return the String containing information to be displayed in strikeout in the console
	   */
	  public static String strikeoutString(String message) {
		  return String.format("\u001b[9m%s \u001b[0m",message);
	  }
	  
	  /**
	   * This method returns a String with a color and the color can be retained for other text displayed in the console,
	   *  if the reset parameter is set to false.
	   * 	<pre>
	   * 	<b> Example </b>
	   * 
	   * 		String choose = colorString(ORANGE,"Your choose...",false);
	   * 		System.out.println(choose);
	   * 		System.out.print("Enter a strictly positive value");
	   * 
	   * 	Result :
	   *  		display both console messages in orange color.....
	   *   </pre>
	   *  
	   * @param color   - A String containing the color code, a value defined in the Constants interface.
	   * @param message - A string containing the message to be written with the color passed in parameter.
	   * @param reset	- if set to true, the color is applied to the message only; otherwise, 
	   * 				the color will continue to be applied to subsequent displays.   
	   * @return        - The String passed in parameter wrapped in the color passed in parameter.
	   * @throws errorDataStructure - if the index is out of range (index &lt; 0 || index &gt;= size())
	   */
	  public static String colorString(String color,boolean reset,String message) {
		  String str_color = ColorDico.getInstance().getColor(color);
		  if(reset)
			  return String.format("%s%s%s", (PREFIXCOLOR+str_color), message, RESET);
		  else
			  return String.format("%s%s", (PREFIXCOLOR+str_color), message,"" );
	  }

}
