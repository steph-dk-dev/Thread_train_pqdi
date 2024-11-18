package fr.bsdev.parameters;
/**
 * This interface will contain all the constants for color management.
 */
public interface Constantes {
		/**
		 * Constants for the different colors
		 */
	  /**
	   * RESET stops spreading the color applied to a String
	   * ansi code : \u001b[0m
	   */
	  public static final String RESET 					= "\u001b[0m";
	  
	  /**
	   * this code uses the ansi escape code to apply a color to a String
	   * ansi code : \u001b[
	   */
	  public static final String PREFIXCOLOR 			= "\u001b[";
	  /**
	   * BLACK variable used to define the dictionary key
	   */
	  public static final String BLACK 					= "BLACK";
	  /**
	   * RED variable used to define the dictionary key
	   */
	  public static final String RED 					= "RED";
	  /**
	   * GREEN variable used to define the dictionary key
	   */
	  public static final String GREEN 					= "GREEN";
	  /**
	   * YELLOW variable used to define the dictionary key
	   */
	  public static final String YELLOW 				= "YELLOW";
	  /**
	   * BLUE variable used to define the dictionary key
	   */
	  public static final String BLUE 					= "BLUE";
	  /**
	   * MAGENTA variable used to define the dictionary key
	   */
	  public static final String MAGENTA 				= "MAGENTA";
	  /**
	   * CYAN variable used to define the dictionary key
	   */
	  public static final String CYAN 					= "CYAN";
	  /**
	   * WHITE variable used to define the dictionary key
	   */
	  public static final String WHITE 					= "WHITE";
	  /**
	   * ORANGE variable used to define the dictionary key
	   */
	  public static final String ORANGE 				= "ORANGE";
	  /**
	   * BROWN variable used to define the dictionary key
	   */
	  public static final String BROWN 					= "BROWN";
	  /**
	   * GRAY variable used to define the dictionary key
	   */
	  public static final String GRAY 					= "GRAY";
	  /**
	   * PURPLE variable used to define the dictionary key
	   */
	  public static final String PURPLE 				= "PURPLE";
	  /**
	   * LIGHTBLACK variable used to define the dictionary key
	   */
	  public static final String LIGHTBLACK 			= "LIGHTBLACK";
	  /**
	   * LIGHTRED variable used to define the dictionary key
	   */
	  public static final String LIGHTRED 				= "LIGHTRED";
	  /**
	   * LIGHTGREEN variable used to define the dictionary key
	   */
	  public static final String LIGHTGREEN 			= "LIGHTGREEN";
	  /**
	   * LIGHTYELLOW variable used to define the dictionary key
	   */
	  public static final String LIGHTYELLOW 			= "LIGHTYELLOW";
	  /**
	   * LIGHTBLUE variable used to define the dictionary key
	   */
	  public static final String LIGHTBLUE 				= "LIGHTBLUE";
	  /**
	   * LIGHTMAGENTA variable used to define the dictionary key
	   */
	  public static final String LIGHTMAGENTA 			= "LIGHTMAGENTA";
	  /**
	   * LIGHTCYAN variable used to define the dictionary key
	   */
	  public static final String LIGHTCYAN 				= "LIGHTCYAN";
	  /**
	   * LIGHTWHITE variable used to define the dictionary key
	   */
	  public static final String LIGHTWHITE 			= "LIGHTWHITE";
	  /**
	   * LIGHTORANGE variable used to define the dictionary key
	   */
	  public static final String LIGHTORANGE 			= "LIGHTORANGE";
	  /**
	   * LIGHTBROWN variable used to define the dictionary key
	   */
	  public static final String LIGHTBROWN 			= "LIGHTBROWN";
	  /**
	   * LIGHTGRAY variable used to define the dictionary key
	   */
	  public static final String LIGHTGRAY 				= "LIGHTGRAY";
	  /**
	   * LIGHTPURPLE variable used to define the dictionary key
	   */
	  public static final String LIGHTPURPLE 			= "LIGHTPURPLE";
	  
	  
	  /**
	   * LIGHTINVERSEBLACK variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEBLACK 		= "LIGHTINVERSEBLACK";
	  /**
	   * LIGHTINVERSERED variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSERED 		= "LIGHTINVERSERED";
	  /**
	   * LIGHTINVERSEGREEN variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEGREEN 		= "LIGHTINVERSEGREEN";
	  /**
	   * LIGHTINVERSEYELLOW variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEYELLOW 	= "LIGHTINVERSEYELLOW";
	  /**
	   * LIGHTINVERSEBLUE variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEBLUE 		= "LIGHTINVERSEBLUE";
	  /**
	   * LIGHTINVERSEMAGENTA variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEMAGENTA 	= "LIGHTINVERSEMAGENTA";
	  /**
	   * LIGHTINVERSECYAN variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSECYAN 		= "LIGHTINVERSECYAN";
	  /**
	   * LIGHTINVERSEWHITE variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEWHITE 		= "LIGHTINVERSEWHITE";
	  /**
	   * LIGHTINVERSEORANGE variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEORANGE 	= "LIGHTINVERSEORANGE";
	  /**
	   * LIGHTINVERSEBROWN variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEBROWN 		= "LIGHTINVERSEBROWN";
	  /**
	   * LIGHTINVERSEGRAY variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEGRAY 		= "LIGHTINVERSEGRAY";
	  /**
	   * LIGHTINVERSEPURPLE variable used to define the dictionary key
	   */
	  public static final String LIGHTINVERSEPURPLE 	= "LIGHTINVERSEPURPLE";
	  
	  /**
	   * BLACK color code ANSI 30m
	   */
	  public static final String _BLACK 				= "30m";
	  /**
	   * RED color code ANSI 31m
	   */
	  public static final String _RED 					= "31m";
	  /**
	   * GREEN color code ANSI 32m
	   */
	  public static final String _GREEN 				= "32m";
	  /**
	   * YELLOW color code ANSI 33m
	   */
	  public static final String _YELLOW 				= "33m";
	  /**
	   * BLUE color code ANSI 34m
	   */
	  public static final String _BLUE 					= "34m";
	  /**
	   * MAGENTA color code ANSI 35m
	   */
	  public static final String _MAGENTA 				= "35m";
	  /**
	   * CYAN color code ANSI 36m
	   */
	  public static final String _CYAN 					= "36m";
	  /**
	   * WHITE color code ANSI 37m
	   */
	  public static final String _WHITE 				= "37m";
	  /**
	   * INVERSE BLACK color code ANSI 40m
	   */
	  public static final String _INVERSEBLACK 			= "40m";
	  /**
	   * INVERSE RED color code ANSI 41m
	   */
	  public static final String _INVERSERED 			= "41m";
	  /**
	   * INVERSE GREEN color code ANSI 42m
	   */
	  public static final String _INVERSEGREEN 			= "42m";
	  /**
	   * INVERSE YELLOW color code ANSI 43m
	   */
	  public static final String _INVERSEYELLOW 		= "43m";
	  /**
	   * INVERSE BLUE color code ANSI 44m
	   */
	  public static final String _INVERSEBLUE 			= "44m";
	  /**
	   * INVERSE MAGENTA color code ANSI 45m
	   */
	  public static final String _INVERSEMAGENTA 		= "45m";
	  /**
	   * INVERSE CYAN color code ANSI 46m
	   */
	  public static final String _INVERSECYAN 			= "46m";
	  /**
	   * INVERSE GRAY color code ANSI 47m
	   */
	  public static final String _INVERSEGRAY 			= "47m";
	  /**
	   * INVERSE WHITE color code ANSI 7m
	   */
	  public static final String _INVERSEWHITE 			= "7m";
	  
	  /**
	   * ORANGE  color code ANSI 38;2;255;127;0m
	   */
	  public static final String _ORANGE 				= "38;2;255;127;0m";
	  /**
	   * BROWN  color code ANSI 38;2;97;48;48m
	   */
	  public static final String _BROWN 				= "38;2;97;48;48m";
	  /**
	   * GRAY  color code ANSI 38;2;95;95;95m
	   */
	  public static final String _GRAY 					= "38;2;95;95;95m";
	  /**
	   * PURPLE  color code ANSI 38;2;136;86;177m
	   */
	  public static final String _PURPLE 				= "38;2;136;86;177m";
	  
	  
	  /**
	   *  GRAY AT 50%  color code 90m
	   */
	  public static final String _LIGHTBLACK 			= "90m";
	  /**
	   * LIGHT RED  color code ANSI 91m
	   */
	  public static final String _LIGHTRED 				= "91m";
	  /**
	   * LIGHT GREEN  color code ANSI 92m
	   */
	  public static final String _LIGHTGREEN 			= "92m";
	  /**
	   * LIGHT YELLOW  color code ANSI 93m
	   */
	  public static final String _LIGHTYELLOW 			= "93m";
	  /**
	   * LIGHT BLUE  color code ANSI 94m
	   */
	  public static final String _LIGHTBLUE 			= "94m";
	  /**
	   * LIGHT MAGENTA  color code ANSI 95m
	   */
	  public static final String _LIGHTMAGENTA 			= "95m";
	  /**
	   * LIGHT CYAN  color code ANSI 96m
	   */
	  public static final String _LIGHTCYAN 			= "96m";
	  /**
	   * LIGHT GRAY  color code ANSI 97m
	   */
	  public static final String _LIGHTGRAY 			= "97m";
	  
	  
	  
	  /**
	   * INVERSE  GRAY AT 50% color code 100m
	   */
	  public static final String _LIGHTINVERSEBLACK 	= "100m";
	  /**
	   * INVERSE LIGHT RED  color code 101m
	   */
	  public static final String _LIGHTINVERSERED 		= "101m";
	  /**
	   * INVERSE LIGHT GREEN  color code ANSI 102m
	   */
	  public static final String _LIGHTINVERSEGREEN 	= "102m";
	  /**
	   * INVERSE LIGHT YELLOW  color code ANSI 103m
	   */
	  public static final String _LIGHTINVERSEYELLOW 	= "103m";
	  /**
	   * INVERSE LIGHT BLUE  color code ANSI 104m
	   */
	  public static final String _LIGHTINVERSEBLUE 		= "104m";
	  /**
	   * INVERSE LIGHT MAGENTA  color code ANSI 105m
	   */
	  public static final String _LIGHTINVERSEMAGENTA 	= "105m";
	  /**
	   * INVERSE LIGHT CYAN  color code ANSI 106m
	   */
	  public static final String _LIGHTINVERSECYAN 		= "106m";
	  /**
	   * INVERSE LIGHT GRAY  color code ANSI 38;2;136;86;177m
	   */
	  public static final String _LIGHTINVERSEGRAY 		= "107m";
	  
	  
}
