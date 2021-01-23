import java.util.*;

public class JanKenPo {

	public static void main(String[] args) {
		
		/*
		 * Rock Paper Scissors Program
		 * By Liam Van Asperen
		 * 
		 * 
		 * (How the game works)
		 * 
		 * User will choose a number corresponding to the weapon "Rock, Paper, or Scissors"
		 * 
		 * The Computer will also choose a weapon but randomly
		 * 
		 * The program will either if one user beat the other or if they get a tie.
		 * 
		 * In the while statement, if the user plays 10 rounds. It will ask the user if they want to quit.
		 * 
		 * If the user wants to quit then the program will get out of the loop, but if they want to keep going the count will
		 * be reset
		 * 
		 * At the end of it, they can choose weather they want to keep playing.
		 * 
		 * If the player gets 10 wins, they get a secret ending.... where they can play (ROCK PAPER SCISSORS SPOCK LIZARD)
		 * 
		 * Try it for yourself.
		 * 
		 */
		
		int replay = 0;
		int userWep, comWep; //Used to compare the users weapon to the computers
		int rounds = 0;
		int playerWins = 0;
		int playerTies = 0;
		int playerLose = 0;
		int totalRounds = 0;
		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		int choice = 0;
		
		
		//Introduction
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("The point of the game is to beat the computer at rock, paper, scissors");
		System.out.println("Let's get started!");
		
		/*
		//Asking user how long they would like to play
		System.out.println("How many rounds would you like to play?\n");
		rounds = userInput.nextInt();
		*/
		
		//
		
		//Start
		//If user wins 10 games against the program then they get to play a secret game
		for(replay=1; rounds<=10; rounds++) {
			
			//Computer chooses it weapon of choice
			comWep = rand.nextInt(3) + 1;
			
			//Counter for how many rounds have been played in total for the results screen.
			totalRounds++;
			
			System.out.println("Now choose your weapon of choice!\n");
			System.out.println("1 = Rock, 2 = Paper, 3 = Scissors\n");
			
			userWep = userInput.nextInt();
			
			//We will first start with the Rock arguments
			
			if (userWep == 1 && comWep == 1) { //If both users choose rock
				
				System.out.println("   _______\r\n"
						+ "---'   ____)\r\n"
						+ "      (_____)\r\n"
						+ "      (_____)\r\n"
						+ "      (____)\r\n"
						+ "---.__(___)\n");
				System.out.println("You and the computers rocks smash!");
				System.out.println("It looks like a tie!\n");
				System.out.println("Let's try that again!\n");
				playerTies++;
			
			}
			
			if (userWep == 1 && comWep == 3) { //If users chose rock & computer chose scissors
				
				System.out.println("   _______\r\n"
						+ "---'   ____)\r\n"
						+ "      (_____)\r\n"
						+ "      (_____)\r\n"
						+ "      (____)\r\n"
						+ "---.__(___)\n");
				System.out.println("You threw your rock! And the computers scissors fell apart!");
				System.out.println("You win!\n");
				System.out.println("Let's go again!\n");
				playerWins++;
			
			}
			
			if (userWep == 1 && comWep == 2) { //If user chose rock and computer chose paper
				
				System.out.println("   _______\r\n"
						+ "---'   ____)\r\n"
						+ "      (_____)\r\n"
						+ "      (_____)\r\n"
						+ "      (____)\r\n"
						+ "---.__(___)");
				System.out.println("Your rock put up a good fight, but it was swallowed whole by the computers paper!");
				System.out.println("Uh oh, looks like you lost.\n");
				System.out.println("You can do better than that.\n");
				playerLose++;
			
			}
			
			//Now the paper Arguments
			
			if (userWep == 2 && comWep == 2) { //If both users choose paper
				
				System.out.println("    _______\r\n"
						+ "---'    ____)____\r\n"
						+ "           ______)\r\n"
						+ "          _______)\r\n"
						+ "         _______)\r\n"
						+ "---.__________)\n");
				System.out.println("Both you and the computers paper crumple together! What!?");
				System.out.println("It looks like a tie!\n");
				System.out.println("Wow, didn't think that would happen. Let's go again!\n");
				playerTies++;
				
			}
			
			if (userWep == 2 && comWep == 1) { //If user chose paper and computer chose rock
				
				System.out.println("    _______\r\n"
						+ "---'    ____)____\r\n"
						+ "           ______)\r\n"
						+ "          _______)\r\n"
						+ "         _______)\r\n"
						+ "---.__________)\n");
				System.out.println("Your paper armata of paper fought valiantly and defeated the computers evil rock!");
				System.out.println("Good job, you won!\n");
				System.out.println("Try and defeat the computer again!\n");
				playerWins++;
				
			}

			if (userWep == 2 && comWep == 3) { //If user chose paper and computer chose scissors
	
				System.out.println("    _______\r\n"
						+ "---'    ____)____\r\n"
						+ "           ______)\r\n"
						+ "          _______)\r\n"
						+ "         _______)\r\n"
						+ "---.__________)\n");
				System.out.println("You chose paper, and the computers paper obliterated it in one slice");
				System.out.println("You lost the battle.....\n");
				System.out.println("Go again to defeat the evil computer!\n");
				playerLose++;
	
			}
			
			//Now the paper Scissor arguments
			
			if (userWep == 3 && comWep == 3) { //If both users choose scissors
				
				System.out.println("\r\n"
						+ "   _       ,/'\r\n"
						+ "  (_).  ,/'\r\n"
						+ "   _  ::\r\n"
						+ "  (_)'  `\\.\r\n"
						+ "           `\\.\r\n"
						+ "\n");
				System.out.println("The scissors and the computers computers scissors sliced each other! What!?");
				System.out.println("It looks like a tie!\n");
				System.out.println("I'd say give it another try\n");
				playerTies++;
				
			}
			
			if (userWep == 3 && comWep == 2) { //If user chose scissors and computer chose paper
				
				System.out.println("  ,--.\r\n"
						+ " (    )____ ___________________________\r\n"
						+ "  `--'---,-'  ,.  T--------------------`-.\r\n"
						+ "  ,--.---`-.  `'  |_dd____________________`>\r\n"
						+ " (    )\"\"\"\" \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\r\n"
						+ "  `--'\n");
				System.out.println("Your scissors destroyed the computers paper in a pre-desintied battle!");
				System.out.println("You beat the computer! Amazing!\n");
				System.out.println("You can probably defeat that evil computer again, let's go again.\n");
				playerWins++;
				
			}

			if (userWep == 3 && comWep == 1) { //If user chose scissors and computer chose rock
				
				System.out.println("    _    _\r\n"
						+ "   (_)  / )\r\n"
						+ "     | (_/ \r\n"
						+ "    _+/  \r\n"
						+ "   //|\\\r\n"
						+ "  // | )\r\n"
						+ " (/  |/ \n");
				System.out.println("Your scissor was looking for a fair fight, but was ultimatly squashed by the computers rock....");
				System.out.println("You lost the fight.......\n");
				System.out.println("Let's give that another shot.\n");
				playerLose++;
				
			}
			
			//This is just to check if the player uses a number out of the range of 1,2 or 3
			
			if (userWep >= 4) {
				System.out.println("Oops, wrong number! Remeber! Try to choose either 1,2, or 3 for what weapon you'll use.");
			}
			
			if(rounds >= 10) {
				
				System.out.println("Hey, you've been playing for a bit. Would you like to stop now?");
				System.out.println("Type '0' to stop playing, or '1' to keep playing");
				replay = userInput.nextInt();
				
				if(replay == 1) {
					System.out.println("Awesome, lets keep going!");
					rounds = rounds - 10;
				}
				
				if(replay == 0) {
					System.out.println("See you next time!");
				}
					
			}
			
			
		}
		
		System.out.println("Thanks for playing!");
		System.out.println("Here's your results!\n");
		System.out.println("You played a total of " + totalRounds + " rounds!");
		System.out.println("You won " + playerWins + " times! You lost " + playerLose + " times.... And you tied " + playerTies + " times!\n");
		System.out.println("Come play again sometime!");
		
		//Secret Ending where they can play ROCK PAPER SCISSORS SPOCK LIZARD
		
		if (playerWins >= 10) {
			
		System.out.println("Hey! Hey you!");

			sleep(2000); //Makes program wait

		System.out.println("-'''''-._\r\n"
				+ "    .'  _     _  '.\r\n"
				+ "   /   (_)   (_)   \\\r\n"
				+ "  |  ,           ,  |\r\n"
				+ "  |  \\`.       .`/  |\r\n"
				+ "   \\  '.`'\"\"'\"`.'  /\r\n"
				+ "    '.  `'---'`  .'\r\n"
				+ "	     '-._____.-'");
		System.out.println("You seem pretty good at this game.");
		sleep(2000);
		System.out.println("Would you like to try a.... better game?\n\n");
		sleep(2000);
		System.out.println("1: Yeah, sure!\n"
				+ "2: Nah.\n"
				+ "3: Who are you?\n");
		
		choice = userInput.nextInt(); //User chooses weather to play the game or not.
		
				if (choice >= 2) { //Bad ending, you don't want to play the computers game
					
					System.out.println("Wrong Answer..........");
					
					for(int i=0; i<=11; i--){
						
						System.out.println("WRONG ANSWER\n");
						
			              System.out.println("__ooooooooo__\r\n"
			              		+ "              oOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "          oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "       oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "     oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "   oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "  oOOOOOOOOOOO*  *OOOOOOOOOOOOOO*  *OOOOOOOOOOOOo\r\n"
			              		+ " oOOOOOOOOOOO      OOOOOOOOOOOO      OOOOOOOOOOOOo\r\n"
			              		+ " oOOOOOOOOOOOOo  oOOOOOOOOOOOOOOo  oOOOOOOOOOOOOOo\r\n"
			              		+ "oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "oOOOO     OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO     OOOOo\r\n"
			              		+ "oOOOOOO OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO OOOOOOo\r\n"
			              		+ " *OOOOO  OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  OOOOO*\r\n"
			              		+ " *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\r\n"
			              		+ "  *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\r\n"
			              		+ "   *OOOOOOo  *OOOOOOOOOOOOOOOOOOOOOOO*  oOOOOOO*\r\n"
			              		+ "     *OOOOOOOo  *OOOOOOOOOOOOOOOOO*  oOOOOOOO*\r\n"
			              		+ "       *OOOOOOOOo  *OOOOOOOOOOO*  oOOOOOOOO*      \r\n"
			              		+ "          *OOOOOOOOo           oOOOOOOOO*      \r\n"
			              		+ "              *OOOOOOOOOOOOOOOOOOOOO*          \r\n"
			              		+ "                   \"\"ooooooooo\"\"");
			              
			              System.out.println("WRONG ANSWER\n");
			              
			              System.out.println("  oooo$$$$$$$$$$$$oooo\r\n"
			              		+ "                      oo$$$$$$$$$$$$$$$$$$$$$$$$o\r\n"
			              		+ "                   oo$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o         o$   $$ o$\r\n"
			              		+ "   o $ oo        o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o       $$ $$ $$o$\r\n"
			              		+ "oo $ $ \"$      o$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$o       $$$o$$o$\r\n"
			              		+ "\"$$$$$$o$     o$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$o    $$$$$$$$\r\n"
			              		+ "  $$$$$$$    $$$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$$$$$$$$$$$$$$\r\n"
			              		+ "  $$$$$$$$$$$$$$$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$$$$$$  \"\"\"$$$\r\n"
			              		+ "   \"$$$\"\"\"\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$\r\n"
			              		+ "    $$$   o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$o\r\n"
			              		+ "   o$$\"   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$       $$$o\r\n"
			              		+ "   $$$    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\" \"$$$$$$ooooo$$$$o\r\n"
			              		+ "  o$$$oooo$$$$$  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   o$$$$$$$$$$$$$$$$$\r\n"
			              		+ "  $$$$$$$$\"$$$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     $$$$\"\"\"\"\"\"\"\"\r\n"
			              		+ " \"\"\"\"       $$$$    \"$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"      o$$$\r\n"
			              		+ "            \"$$$o     \"\"\"$$$$$$$$$$$$$$$$$$\"$$\"         $$$\r\n"
			              		+ "              $$$o          \"$$\"\"$$$$$$\"\"\"\"           o$$$\r\n"
			              		+ "               $$$$o                 oo             o$$$\"\r\n"
			              		+ "                \"$$$$o      o$$$$$$o\"$$$$o        o$$$$\r\n"
			              		+ "                  \"$$$$$oo     \"\"$$$$o$$$$$o   o$$$$\"\"  \r\n"
			              		+ "                     \"\"$$$$$oooo  \"$$$o$$$$$$$$$\"\"\"\r\n"
			              		+ "                        \"\"$$$$$$$oo $$$$$$$$$$       \r\n"
			              		+ "                                \"\"\"\"$$$$$$$$$$$        \r\n"
			              		+ "                                    $$$$$$$$$$$$       \r\n"
			              		+ "                                     $$$$$$$$$$\"      \r\n"
			              		+ "                                      \"$$$\"\"\"\"");
			              
			              System.out.println("   ,,,                         MM .M\r\n"
			              		+ "                           ,!MMMMMMM!,                     MM MM  ,.\r\n"
			              		+ "   ., .M                .MMMMMMMMMMMMMMMM.,          'MM.  MM MM .M'\r\n"
			              		+ " . M: M;  M          .MMMMMMMMMMMMMMMMMMMMMM,          'MM,:M M'!M'\r\n"
			              		+ ";M MM M: .M        .MMMMMMMMMMMMMMMMMMMMMMMMMM,         'MM'...'M\r\n"
			              		+ " M;MM;M :MM      .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.       .MMMMMMMM\r\n"
			              		+ " 'M;M'M MM      MMMMMM  MMMMMMMMMMMMMMMMM  MMMMMM.    ,,M.M.'MMM'\r\n"
			              		+ "  MM'MMMM      MMMMMM @@ MMMMMMMMMMMMMMM @@ MMMMMMM.'M''MMMM;MM'\r\n"
			              		+ " MM., ,MM     MMMMMMMM  MMMMMMMMMMMMMMMMM  MMMMMMMMM      '.MMM\r\n"
			              		+ " 'MM;MMMMMMMM.MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.      'MMM\r\n"
			              		+ "  ''.'MMM'  .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM       MMMM\r\n"
			              		+ "   MMC      MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.      'MMMM\r\n"
			              		+ "  .MM      :MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM''MMM       MMMMM\r\n"
			              		+ "  MMM      :M  'MMMMMMMMMMMMM.MMMMM.MMMMMMMMMM'.MM  MM:M.    'MMMMM\r\n"
			              		+ " .MMM   ...:M: :M.'MMMMMMMMMMMMMMMMMMMMMMMMM'.M''   MM:MMMMMMMMMMMM'\r\n"
			              		+ "AMMM..MMMMM:M.    :M.'MMMMMMMMMMMMMMMMMMMM'.MM'     MM''''''''''''\r\n"
			              		+ "MMMMMMMMMMM:MM     'M'.M'MMMMMMMMMMMMMM'.MC'M'     .MM\r\n"
			              		+ " '''''''''':MM.       'MM!M.'M-M-M-M'M.'MM'        MMM\r\n"
			              		+ "            MMM.            'MMMM!MMMM'            .MM\r\n"
			              		+ "             MMM.             '''   ''            .MM'\r\n"
			              		+ "              MMM.                               MMM'\r\n"
			              		+ "               MMMM            ,.J.JJJJ.       .MMM'\r\n"
			              		+ "                MMMM.       'JJJJJJJ'JJJM   CMMMMM\r\n"
			              		+ "                  MMMMM.    'JJJJJJJJ'JJJ .MMMMM'\r\n"
			              		+ "                    MMMMMMMM.'  'JJJJJ'JJMMMMM'\r\n"
			              		+ "                      'MMMMMMMMM'JJJJJ JJJJJ'\r\n"
			              		+ "                         ''MMMMMMJJJJJJJJJJ'\r\n"
			              		+ "                                 'JJJJJJJJ'");
			              
			              System.out.println("WRONG ANSWER\n");
			              
			         }
					
					
				}
				
				//Good Ending
				if(choice <= 1) {
					
					System.out.println("_.-'''''-._\r\n"
							+ "    .'  _     _  '.\r\n"
							+ "   /   (o)   (o)   \\\r\n"
							+ "  |                 |\r\n"
							+ "  |  \\           /  |\r\n"
							+ "   \\  '.       .'  /\r\n"
							+ "    '.  `'---'`  .'\r\n"
							+ "      '-._____.-'");
					System.out.println("I'll just say you do want to play then.");
					sleep(3000);
					System.out.println("The game is simple. It's just like rock paper scissors.");
					System.out.println("But this time its");
					sleep(3000);
					System.out.println("_.-'''''-._\r\n"
							+ "    .'  _     _  '.\r\n"
							+ "   /   (_)   (_)   \\\r\n"
							+ "  |  ,           ,  |\r\n"
							+ "  |  \\`.       .`/  |\r\n"
							+ "   \\  '.`'\"\"'\"`.'  /\r\n"
							+ "    '.  `'---'`  .'\r\n"
							+ "      '-._____.-'");
					System.out.println("ROCK PAPER SCISSORS SPOCK LIZARD");
					sleep(3000);
					System.out.println(" .-\"\"\"\"\"\"-.\r\n"
							+ "   .'          '.\r\n"
							+ "  /   O      O   \\\r\n"
							+ " :           `    :\r\n"
							+ " |                |   \r\n"
							+ " :    .------.    :\r\n"
							+ "  \\  '        '  /\r\n"
							+ "   '.          .'\r\n"
							+ "     '-......-'");
					System.out.println("Come on it's cool......");
					sleep(1000);
					System.out.print(".");
					sleep(2000);
					System.out.print(".");
					sleep(1000);
					System.out.print(".");
					System.out.println("     .-\"\"\"\"\"\"-.\r\n"
							+ "   .'          '.\r\n"
							+ "  /   O    -=-   \\\r\n"
							+ " :                :\r\n"
							+ " |                |  \r\n"
							+ " : ',          ,' :\r\n"
							+ "  \\  '-......-'  /\r\n"
							+ "   '.          .'\r\n"
							+ "     '-......-'");
					
					/*
					 * We are now in ROCK PAPER SCISSORS SPOCK LIZARD
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 * 
					 */
					
					int replayNew = 0;
					int userWepNew, comWepNew; //Used to compare the users weapon to the computers
					int roundsNew = 0;
					int playerWinsNew = 0;
					int playerTiesNew = 0;
					int playerLoseNew = 0;
					int totalRoundsNew = 0;
					
					for(replayNew=1; roundsNew<=10; roundsNew++) {
						
						//Computer chooses it weapon of choice
						comWepNew = rand.nextInt(5) + 1;
						
						//Counter for how many rounds have been played in total for the results screen.
						totalRoundsNew++;
						
						System.out.println("Now choose your weapon of choice! With new choices!\n");
						System.out.println("1 = Rock, 2 = Paper, 3 = Scissors, 4 = Lizard, 5 = Spock\n");
						
						userWepNew = userInput.nextInt();
						
						//We will first start with the Rock arguments
						
						if (userWepNew == 1 && comWepNew == 1) { //If both users choose rock
							
							System.out.println("   _______\r\n"
									+ "---'   ____)\r\n"
									+ "      (_____)\r\n"
									+ "      (_____)\r\n"
									+ "      (____)\r\n"
									+ "---.__(___)\n");
							System.out.println("You and the computers rocks smash!");
							sleep(2000);
							System.out.println("It looks like a tie!\n");
							System.out.println("Let's try that again!\n");
							playerTiesNew++;
						
						}
						
						if (userWepNew == 1 && comWepNew == 2) { //If user chose rock and computer chose paper
							
							System.out.println("   _______\r\n"
									+ "---'   ____)\r\n"
									+ "      (_____)\r\n"
									+ "      (_____)\r\n"
									+ "      (____)\r\n"
									+ "---.__(___)");
							System.out.println("Your rock put up a good fight, but it was swallowed whole by the computers paper!");
							sleep(2000);
							System.out.println("Uh oh, looks like you lost.\n");
							System.out.println("You can do better than that.\n");
							playerLoseNew++;
						
						}
						
						if (userWepNew == 1 && comWepNew == 3) { //If users chose rock & computer chose scissors
							
							System.out.println("   _______\r\n"
									+ "---'   ____)\r\n"
									+ "      (_____)\r\n"
									+ "      (_____)\r\n"
									+ "      (____)\r\n"
									+ "---.__(___)\n");
							System.out.println("You threw your rock! And the computers scissors fell apart!");
							System.out.println("You win!\n");
							sleep(2000);
							System.out.println("Let's go again!\n");
							playerWinsNew++;
						}
						
						if (userWepNew == 1 && comWepNew == 4) { //If users chose rock & computer chose Lizard
							
							System.out.println("   _______\r\n"
									+ "---'   ____)\r\n"
									+ "      (_____)\r\n"
									+ "      (_____)\r\n"
									+ "      (____)\r\n"
									+ "---.__(___)\n");
							System.out.println("A lizard approaches you!");
							sleep(2000);
							System.out.println("But your rock crushes the lizard before it can attack you!");
							System.out.println("You win!\n");
							sleep(2000);
							System.out.println("Let's go again!\n");
							playerWinsNew++;
						}

						if (userWepNew == 1 && comWepNew == 5) { //If users chose rock & computer chose spock
							
							System.out.println("   _______\r\n"
									+ "---'   ____)\r\n"
									+ "      (_____)\r\n"
									+ "      (_____)\r\n"
									+ "      (____)\r\n"
									+ "---.__(___)\n");
							System.out.println("You threw a spock?");
							sleep(2000);
							System.out.println("And the computers scissors fell apart?!");
							sleep(2000);
							System.out.println("You win!?\n");
							sleep(1000);
							System.out.print("?");
							sleep(1000);
							System.out.print("?");
							sleep(1000);
							System.out.print("?");
							sleep(2000);
							System.out.println("Ummmmm, Let's go again!\n");
							playerLoseNew++;
						}
						
						//Now the paper Arguments
						
						if (userWepNew == 2 && comWepNew == 2) { //If both users choose paper
							
							System.out.println("    _______\r\n"
									+ "---'    ____)____\r\n"
									+ "           ______)\r\n"
									+ "          _______)\r\n"
									+ "         _______)\r\n"
									+ "---.__________)\n");
							System.out.println("Both you and the computers paper crumple together! What!?");
							System.out.println("It looks like a tie!\n");
							System.out.println("Wow, didn't think that would happen. Let's go again!\n");
							playerTiesNew++;
							
						}
						
						if (userWepNew == 2 && comWepNew == 1) { //If user chose paper and computer chose rock
							
							System.out.println("    _______\r\n"
									+ "---'    ____)____\r\n"
									+ "           ______)\r\n"
									+ "          _______)\r\n"
									+ "         _______)\r\n"
									+ "---.__________)\n");
							System.out.println("Your paper armata of paper fought valiantly and defeated the computers evil rock!");
							System.out.println("Good job, you won!\n");
							System.out.println("Try and defeat the computer again!\n");
							playerWinsNew++;
							
						}

						if (userWepNew == 2 && comWepNew == 3) { //If user chose paper and computer chose scissors
				
							System.out.println("    _______\r\n"
									+ "---'    ____)____\r\n"
									+ "           ______)\r\n"
									+ "          _______)\r\n"
									+ "         _______)\r\n"
									+ "---.__________)\n");
							System.out.println("You chose paper, and the computers paper obliterated it in one slice");
							System.out.println("You lost the battle.....\n");
							System.out.println("Go again to defeat the evil computer!\n");
							playerLoseNew++;
				
						}
						
						if (userWepNew == 2 && comWepNew == 4) { //If user chose paper and computer chose Lizard
							
							System.out.println("    _______\r\n"
									+ "---'    ____)____\r\n"
									+ "           ______)\r\n"
									+ "          _______)\r\n"
									+ "         _______)\r\n"
									+ "---.__________)\n");
							System.out.println("You chose paper, and the computers lizard ate it.");
							sleep(2000);
							System.out.println("Is that even ethical?");
							sleep(2000);
							System.out.println("You lost the battle.....\n");
							System.out.println("Go again to defeat the evil computer!\n");
							playerLoseNew++;
				
						}
						
						if (userWepNew == 2 && comWepNew == 5) { //If user chose paper and computer chose Spock
							
							System.out.println("    _______\r\n"
									+ "---'    ____)____\r\n"
									+ "           ______)\r\n"
									+ "          _______)\r\n"
									+ "         _______)\r\n"
									+ "---.__________)\n");
							System.out.println("You chose paper, and the computers spock obliterated it in one slice");
							System.out.println("You lost the battle.....\n");
							System.out.println("Go again to defeat the evil computer!\n");
							playerLoseNew++;
				
						}
						
						//Now the paper Scissor arguments
						
						if (userWepNew == 3 && comWepNew == 3) { //If both users choose scissors
							
							System.out.println("\r\n"
									+ "   _       ,/'\r\n"
									+ "  (_).  ,/'\r\n"
									+ "   _  ::\r\n"
									+ "  (_)'  `\\.\r\n"
									+ "           `\\.\r\n"
									+ "\n");
							System.out.println("The scissors and the computers computers scissors sliced each other! What!?");
							sleep(3000);
							System.out.println("It looks like a tie!\n");
							System.out.println("I'd say give it another try\n");
							playerTiesNew++;
							
						}
						
						if (userWepNew == 3 && comWepNew == 2) { //If user chose scissors and computer chose paper
							
							System.out.println("  ,--.\r\n"
									+ " (    )____ ___________________________\r\n"
									+ "  `--'---,-'  ,.  T--------------------`-.\r\n"
									+ "  ,--.---`-.  `'  |_dd____________________`>\r\n"
									+ " (    )\"\"\"\" \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\r\n"
									+ "  `--'\n");
							System.out.println("Your scissors destroyed the computers paper in a pre-desintied battle!");
							System.out.println("You beat the computer! Amazing!\n");
							System.out.println("You can probably defeat that evil computer again, let's go again.\n");
							playerWinsNew++;
							
						}

						if (userWepNew == 3 && comWepNew == 1) { //If user chose scissors and computer chose rock
							
							System.out.println("    _    _\r\n"
									+ "   (_)  / )\r\n"
									+ "     | (_/ \r\n"
									+ "    _+/  \r\n"
									+ "   //|\\\r\n"
									+ "  // | )\r\n"
									+ " (/  |/ \n");
							System.out.println("Your scissor was looking for a fair fight, but was ultimatly squashed by the computers rock....");
							sleep(2000);
							System.out.println("You lost the fight.......\n");
							System.out.println("Let's give that another shot.\n");
							playerLoseNew++;
							
						}
						
						if (userWepNew == 3 && comWepNew == 4) { //If user chose scissors and computer chose Lizard
							
							System.out.println("             ____...---...___\r\n"
									+ "___.....---\"\"\"        .       \"\"--..____\r\n"
									+ "     .                  .            .\r\n"
									+ " .             _.--._       /|\r\n"
									+ "        .    .'()..()`.    / /\r\n"
									+ "            ( `-.__.-' )  ( (    .\r\n"
									+ "   .         \\        /    \\ \\\r\n"
									+ "       .      \\      /      ) )        .\r\n"
									+ "            .' -.__.- `.-.-'_.'\r\n"
									+ " .        .'  /-____-\\  `.-'       .\r\n"
									+ "          \\  /-.____.-\\  /-.\r\n"
									+ "           \\ \\`-.__.-'/ /\\|\\|           .\r\n"
									+ "          .'  `.    .'  `.\r\n"
									+ "          |/\\/\\|    |/\\/\\|");
							System.out.println("Your scissor was looking for a fight, you encountered the computers evil lizard dragon!");
							sleep(4000);
							System.out.println("You won that fight!\n");
							System.out.println("Let's give that another shot.\n");
							playerWinsNew++;
							
						}

						if (userWepNew == 3 && comWepNew == 5) { //If user chose scissors and computer chose Spock
							
							System.out.println("    _    _\r\n"
									+ "   (_)  / )\r\n"
									+ "     | (_/ \r\n"
									+ "    _+/  \r\n"
									+ "   //|\\\r\n"
									+ "  // | )\r\n"
									+ " (/  |/ \n");
							System.out.println("Your scissor was looking for another fight!");
							sleep(2000);
							System.out.println("     _.-^^---....,,--       \r\n"
									+ " _--                  --_  \r\n"
									+ "<                        >)\r\n"
									+ "|                         | \r\n"
									+ " \\._                   _./  \r\n"
									+ "    ```--. . , ; .--'''       \r\n"
									+ "          | |   |             \r\n"
									+ "       .-=||  | |=-.   \r\n"
									+ "       `-=#$%&%$#=-'   \r\n"
									+ "          | ;  :|     \r\n"
									+ " _____.,-#%&$@%#&#~,._____\r\n"
									+ "");
							System.out.println("but spock telepathically blew up your scissors!");
							sleep(1000);
							System.out.println("You won the fight.......\n");
							sleep(2000);
							System.out.println("Let's give that another shot.\n");
							playerLoseNew++;
							
						}
						
						//Lizard Arguments
						
						
						if (userWepNew == 4 && comWepNew == 4) { //If both users choose Lizard
							
							System.out.println("                       )/_\r\n"
									+ "             _.--..---\"-,--c_\r\n"
									+ "        \\L..'           ._O__)_\r\n"
									+ ",-.     _.+  _  \\..--( /           a:f\r\n"
									+ "  `\\.-''__.-' \\ (     \\_      \r\n"
									+ "    `'''       `\\__   /\\\r\n"
									+ "                ')");
							System.out.println("You send out your lizard!");
							sleep(2000);
							System.out.println("But the computer also send out a lizard!");
							sleep(2000);
							System.out.println("It looks like a tie!\n");
							System.out.println("I'd say give it another try\n");
							playerTiesNew++;
							
						}
						
						if (userWepNew == 4 && comWepNew == 1) { //If user chose Lizard and computer chose Rock
							
							System.out.println("\r\n"
									+ "                                           ^      ^     ^\r\n"
									+ "                                           ) '.   ) '.  ) '.   ^\r\n"
									+ "                                     ^.   / _..;--\"\"\"\"\"---..;  ) '.\r\n"
									+ "                                )\\   ) ';-\"\"                 \"-\"\"--.._\r\n"
									+ "                            )\\_/..'-\"\"                                \".\r\n"
									+ "                   __...---\"\"\"                                     ()   \"\r\n"
									+ "        ___...---\"\"                                        .             )\r\n"
									+ " .--\"\"\"\"                      .     ,                       )       _..-\"\r\n"
									+ "(_______________________d\"\".  \"d   ,db_________..--\".      /___r\".\"\"______\r\n"
									+ "                        b,  \\  P  ,d'               L     (  d'  ;  AZC\r\n"
									+ "                         Y,  \\/   p'                 '.    'P\" ,P'\r\n"
									+ "                         .p      /                     b,      <_\r\n"
									+ "                       _-\"      <_                     \"b        '-_\r\n"
									+ "                    .-'   .       '-_                  d\"     _.._  )\r\n"
									+ "                  .\"  _.-\"d  d*-.._  )                d\" d\\   \\   \"\"\r\n"
									+ "                   \"-\"   P' d'     \"\"                d\" ,P P   b\r\n"
									+ "                        d' P\"                        ; d\"  'Y, 'b\r\n"
									+ "                       '_.\"                           \"     'b._'");
							System.out.println("You sent out your lizard!");
							System.out.println("But the computers rock squashed your lizard.....");
							sleep(2000);
							System.out.println("You can probably defeat that evil computer again, let's go again.\n");
							playerWinsNew++;
							
						}

						if (userWepNew == 4 && comWepNew == 2) { //If user chose Lizard and computer chose paper
							
							System.out.println("                       )/_\r\n"
									+ "             _.--..---\"-,--c_\r\n"
									+ "        \\L..'           ._O__)_\r\n"
									+ ",-.     _.+  _  \\..--( /           a:f\r\n"
									+ "  `\\.-''__.-' \\ (     \\_      \r\n"
									+ "    `'''       `\\__   /\\\r\n"
									+ "                ')");
							System.out.println("Your pokemon.... I mean Lizard! Was looking for food.");
							sleep(2000);
							System.out.println("Your lizard ate the computers paper!\n");
							System.out.println("You won the fight.......\n");
							sleep(2000);
							System.out.println("Let's give that another shot.\n");
							playerWinsNew++;
							
						}
						
						if (userWepNew == 4 && comWepNew == 3) { //If user chose Lizard and computer chose Scissors
							
							System.out.println("   _.-~~-.__\r\n"
									+ " _-~ _-=-_   ''-,,\r\n"
									+ "('___ ~~~   0     ~''-_,,,,,,,,,,,,,,,,\r\n"
									+ " \\~~~~~~--'                            '''''''--,,,,\r\n"
									+ "  ~`-,_      ()                                     '''',,,\r\n"
									+ "       '-,_      \\                           /             '', _~/|\r\n"
									+ "  ,.       \\||/~--\\ \\_________              / /______...---.  ;  /\r\n"
									+ "  \\ ~~~~~~~~~~~~~  \\ )~~------~`~~~~~~~~~~~( /----         /,'/ /\r\n"
									+ "   |   -           / /                      \\ \\           /;/  /\r\n"
									+ "  / -             / /                        / \\         /;/  / -.\r\n"
									+ " /         __.---/  \\__                     /, /|       |:|    \\  \\\r\n"
									+ "/_.~`-----~      \\.  \\ ~~~~~~~~~~~~~---~`---\\\\\\\\ \\---__ \\:\\    /  /\r\n"
									+ "                  `\\\\\\`                     ' \\\\' '    --\\'\\, /  /\r\n"
									+ "                                               '\\,        ~-_'''\"");
							System.out.println("Your scissor was looking for a fair fight, but was ultimatly chopped up by the computers scissors....");
							sleep(2000);
							System.out.println("You lost the fight.......\n");
							System.out.println("Let's give that another shot.\n");
							playerLoseNew++;
							
						}

						if (userWepNew == 4 && comWepNew == 5) { //If user chose Lizard and computer chose Spock
							
							System.out.println("                       )/_\r\n"
									+ "             _.--..---\"-,--c_\r\n"
									+ "        \\L..'           ._O__)_\r\n"
									+ ",-.     _.+  _  \\..--( /           a:f\r\n"
									+ "  `\\.-''__.-' \\ (     \\_      \r\n"
									+ "    `'''       `\\__   /\\\r\n"
									+ "                ')");
							System.out.println("By the power of spock, the lizard fainted....");
							sleep(2000);
							System.out.println("You lost the fight.......\n");
							System.out.println("Let's give that another shot.\n");
							playerLoseNew++;
							
						}
						
							//Spock Arguments
						
						
						if (userWepNew == 5 && comWepNew == 5) { //If both users choose Spock
							
							System.out.println("                     .......................... \r\n"
									+ "                 ................................... \r\n"
									+ "              ......................................... \r\n"
									+ "            ............................................. \r\n"
									+ "           ................................................ \r\n"
									+ "          .................................................. \r\n"
									+ "         .................................................... \r\n"
									+ "         ......;%;%%%%%%%%%%%%%%%%%%%%%%%%%%%;%%.............. \r\n"
									+ "         .....;%%%;;;;%%%%%%%%%%%%%%%%%%;;;;%%%%..............% \r\n"
									+ "         .....%%%%%%%%;;;%%%%%%%%%%%%;;;%%%%%%%%%............%%% \r\n"
									+ "         /....%%%%%%%%%%%%;%%%%%%%%;%%%%%%%%%%%%%%..........;%%% \r\n"
									+ "         //...%%%a@@`  '@%%//%%%%%%%%@`  '@@a%%%%%%........;%/%% \r\n"
									+ "         //...%@@@@@aaa@@@%//%%%%%%@@@@aaa@@@@@%%%%%......%%/%% \r\n"
									+ "         //...%%%%%%%%%%%%%//%%%%%%%%%%%%%%%%%%%%%%%%....%%/%%% \r\n"
									+ "          //..%%%%%%%%%%%%//%%%%%%%%%%%%%%%%%%%%%%%%%...%%/%%% \r\n"
									+ "           //.%%%%%%%%%%%%//%%%%%%%%%%%%%%%%%%%%%%%%%..%%/%%% \r\n"
									+ "            //%%%%%%%%%%%//%%%%%%%%%%%%%%%%%%%%%%%%%%..%/%%% \r\n"
									+ "             ;%%%%%%%%%%%//%%%%%%%%%;/%%%%%%%%%%%%%%%.%%% \r\n"
									+ "               %%%%%%%%%//%%%%%%%%%%%;/%%%%%%%%%%%%%%%% \r\n"
									+ "                %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%/ \r\n"
									+ "                 ;%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%// \r\n"
									+ "                   %%%%%<<<<<<<<<<<<<<<<<%%%%%%%%%%;// \r\n"
									+ "                    %%%%%<<<<<<<<<<<<<<<%%%%%%%%%%;/// \r\n"
									+ "                     %%%%%%%%%%%%%%%%%%%%%%%%%%%;///// \r\n"
									+ "                      %%%%%%%%%%%%%%%%%%%%%%%%;///////. \r\n"
									+ "                      /;%%%%%%%%%%%%%%%%%%%;////////.... \r\n"
									+ "                      ///;%%%%%%%%%%%%%%;////////......... \r\n"
									+ "                    ...///////////////////////.............. \r\n"
									+ "                  ........////////////////................,;;, \r\n"
									+ "               ,;............/////////.................,;;;;;;;;, \r\n"
									+ "           ,;;;;;;,................................,;;;;;;;;;;;;;;, \r\n"
									+ "       ,;;;;;;;;;;;;;,........................,;;;;;;;;;;;;;;;;;;;; \r\n"
									+ "   ,;;;;;;;;;;;;;;;;;;;;;,................,;;;;;;;;;;;;;;;;;;;;;;;; \r\n"
									+ " ,;;;;;;;;;;;;;;;;;;;;;;;;;;,.........,;;;;;;;;;;;;;;;;;;;;;;;;;;;; \r\n"
									+ ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;/#\\;;;;;;;;;;; \r\n"
									+ ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;/####\\;;;;;;;;; \r\n"
									+ ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;/#######\\;;;;;;;");
							System.out.println("Wait theirs two spocks?! What!?");
							sleep(2000);
							System.out.println("It looks like a tie!\n");
							System.out.println("I'd say give it another try\n");
							playerTiesNew++;
							
						}
						
						if (userWepNew == 5 && comWepNew == 1) { //If user chose Spock and computer chose Rock
							
							System.out.println(" .8888888.   \r\n"
									+ "  8r  '8'  8e  \r\n"
									+ "  P '-. .-' 9  \r\n"
									+ "  |  O   O  |  \r\n"
									+ "\\-T\\       /7-/\r\n"
									+ " \\|  .\\_/.  |/ \r\n"
									+ "  | |__~__| |  \r\n"
									+ "  | |\\___/| |  \r\n"
									+ "   \\__   __/   \r\n"
									+ "      \\_/      \r\n"
									+ "_____/   \\_VJ__\r\n"
									+ "               ");
							System.out.println("You think your puny rocks can beat me?");
							sleep(2000);
							System.out.println("You beat the computer! Amazing!\n");
							System.out.println("You can probably defeat that evil computer again, let's go again.\n");
							playerWinsNew++;
							
						}

						if (userWepNew == 5 && comWepNew == 2) { //If user chose Spock and computer chose Paper
							
							System.out.println("                                        _\r\n"
									+ " _______________________   ________.--'-`--._____\r\n"
									+ "|____==================_)  \\_'===================`\r\n"
									+ "       _,--___.-|__|-.______|=====/  `---'\r\n"
									+ "       `---------._          ~~~~~|\r\n"
									+ "                   `-._ -  -  - ,'\r\n"
									+ "                       \\_____,-'\n");
							System.out.println("Spock some how lost a fight to a paper cut from the computer?");
							sleep(2000);
							System.out.println("You lost the fight.......\n");
							System.out.println("Let's give that another shot.\n");
							playerLoseNew++;
							
						}
						
						if (userWepNew == 5 && comWepNew == 3) { //If user chose Spock and computer chose Scissors
							
							System.out.println("__________________           __\r\n"
									+ "\\_________________|)____.---'--`---.____\r\n"
									+ "              ||    \\----.________.----/\r\n"
									+ "              ||     / /    `--'\r\n"
									+ "            __||____/ /_\r\n"
									+ "           |___         \\\r\n"
									+ "               `--------'\n");
							System.out.println("Spock destroied the computers scissors!");
							sleep(2000);
							System.out.println("You lost the fight.......\n");
							System.out.println("Let's give that another shot.\n");
							playerLoseNew++;
							
						}

						if (userWepNew == 5 && comWepNew == 4) { //If user chose Spock and computer chose lizard
							
							System.out.println("   ___-___  o==o======   .   .   .   .   .\r\n"
									+ "=========== ||//\r\n"
									+ "        \\ \\ |//__\r\n"
									+ "        #_______/\n");
							System.out.println("Spock had to fight a giant space lizard from the computer!");
							sleep(2000);
							System.out.println("You lost the fight.......\n");
							System.out.println("Let's give that another shot.\n");
							playerLoseNew++;
							
						}
						
						//This is just to check if the player uses a number out of the range of 1,2 or 3
						
						if (userWepNew >= 6) {
							System.out.println("Oops, wrong number! Remeber! Try to choose either 1,2, or 3 for what weapon you'll use.");
						}
						
						if(roundsNew >= 10) {
							
							System.out.println("Hey, you've been playing for a bit. Would you like to stop now?");
							System.out.println("Type '0' to stop playing, or '1' to keep playing");
							replayNew = userInput.nextInt();
							
							if(replayNew == 1) {
								System.out.println("Awesome, lets keep going!");
								rounds = rounds - 10;
							}
							
							if(replayNew == 0) {
								System.out.println("See you next time!");
							}
								
						}
						
						
					}
					
					System.out.println("Thanks for playing!");
					System.out.println("Here's your results!\n");
					System.out.println("You played a total of " + totalRoundsNew + " rounds!");
					System.out.println("You won " + playerWinsNew + " times! You lost " + playerLoseNew + " times.... And you tied " + playerTiesNew + " times!\n");
					System.out.println("Come play again sometime!");
					sleep(2000);
					System.out.println("Forever");
					sleep(2000);
					System.out.println("Forever and ever");
					sleep(2000);
					System.out.println("     .-\"\"\"\"\"\"-.\r\n"
							+ "   .'          '.\r\n"
							+ "  /   O    -=-   \\\r\n"
							+ " :                :\r\n"
							+ " |                |  \r\n"
							+ " : ',          ,' :\r\n"
							+ "  \\  '-......-'  /\r\n"
							+ "   '.          .'\r\n"
							+ "     '-......-'");
					sleep(2000);
					
					for(int i=0; i<=11; i--){
						
			              System.out.println("__ooooooooo__\r\n"
			              		+ "              oOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "          oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "       oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "     oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "   oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "  oOOOOOOOOOOO*  *OOOOOOOOOOOOOO*  *OOOOOOOOOOOOo\r\n"
			              		+ " oOOOOOOOOOOO      OOOOOOOOOOOO      OOOOOOOOOOOOo\r\n"
			              		+ " oOOOOOOOOOOOOo  oOOOOOOOOOOOOOOo  oOOOOOOOOOOOOOo\r\n"
			              		+ "oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\r\n"
			              		+ "oOOOO     OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO     OOOOo\r\n"
			              		+ "oOOOOOO OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO OOOOOOo\r\n"
			              		+ " *OOOOO  OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  OOOOO*\r\n"
			              		+ " *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\r\n"
			              		+ "  *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\r\n"
			              		+ "   *OOOOOOo  *OOOOOOOOOOOOOOOOOOOOOOO*  oOOOOOO*\r\n"
			              		+ "     *OOOOOOOo  *OOOOOOOOOOOOOOOOO*  oOOOOOOO*\r\n"
			              		+ "       *OOOOOOOOo  *OOOOOOOOOOO*  oOOOOOOOO*      \r\n"
			              		+ "          *OOOOOOOOo           oOOOOOOOO*      \r\n"
			              		+ "              *OOOOOOOOOOOOOOOOOOOOO*          \r\n"
			              		+ "                   \"\"ooooooooo\"\"");
			              
			              
			              System.out.println("  oooo$$$$$$$$$$$$oooo\r\n"
			              		+ "                      oo$$$$$$$$$$$$$$$$$$$$$$$$o\r\n"
			              		+ "                   oo$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o         o$   $$ o$\r\n"
			              		+ "   o $ oo        o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o       $$ $$ $$o$\r\n"
			              		+ "oo $ $ \"$      o$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$o       $$$o$$o$\r\n"
			              		+ "\"$$$$$$o$     o$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$o    $$$$$$$$\r\n"
			              		+ "  $$$$$$$    $$$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$$$$$$$$$$$$$$\r\n"
			              		+ "  $$$$$$$$$$$$$$$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$$$$$$  \"\"\"$$$\r\n"
			              		+ "   \"$$$\"\"\"\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$\r\n"
			              		+ "    $$$   o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$o\r\n"
			              		+ "   o$$\"   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$       $$$o\r\n"
			              		+ "   $$$    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\" \"$$$$$$ooooo$$$$o\r\n"
			              		+ "  o$$$oooo$$$$$  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   o$$$$$$$$$$$$$$$$$\r\n"
			              		+ "  $$$$$$$$\"$$$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     $$$$\"\"\"\"\"\"\"\"\r\n"
			              		+ " \"\"\"\"       $$$$    \"$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"      o$$$\r\n"
			              		+ "            \"$$$o     \"\"\"$$$$$$$$$$$$$$$$$$\"$$\"         $$$\r\n"
			              		+ "              $$$o          \"$$\"\"$$$$$$\"\"\"\"           o$$$\r\n"
			              		+ "               $$$$o                 oo             o$$$\"\r\n"
			              		+ "                \"$$$$o      o$$$$$$o\"$$$$o        o$$$$\r\n"
			              		+ "                  \"$$$$$oo     \"\"$$$$o$$$$$o   o$$$$\"\"  \r\n"
			              		+ "                     \"\"$$$$$oooo  \"$$$o$$$$$$$$$\"\"\"\r\n"
			              		+ "                        \"\"$$$$$$$oo $$$$$$$$$$       \r\n"
			              		+ "                                \"\"\"\"$$$$$$$$$$$        \r\n"
			              		+ "                                    $$$$$$$$$$$$       \r\n"
			              		+ "                                     $$$$$$$$$$\"      \r\n"
			              		+ "                                      \"$$$\"\"\"\"");
			              
			              System.out.println("   ,,,                         MM .M\r\n"
			              		+ "                           ,!MMMMMMM!,                     MM MM  ,.\r\n"
			              		+ "   ., .M                .MMMMMMMMMMMMMMMM.,          'MM.  MM MM .M'\r\n"
			              		+ " . M: M;  M          .MMMMMMMMMMMMMMMMMMMMMM,          'MM,:M M'!M'\r\n"
			              		+ ";M MM M: .M        .MMMMMMMMMMMMMMMMMMMMMMMMMM,         'MM'...'M\r\n"
			              		+ " M;MM;M :MM      .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.       .MMMMMMMM\r\n"
			              		+ " 'M;M'M MM      MMMMMM  MMMMMMMMMMMMMMMMM  MMMMMM.    ,,M.M.'MMM'\r\n"
			              		+ "  MM'MMMM      MMMMMM @@ MMMMMMMMMMMMMMM @@ MMMMMMM.'M''MMMM;MM'\r\n"
			              		+ " MM., ,MM     MMMMMMMM  MMMMMMMMMMMMMMMMM  MMMMMMMMM      '.MMM\r\n"
			              		+ " 'MM;MMMMMMMM.MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.      'MMM\r\n"
			              		+ "  ''.'MMM'  .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM       MMMM\r\n"
			              		+ "   MMC      MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.      'MMMM\r\n"
			              		+ "  .MM      :MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM''MMM       MMMMM\r\n"
			              		+ "  MMM      :M  'MMMMMMMMMMMMM.MMMMM.MMMMMMMMMM'.MM  MM:M.    'MMMMM\r\n"
			              		+ " .MMM   ...:M: :M.'MMMMMMMMMMMMMMMMMMMMMMMMM'.M''   MM:MMMMMMMMMMMM'\r\n"
			              		+ "AMMM..MMMMM:M.    :M.'MMMMMMMMMMMMMMMMMMMM'.MM'     MM''''''''''''\r\n"
			              		+ "MMMMMMMMMMM:MM     'M'.M'MMMMMMMMMMMMMM'.MC'M'     .MM\r\n"
			              		+ " '''''''''':MM.       'MM!M.'M-M-M-M'M.'MM'        MMM\r\n"
			              		+ "            MMM.            'MMMM!MMMM'            .MM\r\n"
			              		+ "             MMM.             '''   ''            .MM'\r\n"
			              		+ "              MMM.                               MMM'\r\n"
			              		+ "               MMMM            ,.J.JJJJ.       .MMM'\r\n"
			              		+ "                MMMM.       'JJJJJJJ'JJJM   CMMMMM\r\n"
			              		+ "                  MMMMM.    'JJJJJJJJ'JJJ .MMMMM'\r\n"
			              		+ "                    MMMMMMMM.'  'JJJJJ'JJMMMMM'\r\n"
			              		+ "                      'MMMMMMMMM'JJJJJ JJJJJ'\r\n"
			              		+ "                         ''MMMMMMJJJJJJJJJJ'\r\n"
			              		+ "                                 'JJJJJJJJ'");
			              
			              
			         }
				}
				
		}
		
		
	}
	
	public static void sleep(int time) {
		
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
		
	}
	
}
