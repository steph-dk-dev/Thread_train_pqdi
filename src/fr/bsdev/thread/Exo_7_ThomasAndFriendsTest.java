package fr.bsdev.thread;

import java.util.List;

import fr.bsdev.beans.ObjectTrain;
import fr.bsdev.json.ReadJson;
import fr.bsdev.semaphore.Exo_7_ThomasAndFriends;

public class Exo_7_ThomasAndFriendsTest {

	public static void main(String[] args) {
		
		Exo_7_ThomasAndFriends rail = new Exo_7_ThomasAndFriends(1);
		List<ObjectTrain> listTrain = ReadJson.getList();
		
		//for(ObjectTrain objt:listTrain) {
		//	System.out.println(objt);
		//}
		
		int input = 3;
		int output = 18;
		
		Train train_A = new Train(rail, input, output,listTrain.get(0));
		Train train_B = new Train(rail, output, input,listTrain.get(1));
		
		Ihm ihm = new Ihm(train_A,train_B);
		
		Thread T01 = new Thread(train_A);
		Thread T02 = new Thread(train_B);
		Thread T03 = new Thread(ihm);
		
		System.out.println("The trains depart...");
		System.out.println("The train "+train_A.getName()+" will enter the tunnel in position "+train_A.getStart()+"!");
		System.out.println("The train "+train_B.getName()+" will enter the tunnel in position "+train_B.getStart()+"!");
		
		
		T01.start();
		T02.start();
		T03.start();
		
	}

}
