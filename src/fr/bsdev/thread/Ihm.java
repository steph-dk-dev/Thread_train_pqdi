package fr.bsdev.thread;

import java.io.IOException;

import fr.bsdev.parameters.Constantes;
import fr.bsdev.print.StringColor;
import fr.bsdev.structures.Grid2D;
import fr.bsdev.structures.Tuple;
import fr.bsdev.tools.ClearConsole;



public class Ihm implements Constantes,Runnable{
	
	private Train train_A = null;
	private Train train_B = null;

	private Tuple[] pos_train_A = {new Tuple(14,1),new Tuple(14,2),new Tuple(14,3),new Tuple(14,4),new Tuple(14,4),new Tuple(14,6),
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


	private Tuple[] pos_train_B = {new Tuple(17,4),new Tuple(16,4),new Tuple(15,4),new Tuple(14,4),new Tuple(14,4),new Tuple(14,6),
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
	
	private String color_train_A = null; // StringColor.colorString(LIGHTINVERSEBLUE, "-");
	private String color_train_B = null; // StringColor.colorString(LIGHTINVERSEMAGENTA, "*");
	
	private String track_B = StringColor.colorString(LIGHTINVERSECYAN, "o");
	private String Common  = StringColor.colorString(LIGHTINVERSERED, "o");
	private String track_A = StringColor.colorString(LIGHTINVERSEYELLOW, "o");
	
	private Grid2D grid    = null;
	
	
	public Ihm(Train a, Train b) {
		super();
		
		this.train_A = a;
		this.train_B = b;
		
		this.color_train_A  = StringColor.colorString(this.train_A.getColor(), this.train_A.getStyle());
		this.color_train_B  = StringColor.colorString(this.train_B.getColor(), this.train_B.getStyle());
		this.
		grid = new Grid2D(35,24);
		grid.fillCharacter(' ');
		
		// créer le circuit du train A
				int A_row_start = 1;
				int A_row_end   = 14;
				int A_column_start = 1;
				int A_column_end = 22;
	
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
	}
	
	
	public void showTrains(int pos_a, int pos_b) throws InterruptedException, IOException {
		//System.out.println(pos_train_A[i]);
		//System.out.println(this.pos_train_A);
		grid.writeData(pos_train_A[pos_a%pos_train_A.length], color_train_A);
		grid.writeData(pos_train_B[pos_b%pos_train_A.length], color_train_B);
		grid.showString();
		Thread.sleep(500);
		ClearConsole.clear();
		if(pos_a%pos_train_A.length>2 && pos_a%pos_train_A.length<19) 
			grid.writeData(pos_train_A[pos_a%pos_train_A.length],Common);
		else {
			grid.writeData(pos_train_A[pos_a%pos_train_A.length], track_A);
			//grid.writeData(pos_train_B[(i+offset)%pos_train_A.length], track_B);
		}
		
		if((pos_b)%pos_train_A.length>2 && (pos_b)%pos_train_A.length<19) 
			grid.writeData(pos_train_A[pos_b%pos_train_A.length],Common);
		else {
			grid.writeData(pos_train_B[(pos_b)%pos_train_A.length], track_B);
		}
	
		grid.showString();
		System.out.println(train_A.getMessage());
		System.out.println(train_B.getMessage());
		Thread.sleep(500);
		ClearConsole.clear();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean runnable = true;
		while(runnable) {
			try {
				this.showTrains(this.train_A.getActualPosition(), this.train_B.getActualPosition());
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
