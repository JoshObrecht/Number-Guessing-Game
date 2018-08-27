import java.util.Scanner;
public class NumberGuessingGame
	{
		static Scanner userInput= new Scanner(System.in);
		static Scanner userInput2= new Scanner(System.in);
		static int difficultyLevel;
		static int randomNumber;
		static int userDifficulty;
		static boolean playGame=true;
		static String playAgain;
		static int counter;

		public static void main(String[] args)
			{
				greetPlayer();
				while(playGame==true)
					{
						pickDifficulty();
						if((userDifficulty==2)||(userDifficulty==4))
							{
								runBasic();
							}
						else
							{
								runLives();
							}
					}
			}
		public static void greetPlayer()
		{
			System.out.println("Hey! What's your name?");
			String userName=userInput.nextLine();
			System.out.println("");
			System.out.println("Nice to meet you, "+userName+"! I want to play a game where you guess the number i'm thinking of. First of all, pick a difficulty.");
		}
		public static void pickDifficulty()
		{
			System.out.println("");
			System.out.println("1) Easy: I pick a number between 1 and 10 and you have 5 guesses.");
			System.out.println("2) Regular: I pick a number between 1 and 10 and you have 1 guess.");
			System.out.println("3) Hard: I pick a number between 1 and 50 and you have 3 guesses.");
			System.out.println("4) Impossible: I pick a number between 1 and 100 and you have one guess.");
			System.out.println("");
			System.out.println("Type the number that corresponds with the difficulty you desire.");
			
			userDifficulty = userInput.nextInt();
			if((userDifficulty==2)||(userDifficulty==1))
				{
				difficultyLevel=10;	
				}
			if(userDifficulty==3)
				{
				difficultyLevel=50;	
				}
			if(userDifficulty==4)
				{
				difficultyLevel=100;	
				}
			
			
			randomNumber= (int)(Math.random()*difficultyLevel)+1;
			playGame=true;
			
		}
		public static void runBasic()
		{
			
				System.out.println("Ok. I picked a number between 1 and "+difficultyLevel+", you have one guess.");

				int userGuess = userInput.nextInt();
				
				if(userGuess==randomNumber)
					{
						System.out.println("You got it! Would you like to play again? (type y/n for yes/no respectively)");
						playAgain= userInput2.nextLine();
						if((playAgain.equals("y"))||(playAgain.equals("Y")))
							{
								System.out.println("Ok!");
								
							}
						else
							{
								System.out.println("Thanks for playing!!");
								playGame=false;
				
							
							}
					}
					else if(userGuess>=randomNumber)
					{
						System.out.println("You were too high, the correct answer was "+randomNumber+". Would you like to play again? (type y/n for yes/no respectively)");
						playAgain= userInput2.nextLine();
						if((playAgain.equals("y"))||(playAgain.equals("Y")))
							{
								System.out.println("Ok!");
						

							}
						else
							{
								System.out.println("Thanks for playing!!");
								playGame=false;
								
								
							}
					}
					else
					{
						System.out.println("You were too low, the correct answer was "+randomNumber+". Would you like to play again? (type y/n for yes/no respectively)");
						playAgain= userInput2.nextLine();
						if((playAgain.equals("y"))||(playAgain.equals("Y")))
							{
								System.out.println("Ok!");

							}
						else
							{
								System.out.println("Thanks for playing!!");
								playGame=false;
							
							}
					
				
				}
			
		}
		public static void runLives()
			{
					if(userDifficulty==3)
						{
							counter=3;
						}
					else
						{
						counter=5;
						}
						System.out.println("Ok. I picked a number between 1 and "+difficultyLevel+", you have "+counter+" guesses.");
						
							do				
							{
						int userGuess = userInput.nextInt();
						if(userGuess==randomNumber)
						{
							System.out.println("You got it! You had "+(counter-1)+" guesses left. Would you like to play again? (type y/n for yes/no respectively)");
							playAgain= userInput2.nextLine();
							if((playAgain.equals("y"))||(playAgain.equals("Y")))
								{
									System.out.println("Ok!");
									break;
								}
							else
								{
									System.out.println("Thanks for playing!!");
									playGame=false;
									break;
								}
						}
						else if(userGuess>randomNumber)
						{
							System.out.println("Too high.");
						}
						else
						{
							System.out.println("Too low");	
						}
						counter= counter-1;
						if(counter==0)
							{
								System.out.println("The correct answer was "+randomNumber+". You're out of guesses, would you like to play again? (type y/n for yes/no respectively)");
								playAgain= userInput2.nextLine();
								if((playAgain.equals("y"))||(playAgain.equals("Y")))
									{
										System.out.println("Ok!");
										break;
									}
								else
									{
										System.out.println("Thanks for playing!!");
										playGame=false;
										break;
									}
								
							}
						System.out.println("You have "+counter+" guesses left.");
							}
						while(counter>=1);
			
							
					
			}
	}

//TESTING WHAOHAOHAOWHOAHDOHASODHAOWHDOASHDOAHOWDHOSHDOAHODHASOHDAOSHD
//testing again
//help me
