package fr.bsdev.tests;

import java.io.IOException;

import fr.bsdev.parameters.Constantes;
import fr.bsdev.print.StringColor;
import fr.bsdev.structures.Grid2D;
import fr.bsdev.structures.Tuple;
import fr.bsdev.tools.ClearConsole;

public class TestGrid2D implements Constantes{

	public static void main(String[] args) throws InterruptedException, IOException {

		Grid2D grid = new Grid2D(35,24);
		grid.fillCharacter(' ');
		
		Tuple size = grid.getSize();
		
//		System.out.println("rows ="+size.get(0)+"  columns ="+size.get(1));
//		
//		System.out.println("valeur (2,3) ="+grid.readData(2,3));
//		
//		grid.writeData(2, 3, 2);
//		System.out.println("valeur (2,3) ="+grid.readData(2,3));
		
		// créer le circuit du train A
		int A_row_start = 1;
		int A_row_end   = 14;
		int A_column_start = 1;
		int A_column_end = 22;
		
		String track_A = StringColor.colorString(LIGHTINVERSEYELLOW, "o");
		
		
		for(int c=A_column_start; c<=A_column_end;c++)
			grid.writeData(A_row_start, c, track_A);
		
		for(int c=A_column_start; c<=A_column_end;c++)
			grid.writeData(A_row_end, c, track_A);
		
		for(int r=A_row_start; r<=A_row_end;r++)
			grid.writeData(r, A_column_start, track_A);
		
		for(int r=A_row_start; r<=A_row_end;r++)
			grid.writeData(r, A_column_end, track_A);
		
		
		// créer le circuit du train A
		int B_row_start = 15;
		int B_row_end   = 15+18;
		int B_column_start = 4;
		int B_column_end = 19;
		
		String track_B = StringColor.colorString(LIGHTINVERSEBLUE, "o");
		String Common = StringColor.colorString(LIGHTINVERSERED, "o");
		
		for(int c=A_column_start; c<=A_column_end;c++)
			if(c>3 && c<20)
				grid.writeData(A_row_end, c, Common);
		
		for(int c=B_column_start; c<=B_column_end;c++)
			grid.writeData(B_row_end, c, track_B);
		
		for(int r=B_row_start; r<=B_row_end;r++)
			grid.writeData(r, B_column_start, track_B);
		
		for(int r=B_row_start; r<=B_row_end;r++) {
			grid.writeData(r, B_column_end, track_B);
		}
		
		
		Tuple[] pos_train_A = {new Tuple(14,1),new Tuple(14,2),new Tuple(14,3),new Tuple(14,4),new Tuple(14,4),new Tuple(14,6),
							   new Tuple(14,7),new Tuple(14,8),new Tuple(14,9),new Tuple(14,10),new Tuple(14,11),new Tuple(14,12),
							   new Tuple(14,13),new Tuple(14,14),new Tuple(14,15),new Tuple(14,16),new Tuple(14,17),new Tuple(14,18),
							   new Tuple(14,19),new Tuple(14,20),new Tuple(14,21),new Tuple(14,22),new Tuple(13,22),new Tuple(12,22),
							   new Tuple(11,22),new Tuple(10,22),new Tuple(9,22),new Tuple(8,22),new Tuple(7,22),new Tuple(6,22),
							   new Tuple(5,22),new Tuple(4,22),new Tuple(3,22),new Tuple(2,22),new Tuple(1,22),new Tuple(1,21),
							   new Tuple(1,20),new Tuple(1,19),new Tuple(1,18),new Tuple(1,17),new Tuple(1,16),new Tuple(1,15),
							   new Tuple(1,14),new Tuple(1,13),new Tuple(1,12),new Tuple(1,11),new Tuple(1,10),new Tuple(1,9),
							   new Tuple(1,8),new Tuple(1,7),new Tuple(1,6),new Tuple(1,5),new Tuple(1,4),new Tuple(1,3),
							   new Tuple(1,2),new Tuple(1,1),new Tuple(2,1),new Tuple(3,1),new Tuple(4,1),new Tuple(5,1),
							   new Tuple(6,1),new Tuple(7,1),new Tuple(8,1),new Tuple(9,1),new Tuple(10,1),new Tuple(11,1),
							   new Tuple(12,1),new Tuple(13,1)};
		
		Tuple[] pos_train_B = {new Tuple(17,4),new Tuple(16,4),new Tuple(15,4),new Tuple(14,4),new Tuple(14,4),new Tuple(14,6),
							   new Tuple(14,7),new Tuple(14,8),new Tuple(14,9),new Tuple(14,10),new Tuple(14,11),new Tuple(14,12),
							   new Tuple(14,13),new Tuple(14,14),new Tuple(14,15),new Tuple(14,16),new Tuple(14,17),new Tuple(14,18),
							   new Tuple(14,19),new Tuple(15,19),new Tuple(16,19),new Tuple(17,19),new Tuple(18,19),new Tuple(19,19),
							   new Tuple(20,19),new Tuple(21,19),new Tuple(22,19),new Tuple(23,19),new Tuple(24,19),new Tuple(25,19),
							   new Tuple(26,19),new Tuple(27,19),new Tuple(28,19),new Tuple(29,19),new Tuple(30,19),new Tuple(31,19),
							   new Tuple(32,19),new Tuple(33,19),new Tuple(33,18),new Tuple(33,17),new Tuple(33,16),new Tuple(33,15),
							   new Tuple(33,14),new Tuple(33,13),new Tuple(33,12),new Tuple(33,11),new Tuple(33,10),new Tuple(33,9),
							   new Tuple(33,8),new Tuple(33,7),new Tuple(33,6),new Tuple(33,5),new Tuple(33,4),new Tuple(32,4),
							   new Tuple(31,4),new Tuple(30,4),new Tuple(29,4),new Tuple(28,4),new Tuple(27,4),new Tuple(26,4),
							   new Tuple(25,4),new Tuple(24,4),new Tuple(23,4),new Tuple(22,4),new Tuple(21,4),new Tuple(20,4),
							   new Tuple(19,4),new Tuple(18,4)};
		
		
		
		String train_A = StringColor.colorString(LIGHTINVERSEBLUE, "-");
		String train_B = StringColor.colorString(LIGHTINVERSEBLACK, "*");
		int offset_A = getRandomWithExclusion( 3,  18,pos_train_A.length  ) ;
		int offset_B = getRandomWithExclusion( 3,  18,pos_train_A.length  ) ;
		for(int i = offset_A,j=offset_B; i<140;i++,j++) {
			//System.out.println(pos_train_A[i]);
			grid.writeData(pos_train_A[i%pos_train_A.length], train_A);
			grid.writeData(pos_train_B[(j)%pos_train_A.length], train_B);
			grid.showString();
			Thread.sleep(100);
			ClearConsole.clear();
			if(i%pos_train_A.length>2 && i%pos_train_A.length<19) 
				grid.writeData(pos_train_A[i%pos_train_A.length],Common);
			else {
				grid.writeData(pos_train_A[i%pos_train_A.length], track_A);
				//grid.writeData(pos_train_B[(i+offset)%pos_train_A.length], track_B);
			}
			
			if((j)%pos_train_A.length>2 && (j)%pos_train_A.length<19) 
				grid.writeData(pos_train_A[j%pos_train_A.length],Common);
			else {
				grid.writeData(pos_train_B[(j)%pos_train_A.length], track_B);
			}
		
			grid.showString();
			Thread.sleep(100);
			ClearConsole.clear();
		}
		
	}
	
	public static  int getRandomWithExclusion(int start, int end, int max) {
		int a =(int)(Math.random()*max);
	  	while(a>=start && a <= end) {
	  		a =(int)(Math.random()*max);
	  		//System.out.println("a= "+a);
	  	}
	  	System.out.println("a= "+a);
	  	return a;	
	}

}
