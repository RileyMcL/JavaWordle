package wordle;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 


public class main {
	
	//compares the guess of the user to the answer 
	public static void compareGuess(char guess[], char answer[]) {
		
		
		for (int i = 0; i < guess.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (guess[i] == answer[j]) {
					int g = i +1;
					int z = j+1;
					System.out.println("correct " +g+ " " +z);
					if(g == z) {
						System.out.println("Exact");
					}
					
				}
			}
		}
		
		
		
	}
	//gets the guess of the user and makes sure its 5 letters long and a valid word in the list.
	public static char[] getGuess(ArrayList <String> word) {
		//getting the users guess
				int b = 0;
				String userGuess = null;
				char userAns[] = new char[5];
				Scanner kb = new Scanner(System.in);
				while( b == 0) {
				System.out.println("Please enter a 5 letter word.");
				userGuess = kb.next();
				boolean x = false;
				for(String matchingName : word) {
					if(matchingName.toLowerCase().contains(userGuess.toLowerCase()))
						x = true;
				}
				
				
				if(userGuess.length() == 5 && x == true) {
					b = 1;
				} else {
					System.out.println("Not Acceptable\n");
				}
				}
				
				for(int i = 0; i < userGuess.length(); i++) {
					 userAns[i] = userGuess.charAt(i);
				}
				
				return userAns;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//declare arrayList and global variables.
		
		
		ArrayList<String> words = new ArrayList<>();
		char secretWordAns[] = new char[5];
		char userAns[] = new char[5];
		board game = new board();
		
		int i, y, b = 0;
		String secretWord;
		String userGuess;
		Random r = new Random();
		//use scanner to get file with list of words
		File file = new File("C:\\Users\\cluer\\Desktop\\5l.txt");
		Scanner sc = new Scanner(file);
		
		
		//enter list of words into array
		while(sc.hasNextLine())
			words.add(sc.nextLine().trim());
		//generate random word from list
		y = r.nextInt(words.size());
		//get word and print
		secretWord = words.get(y);
		secretWord = secretWord.toLowerCase();
		
		for(i = 0; i < secretWord.length(); i++) {
			secretWordAns[i] = secretWord.charAt(i);
		}
		game.printboard();
		for(int i1 =0; i1< 5; i1++) {
		System.out.println(secretWordAns);
		
		
		userAns = getGuess(words);
		compareGuess(userAns, secretWordAns);
		
		game.placeGuess(i1, 0, userAns);
		game.printboard();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (i = 0; i < userAns.length; i++) {
//			for (int j = 0; j < secretWordAns.length; j++) {
//				if (userAns[i] == secretWordAns[j]) {
//					int g = i +1;
//					int z = j+1;
//					System.out.println("correct " +g+ " " +z);
//					if(g == z) {
//						System.out.println("Exact");
//					}
//					
//				}
//			}
//		}
		
		
		
		
		
		for( i = 0; i < userAns.length; i++) {
			System.out.print(userAns[i] + " ");
		}
		
	System.out.println();
		
	
		for( i = 0; i < secretWordAns.length; i++) {
			System.out.print(secretWordAns[i] + " ");
		}
		
		
		
		
		
		
		
			
//		for ( i = 0; i < words.size(); i++) {
//			x = words.get(i);
//			System.out.println(x + " ");
//			
//		}
			sc.close();
			
			
		}
	
	
	
	
	
	}

