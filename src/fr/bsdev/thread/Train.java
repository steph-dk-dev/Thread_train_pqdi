package fr.bsdev.thread;

import fr.bsdev.beans.ObjectTrain;
import fr.bsdev.print.StringColor;
import fr.bsdev.semaphore.Exo_7_ThomasAndFriends;


public class Train implements Runnable {

	private Exo_7_ThomasAndFriends rail;
	private int start = 0;
	private int end = 0;
	@SuppressWarnings("unused")
	private int output=0;
	
	private int direction = 1;
	private int position = 0;
	private int actualPosition = 0;
	
	private ObjectTrain obj_train = null;
	
	private String name;
	private boolean tunnel;
	private String color;
	private String style;
	
	int delay = 0;
	int slow = 0;
	
	private boolean priority = false;
	private boolean signal = false;
	
	// wait until the section of track is clear: red light
	private boolean redLigth = false;
	
	private static int MAXLENGHTH = 68;
	private String message = null;
	
	public Train(Exo_7_ThomasAndFriends rail,int start1,int end1, String name, int delay) {
		super();
		this.delay=delay;
		this.slow =1;
		this.rail = rail;
		this.start =Math.min(start1, end1);
		this.end = Math.max(start1, end1);
		this.output = end1;
		this.name = name;
		this.tunnel = false;
		if(start1>end1)
			this.direction = -1;
		
		// define the position of the train station
		position = getRandomWithExclusion( start,  end,  MAXLENGHTH);
	}
	
	
	public Train(Exo_7_ThomasAndFriends rail,int start1,int end1,ObjectTrain objTrain) {
		super();
		this.obj_train = objTrain;
		this.delay=objTrain.getSpeedMin();
		this.slow =objTrain.getSpeedTunnelMin();
		this.color =objTrain.getColor();
		this.style = objTrain.getStyle();
		this.rail = rail;
		this.start =Math.min(start1, end1);
		this.end = Math.max(start1, end1);
		this.output = end1;
		this.name = objTrain.getName();
		this.tunnel = false;
		if(start1>end1)
			this.direction = -1;
		
		// define the position of the train station
		position = getRandomWithExclusion( start,  end,  MAXLENGHTH);
	}

	public int getRandomWithExclusion(int start, int end, int max) {
		int a =(int)(Math.random()*max);
	  	while(a>=start && a <= end) {
	  		a =(int)(Math.random()*max);
	  		//System.out.println("a= "+a);
	  	}
	  	System.out.println("a= "+a);
	  	return a;	
	}
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getTunnel() {
		return tunnel;
	}

	public void setTunnel(boolean tunnel) {
		this.tunnel = tunnel;
	}
	
	

	public String getColor() {
		return color;
	}


	public String getStyle() {
		return style;
	}


	public int getSlow() {
		return slow;
	}


	public void trainSleep(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getActualPosition() {
		return actualPosition;
	}

	@Override
	public void run() {
		
		this.actualPosition = this.position;
		int nextPosition = 0;
		@SuppressWarnings("unused")
		int lap_count = 0;
		boolean runnable = true;
		@SuppressWarnings("unused")
		boolean OneTrain = true;
		this.redLigth = false;
		
		if(Thread.activeCount()>3)
			OneTrain = false;
		
		//System.out.println(this.name+" ,I'm gone!");
		this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" ,I'm gone!"));
		signal =true;
		@SuppressWarnings("unused")
		boolean occuped = false;
		
		while(runnable) {
			nextPosition=(actualPosition+direction)%MAXLENGHTH;
			
			if(nextPosition<0)
				nextPosition =MAXLENGHTH;
			
			if(nextPosition >= start-1 && nextPosition <end+1) {
			
			// if the train is on the common section of track
			if(this.signal &&!this.rail.occupied()) {
				//System.out.println(this.getName()+" I occupy the common section of track");
				this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" I occupy the common section of track"));
				//this.redLigth = false;
				this.signal = false;
				this.priority = true;
				this.rail.init();
				
			}
			// while the track is occupied, wait
			//
			while(this.rail.occupied() && !this.priority) {
				if(!this.redLigth) {
					//System.out.println(this.getName()+" the section of track is occupied");
					this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" the section of track is occupied"));
					this.redLigth = true;
					
				}
				
			}
			if(!this.priority)this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" The train runs."));
			trainSleep(this.slow);
			}
			this.redLigth = false;
			
			// set the tunnel exit condition according to direction
			if( nextPosition >= this.end+1 && this.priority) {
				rail.signaler();
				occuped = false;
				this.priority = false;
				this.signal = true;
				//System.out.println(this.getName() + " I'm leaving the track !");
				this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" I'm leaving the track !"));
				trainSleep(300);
				this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" The train runs."));
			}
			 
			actualPosition=nextPosition;
			trainSleep(this.delay);
			if(actualPosition == this.position) {
				//System.out.println(this.getName() + " The train arrived at the station, a 10-minute stop before the next departure.");
				this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" The train arrived at the station, a 10-minute stop before the next departure."));
				trainSleep(5*this.slow);
				this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" Careful at the start. The train leaves the station."));
				this.redLigth = false;
				trainSleep(this.slow);
				this.setMessage(StringColor.colorString(obj_train.getColor(), this.getName()+" The train runs."));
				
				lap_count++;
				this.redLigth = true;
				
			}
			
			
	    }	
	}
}