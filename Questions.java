package com.gqt.miniproject;

import java.util.Scanner;

public class Questions {
	static int life_line_count=3;
	static int aud_phn=1;
	static int ff=1;
	static int skip =1;
	static int money=0;
	public static Scanner sc = new Scanner(System.in);
	public boolean question1() {
		System.out.println("1. What is the default value of an int in Java?\n"
				+ "1) 0\", \"2) 1\", \"3) null\", \"4) undefined\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 1) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 1) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. 0	---> 40%\n"
						+ "2. 1	---> 10%\n"
						+ "3. null	---> 35%\n"
						+ "4. undefined	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1) 0\", \"2) 1\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question2() {
		System.out.println("2. Which keyword is used to prevent method overriding?\n"
				+ "1) static\", \"2) final\", \"3) abstract\", \"4) volatile\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 3) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 2 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. static	---> 30%\n"
						+ "2. final	---> 40%\n"
						+ "3. abstract	---> 15%\n"
						+ "4. volatile---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2) final\", \"3) abstract\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question3() {
		System.out.println("3. Which collection in Java is synchronized?\n"
				+ "1) ArrayList\", \"2) Vector\", \"3) HashSet\", \"4) TreeMap\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 2 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. ArrayList	---> 30%\n"
						+ "2. Vector	---> 40%\n"
						+ "3. HashSet	---> 15%\n"
						+ "4. TreeMap   ---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2) Vector\", \"3) HashSet\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question4() {
		System.out.println("4. Which concept allows multiple methods with the same name but different parameters?\n"
				+ "1) Encapsulation\", \"2) Method Overloading\", \"3) Method Overriding\", \"4) Abstraction\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 2 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. Encapsulation	---> 30%\n"
						+ "2. Method Overloading	---> 40%\n"
						+ "3. Method Overriding	---> 15%\n"
						+ "4. Abstraction---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2) Method Overloading\", \"3) Method Overriding\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question5() {
		System.out.println("5. Which operator is used for bitwise AND in Java?\n"
				+ "1) &\", \"2) &&\", \"3) |\", \"4) ||\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 1) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 1) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. &	---> 40%\n"
						+ "2. &&	---> 10%\n"
						+ "3. |	---> 35%\n"
						+ "4. ||	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1) &\", \"2) &&\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question6() {
		System.out.println("6. What is the parent class of all Java classes?\n"
				+ "1) String\", \"2) Object\", \"3) Class\", \"4) Main\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. String	---> 10%\n"
						+ "2. Object	---> 40%\n"
						+ "3. Class	---> 35%\n"
						+ "4. Main	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2) Object\", \"3) Class\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question7() {
		System.out.println("7. Which package contains the Scanner class?\n"
				+ "1) java.util\", \"2) java.io\", \"3) java.lang\", \"4) java.net\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 1) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 1) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. java.util	---> 40%\n"
						+ "2. java.io	---> 10%\n"
						+ "3. java.lang---> 35%\n"
						+ "4. java.net	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1) java.util\", \"2) java.io\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question8() {
		System.out.println("8. Which method is called to start a thread?\n"
				+ "1) start()\", \"2) run()\", \"3) execute()\", \"4) begin()\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 1) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 1) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. start()	---> 40%\n"
						+ "2. run()	---> 10%\n"
						+ "3. execute()	---> 35%\n"
						+ "4. begin()	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1) start()\", \"2) run()\n");
					choice = sc.nextInt();
					if(choice == 3) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question9() {
		System.out.println("9. What is the default value of a boolean variable in Java?\n"
				+ "1) true\", \"2) false\", \"3) null\", \"4) 0\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 2 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1.  true	---> 30%\n"
						+ "2. false	---> 40%\n"
						+ "3. null	---> 15%\n"
						+ "4. 0	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2) false\", \"3) null\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
	public boolean question10() {
		System.out.println("10. Who is known as the father of Java?\n"
				+ "1) Dennis Ritchie\", \"2) James Gosling\", \"3) Bjarne Stroustrup\", \"4) Guido van Rossum\", \"5) Select Lifeline");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_phn==1) {
					System.out.println("---> Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> Skip : "+skip);
				}
				else if(aud_phn==0 && ff==0 && skip==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						  "1. Dennis Ritchie ---> 30%\n"
						+ "2.James Gosling	---> 50%\n"
						+ "3.Bjarne Stroustrup	---> 10%\n"
						+ "4. Guido van Rossum	---> 10%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2.James Gosling\n"
						+ "4. Guido van Rossum\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip--;
					life_line_count--;
					return true;
				}
				
			}
		}
		return false;
	}
}

