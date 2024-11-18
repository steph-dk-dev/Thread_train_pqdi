package fr.bsdev.tools
;
import java.io.Console;
import java.io.IOException;
/**
 * Cette Classe fournit les outils pour la console
 * A ce jour elle dispose de la m�thode clear
 * en fonction des besoins identifi�s durant votre parcours
 * cette classe va s'enrichir de plusieurs m�thodes
 * @author Barois St�phane
 *
 */
public class ClearConsole {
	/**
	 * Cette m�thode de classe efface la console du terminal Windows ou linux
	 * mais n'efface pas le contenue de la console d'�clipse.
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void clear() throws IOException, InterruptedException {
		 try {
		        final String OS = System.getProperty("os.name");
		        if (OS.contains("Windows")){
		        	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } else {
		        	//OS LINUX
		        	Runtime.getRuntime().exec("clear");
		        }
		    } catch (final Exception e)
		    {
		        System.err.println("Exception :"+e.getMessage().toString());
		        System.err.println("Exception :"+e.getCause().toString()); 
		    }
    }
	/**
	 * Effacer une ligne de caract�res
	 * cette m�thode est � utiliser pour la console eclipse
	 * l'astuce, placer le chariot en retour
	 * ensuite supprimer les caract�res
	 * replacer le chariot dans la bonne direction
	 */
	public static void clearConsole(int nb) {
		 System.out.print("\r");
		 for( int i=0;i<nb;i++)
			 System.out.print(" ");
		 System.out.print("\r");  
		
		}	
}
