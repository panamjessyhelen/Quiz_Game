package com.gqt.miniproject;
public class MainApp {
	public static void main(String[] args) {
		Questions q = new Questions();
		boolean res = q.question1();
		int rewards=0;
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question2();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
			        System.out.println("You have earned: " + q.money + " points.");
			        System.out.println("Thank you for playing!");
			        System.out.println("=======================================================");
			        System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question3();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
				    System.out.println("You have earned: " + q.money + " points.");
				    System.out.println("Thank you for playing!");
				    System.out.println("=======================================================");
				    System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question4();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
					System.out.println("You have earned: " + q.money + " points.");
					System.out.println("Thank you for playing!");
					System.out.println("=======================================================");
				    System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question5();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
				    System.out.println("You have earned: " + q.money + " points.");
					System.out.println("Thank you for playing!");
					System.out.println("=======================================================");
					System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question6();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
				    System.out.println("You have earned: " + q.money + " points.");
					System.out.println("Thank you for playing!");
					System.out.println("=======================================================");
					System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question7();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
					System.out.println("You have earned: " + q.money + " points.");
					System.out.println("Thank you for playing!");
					System.out.println("=======================================================");
					System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question8();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
					System.out.println("You have earned: " + q.money + " points.");
					System.out.println("Thank you for playing!");
					System.out.println("=======================================================");
					System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question9();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
					System.out.println("You have earned: " + q.money + " points.");
					System.out.println("Thank you for playing!");
					System.out.println("=======================================================");
					System.exit(0);
				}
				if(res==true) {
					System.out.println("Correct answer you have won :"+q.money);
					res = q.question10();
					rewards+=q.money;
				}
				else {
					System.out.println("=======================================================");
					System.out.println("You have earned: " + q.money + " points.");
					System.out.println("Thank you for playing!");
					System.out.println("=======================================================");
					System.exit(0);
				}
				if(res==true) {
					rewards+=q.money;
					System.out.println("Correct answer you have won :"+rewards);
					System.exit(0);
														
				}
				else {
					System.out.println("=======================================================");
				    System.out.println("You have earned: " + rewards+ " points.");
				    System.out.println("Thank you for playing!");
				    System.out.println("=======================================================");
				    System.exit(0);
					}
				
		
	}
}
