package com.aurionpro.isp.voilation.test;

import com.aurionpro.isp.voilation.model.Human;
import com.aurionpro.isp.voilation.model.IWorker;
import com.aurionpro.isp.voilation.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker human = new Human();
		human.startWork();
		human.eat();
		human.drink();
		human.stopWor();
		
		IWorker robot = new Robot();
		robot.startWork();
		robot.eat();
		robot.drink();
		robot.stopWor();
	}

}
