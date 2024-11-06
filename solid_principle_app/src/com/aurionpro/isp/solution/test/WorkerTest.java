package com.aurionpro.isp.solution.test;

import com.aurionpro.isp.solution.model.Human;
import com.aurionpro.isp.solution.model.IHuman;
import com.aurionpro.isp.solution.model.IWorker;
import com.aurionpro.isp.solution.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker robot = new Robot();
		robot.startWork();
		robot.stopWork();
		
		IHuman human = new Human();
		human.startWork();
		human.eat();
		human.drink();
		human.stopWork();
	}

}
