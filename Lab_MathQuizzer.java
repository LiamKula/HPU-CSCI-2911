import java.util.*;

public class Lab_MathQuizzer {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		int inputNum1, inputNum2, sum, userAnswer, count = 1;
		String userName; 
		int userOperator;
		int quizQuestionsWrong = 0, quizQuestionsCorrect = 0;
		
		//Start program
		
		System.out.println("Welcome! This is Liam's Fun Math Quizzer.");
		System.out.println("To start what is your name? Type it in with your keyboard.");

		
		userName = userInput.next(); //Username input
		
		System.out.println("You're name is " + userName + ". That's a  great name!");
		System.out.println("Well, " + userName + ". What type of math would you like to do today?");
		System.out.println("Type 1 for Addition or Type 0 for subtraction.");
		
		userOperator = userInput.nextInt(); //User chooses if they want to use addition or subtraction
		
		if (userOperator == 1){
			
			System.out.println("Great! You have choosen addition+ for your quiz!");
			
			//Start of the quiz
			
			while (count <= 10) {
				
				//quiz start
				
				int rNumber1 = rand.nextInt(21); //Start new rand every time the while statement is run
				int rNumber2 = rand.nextInt(21); 
				
				sum = rNumber1 + rNumber2; //Sum is added
				
				System.out.println("You're question " + userName + " is "); //Computer asks question
				
				System.out.println(rNumber1 + " + " + rNumber2 + " ="); //Shows question
				
				userAnswer = userInput.nextInt(); //User input for the answer
				
				if (userAnswer == sum) {
					System.out.println("Correct Answer! Let's do another one!"); //if the answer is right then the quiz count goes up
					quizQuestionsCorrect++;
				}
				
				else {
					System.out.println("Oops, that was inncorrect. Try another."); //if the answer is wrong then the quiz count does not change
					quizQuestionsWrong++;
				}
				count++;
				
			} //This function is repeated until the user has gotten 10 questions correct
			
			
			System.out.println("Great job!" + userName + "You passed the Liam's Fun Math Quizzer!");
			System.out.println("You got " + quizQuestionsWrong + " wrong questions. And got " + quizQuestionsCorrect + " correct!" );
			
			if (quizQuestionsCorrect == 10) {
				
				System.out.println("You did an EXECELLENT JOB " + userName + "! Here have a Cake!");
				System.out.println(" $$  $$  $$\r\n"
						+ "    __||__||__||__\r\n"
						+ "   | * * * * * * *|\r\n"
						+ "   |* * * * * * * |\r\n"
						+ "MT | * * * * * * *|\r\n"
						+ "   |______________|");
		
				
			}
			
			if (quizQuestionsCorrect >= 8) {
				
				System.out.println("You did a great job " + userName + "! Here have a chocolate!");
				
				System.out.println("  ___  ___  ___  ___  ___.---------------.\r\n"
						+ ".'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\\r\n"
						+ "|\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\\r\n"
						+ " \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\\r\n"
						+ "  \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\\r\n"
						+ "   \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`\r\n"
						+ "    \\\\/   \\/   \\/   \\/   \\/ :               hh|\r\n"
						+ "     \\|______________________;________________|");
				
			}
			
			if (quizQuestionsCorrect >= 5) {
				
				System.out.println("You did good " + userName + "! Here have a sclice of pizza!");
				
				System.out.println("// \"\"--.._\r\n"
						+ "||  (_)  _ \"-._\r\n"
						+ "||    _ (_)    '-.\r\n"
						+ "||   (_)   __..-'\r\n"
						+ " \\\\__..--\"\"");
			}
			
			else {
				System.out.println("Sorry, but you failed the test " + userName + ". Try again for a higher score!");
		
			}
		}
		
		else if (userOperator == 0) {
			System.out.println("Great! You have choosen subtraction- for your quiz!");
			
			while (count <= 10) {
				
				//quiz start
				
				int rNumber1 = rand.nextInt(21); //Start new rand every time the while statement is run
				int rNumber2 = rand.nextInt(21); 
				
				sum = rNumber1 - rNumber2; //Sum is added
				
				System.out.println("You're question " + userName + " is "); //Computer asks question
				
				System.out.println(rNumber1 + " - " + rNumber2 + " ="); //Shows question
				
				userAnswer = userInput.nextInt(); //User input for the answer
				
				if (userAnswer == sum) {
					System.out.println("Correct Answer! Let's do another one!"); //if the answer is right then the quiz count goes up
					quizQuestionsCorrect++;
				}
				
				else {
					System.out.println("Oops, that was inncorrect. Try another."); //if the answer is wrong then the quiz count does not change
					quizQuestionsWrong++;
				}
				count++;
				
			} //This function is repeated until the user has gotten 10 questions correct
			
			
			System.out.println("Great job!" + userName + "You passed the Liam's Fun Math Quizzer!");
			System.out.println("You got " + quizQuestionsWrong + " wrong questions. And got " + quizQuestionsCorrect + " correct!" );
			
			if (quizQuestionsCorrect == 10) {
				
				System.out.println("You did an EXECELLENT JOB " + userName + "! Here have a Cake!");
				System.out.println(" $$  $$  $$\r\n"
						+ "    __||__||__||__\r\n"
						+ "   | * * * * * * *|\r\n"
						+ "   |* * * * * * * |\r\n"
						+ "MT | * * * * * * *|\r\n"
						+ "   |______________|");
		
				
			}
			
			if (quizQuestionsCorrect >= 8) {
				
				System.out.println("You did a great job " + userName + "! Here have a chocolate!");
				
				System.out.println("  ___  ___  ___  ___  ___.---------------.\r\n"
						+ ".'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\\r\n"
						+ "|\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\\r\n"
						+ " \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\\r\n"
						+ "  \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\\r\n"
						+ "   \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`\r\n"
						+ "    \\\\/   \\/   \\/   \\/   \\/ :               hh|\r\n"
						+ "     \\|______________________;________________|");
				
			}
			
			if (quizQuestionsCorrect >= 5) {
				
				System.out.println("You did good " + userName + "! Here have a sclice of pizza!");
				
				System.out.println("// \"\"--.._\r\n"
						+ "||  (_)  _ \"-._\r\n"
						+ "||    _ (_)    '-.\r\n"
						+ "||   (_)   __..-'\r\n"
						+ " \\\\__..--\"\"");
			}
			
			else {
				System.out.println("Sorry, but you failed the test " + userName + ". Try again for a higher score!");
			}
		}
		
	}
}
