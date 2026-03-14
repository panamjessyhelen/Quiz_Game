package com.gqt.project1.quizgame;
import java.util.*;

public class QuizGame {
public static void main(String[] args) {
	System.out.println("\t \t HEARTY WELCOME!");
	
	Scanner sc=new Scanner(System.in);
	Solution so=new Solution();
	so.Details();
	System.out.println("=======================================================");
	so.Rules();
	System.out.println("=======================================================");
	so.Acceptance();
	System.out.println("=======================================================");
}
}
class Solution{
	int rewards = 0;
    boolean skipUsed = false;
    boolean fiftyUsed = false;
    String name, age;
    Scanner sc = new Scanner(System.in);
    List<Question> questions;

    Solution() {
        questions = QuestionBank.generateQuestions();
        Collections.shuffle(questions); // Shuffle to randomize
    }
	
	void Details() {
		System.out.println("Please enter your details...\n");
		System.out.println("Enter your name : ");
		name=sc.nextLine();
		System.out.println("Enter your age : ");
		age=sc.nextLine();
		System.out.println("Thank you for the details...");
	}
	
	void Rules() {
		System.out.println("=======================================================");
		System.out.println("\t \tIntroducing the rules:");
		System.out.println("1. Every question will have four options.");
		System.out.println("2. Each question will only one correct.");
		System.out.println("3. The game proceeds only when correct option is provided.");
		System.out.println("4. There are 2 Lifelines\t\ni)Skip question\t\nii)50-50\n");
		System.out.println("5. Each lifeline can be used only once in whichever question needed");
		System.out.println("6. For each correct answer, there is a reward");
	}
	
	void Acceptance() {
		System.out.println("ARE YOU OKAY WITH THE RULES (Yes/No) ? ");
		String response=sc.nextLine();
		if(response.equalsIgnoreCase("yes")) {
			startGame();
		}else {
			quitGame();
		}
	}
	
	 void startGame() {
	        for (int i = 0; i < 10; i++) {
	            if (i >= questions.size()) break;
	            Question q = questions.get(i);
	            System.out.println("=======================================================");
	            System.out.println("Q" + (i + 1) + ": " + q.question);
	            for (int j = 0; j < 4; j++) {
	                System.out.println((j + 1) + ". " + q.options[j]);
	            }

	            while (true) { 
	                System.out.print("Choose an option (or type 'skip' / '50-50' / 'quit'): ");
	                String userAnswer = sc.next();

	                if (userAnswer.equalsIgnoreCase("quit")) {
	                    quitGame();
	                    return;
	                } else if (userAnswer.equalsIgnoreCase("skip")) {
	                    if (!skipUsed) {
	                        skipUsed = true;
	                        System.out.println("You have used the 'Skip' lifeline!");
	                        break; 
	                    } else {
	                        System.out.println("No skips left. Answer the question.");
	                    }
	                } else if (userAnswer.equalsIgnoreCase("50-50")) {
	                    if (!fiftyUsed) {
	                        fiftyUsed = true;
	                        boolean result = fiftyFifty(q);
	                        if (result) {
	                            break; 
	                        } else {
	                            return; 
	                        }
	                    } else {
	                        System.out.println("No 50-50 left. Answer the question.");
	                    }
	                } else {
	                    try {
	                        int answer = Integer.parseInt(userAnswer);
	                        if (answer == q.correctOption) {
	                            rewards += q.rewardPoints;
	                            System.out.println("Correct! You earned " + q.rewardPoints + " points. Total: " + rewards);
	                            break; 
	                        } else {
	                            System.out.println("Wrong answer! Game over.");
	                            quitGame();
	                            return;
	                        }
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid input! Try again.");
	                    }
	                }
	            }
	        }
	        System.out.println("=======================================================");
	        System.out.println("Congratulations! You completed the game with a total reward of " + rewards + " points.");
	        System.out.println("Thank you for playing!");
	    }

	    boolean fiftyFifty(Question q) {
	        System.out.println("You are using the 50-50 lifeline.");
	       
	        String[] fiftyOptions = q.fiftyFiftyOptions.split(",");
	        int option1 = Integer.parseInt(fiftyOptions[0]);
	        int option2 = Integer.parseInt(fiftyOptions[1]);

	        System.out.println("The remaining options are:");
	        System.out.println(option1 + ") " + q.options[option1 - 1]);
	        System.out.println(option2 + ") " + q.options[option2 - 1]);

	        System.out.print("Please select your answer (1 or 2): ");
	        int userChoice = sc.nextInt();

	        if (userChoice == q.correctOption) {
	            System.out.println("Correct answer! You earned " + q.rewardPoints + " points.");
	            rewards += q.rewardPoints;
	            return true;
	        } else {
	            System.out.println("Wrong answer! Game over.");
	            quitGame();
	            return false;
	        }
	    }

	    void quitGame() {
	        System.out.println("=======================================================");
	        System.out.println("You have earned: " + rewards + " points.");
	        System.out.println("Thank you for playing!");
	        System.out.println("=======================================================");
	        System.exit(0);
	    }
	
}

class Question {
    String question;
    String[] options;
    int correctOption;
    int rewardPoints;
    String fiftyFiftyOptions;

    Question(String question, String[] options, int correctOption, int rewardPoints, String fiftyFiftyOptions) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
        this.rewardPoints = rewardPoints;
        this.fiftyFiftyOptions = fiftyFiftyOptions;
    }
}

class QuestionBank {
	
    static List<Question> generateQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the default value of an int in Java?", new String[]{"0", "1", "null", "undefined"}, 1, 10, "1,3"));
        questions.add(new Question("Which keyword is used to prevent method overriding?", new String[]{"static", "final", "abstract", "volatile"}, 2, 20, "2,4"));
        questions.add(new Question("Which collection in Java is synchronized?", new String[]{"ArrayList", "Vector", "HashSet", "TreeMap"}, 2, 30, "2,3"));
        questions.add(new Question("Which concept allows multiple methods with the same name but different parameters?", new String[]{"Encapsulation", "Method Overloading", "Method Overriding", "Abstraction"}, 2, 40, "2,4"));
        questions.add(new Question("Which operator is used for bitwise AND in Java?", new String[]{"&", "&&", "|", "||"}, 1, 10, "1,3"));
        questions.add(new Question("What is the parent class of all Java classes?", new String[]{"String", "Object", "Class", "Main"}, 2, 20, "2,3"));
        questions.add(new Question("Which package contains the Scanner class?", new String[]{"java.util", "java.io", "java.lang", "java.net"}, 1, 20, "1,2"));
        questions.add(new Question("Which method is called to start a thread?", new String[]{"start()", "run()", "execute()", "begin()"}, 1, 30, "1,2"));
        Collections.shuffle(questions);
        return questions;
    }   
}
