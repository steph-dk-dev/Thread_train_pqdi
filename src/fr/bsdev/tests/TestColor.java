package fr.bsdev.tests;

import fr.bsdev.parameters.Constantes;
import fr.bsdev.print.StringColor;

public class TestColor implements Constantes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = StringColor.colorString(LIGHTGREEN, "Toto");
		System.out.println(name);
		
		String [] colors = {BLACK,BLUE,BROWN,CYAN,GRAY,GREEN,LIGHTBLACK,LIGHTBLUE,
							LIGHTBROWN,LIGHTCYAN,LIGHTGRAY,LIGHTGREEN,
							LIGHTINVERSEBLACK,LIGHTINVERSEBLUE,LIGHTINVERSEBROWN,
							LIGHTINVERSECYAN,LIGHTINVERSEGRAY,LIGHTINVERSEGREEN,
							LIGHTINVERSEMAGENTA,LIGHTINVERSEORANGE,LIGHTINVERSEPURPLE,
							LIGHTINVERSEWHITE,LIGHTINVERSEYELLOW,
							LIGHTMAGENTA,LIGHTORANGE,LIGHTPURPLE,LIGHTWHITE,LIGHTYELLOW,
							MAGENTA,ORANGE,PURPLE,RED,WHITE,YELLOW};
		
		for(String color :colors) {
			String value = StringColor.colorString(color, "couleur");
			System.out.print(value);
		}
		System.out.println();
		
		for(String color :colors) {
			String value = StringColor.boldString(StringColor.colorString(color, "couleur"));
			System.out.print(value);
		}
		System.out.println();
		
		for(String color :colors) {
			String value = StringColor.italicString(StringColor.colorString(color, "couleur"));
			System.out.print(value);
		}
		System.out.println();
		
		for(String color :colors) {
			String value = StringColor.strikeoutString(StringColor.colorString(color, "couleur"));
			System.out.print(value);
		}
		
		System.out.println();
		for(String color :colors) {
			String value = StringColor.underlinedString(StringColor.colorString(color, "couleur"));
			System.out.print(value);
		}
		System.out.println();
	}

}
