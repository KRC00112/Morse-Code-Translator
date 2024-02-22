package morseCode;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		
		

		Scanner scanner=new Scanner(System.in);
		int choice;
		String yn = null;
		
		
		do {	
		System.out.println("Press 1 and 2 accordingly: ");
		System.out.println("1.Convert String to Morse Code. ");
		System.out.println("2.Convert Morse Code to String. ");
		System.out.print("Enter here: ");
		
		  try {
              choice = scanner.nextInt();
              scanner.nextLine(); 
              
              if (choice == 1) {
                  System.out.print("Enter string: ");
                  String text = scanner.nextLine();
                  System.out.println("You entered: " + text);
                  text = text.toLowerCase();
                  stringToMorse(text);
                  System.out.println("\n");
                  
              } else if (choice == 2) {
                  System.out.print("Enter morse: ");
                  String morse = scanner.nextLine();
                  System.out.println("You entered: " + morse);
                  String delimiter = " ";
                  String[] morseArray = morse.split(delimiter);
                  morseToString(morseArray);
                  System.out.println("\n");
                  
              } else {
                  System.out.println("Enter a valid number");
                  System.out.println();
                  
              }
          } catch (InputMismatchException e) {
        	  System.out.println();
              System.out.println("Please enter a valid input");
              scanner.nextLine(); 
              choice = 0; 
              
          }

		
		
		
		System.out.print("Try again ?(Y/n): ");
		yn=scanner.nextLine();
		System.out.println();

		}while(yn.equalsIgnoreCase("y"));
		
		if(yn.equalsIgnoreCase("n")) {
			System.out.println("You exit");
		}
		
		
		
		}
			
			
		static void stringToMorse(String text) {
				
				System.out.print("The morse code: ");
				for(int i=0;i<text.length();i++ ) {
				
				
					char letter=text.charAt(i);
				
					switch(letter) {
					
					case 'a' :{System.out.print(".- ");break;}
					case 'b' :{System.out.print("-... ");break;}
					case 'c' :{System.out.print("-.-. ");break;}
					case 'd' :{System.out.print("-.. ");break;}
					case 'e' :{System.out.print(". ");break;}
					case 'f' :{System.out.print("..-. ");break;}
					case 'g' :{System.out.print("--. ");break;}
					case 'h' :{System.out.print(".... ");break;}
					case 'i' :{System.out.print(".. ");break;}
					case 'j' :{System.out.print(".--- ");break;}
					case 'k' :{System.out.print("-.- ");break;}
					case 'l' :{System.out.print(".-.. ");break;}
					case 'm' :{System.out.print("-- ");break;}
					case 'n' :{System.out.print("-. ");break;}
					case 'o' :{System.out.print("--- ");break;}
					case 'p' :{System.out.print(".--. ");break;}
					case 'q' :{System.out.print("--.- ");break;}
					case 'r' :{System.out.print(".-. ");break;}
					case 's' :{System.out.print("... ");break;}
					case 't' :{System.out.print("- ");break;}
					case 'u' :{System.out.print("..- ");break;}
					case 'v' :{System.out.print("...- ");break;}
					case 'w' :{System.out.print(".-- ");break;}
					case 'x' :{System.out.print("-..- ");break;}
					case 'y' :{System.out.print("-.-- ");break;}
					case 'z' :{System.out.print("--.. ");break;}
					case '1' :{System.out.print(".---- ");break;}
					case '2' :{System.out.print("..--- ");break;}
					case '3' :{System.out.print("...-- ");break;}
					case '4' :{System.out.print("....- ");break;}
					case '5' :{System.out.print("..... ");break;}
					case '6' :{System.out.print("-.... ");break;}
					case '7' :{System.out.print("--... ");break;}
					case '8' :{System.out.print("---.. ");break;}
					case '9' :{System.out.print("----. ");break;}
					case '0' :{System.out.print("----- ");break;}
					case ' ' :{System.out.print(" ");break;}
				
			}
			

		}
	

		
		}
		
		static void morseToString(String[] morseArray) {
			
			
			
			
			
			
			System.out.print("The String: ");
			for(int i=0;i<morseArray.length;i++) {
				
				
				switch(morseArray[i]){
					case ".-"   :{System.out.print("A");break;}
					case "-..." :{System.out.print("B");break;}
					case "-.-." :{System.out.print("C");break;}
					case "-.."  :{System.out.print("D");break;}
					case "."    :{System.out.print("E");break;}
					case "..-." :{System.out.print("F");break;}
					case "--."  :{System.out.print("G");break;}
					case "...." :{System.out.print("H");break;}
					case ".."   :{System.out.print("I");break;}
					case ".---" :{System.out.print("J");break;}
					case "-.-"  :{System.out.print("K");break;}
					case ".-.." :{System.out.print("L");break;}
					case "--"   :{System.out.print("M");break;}
					case "-."   :{System.out.print("N");break;}
					case "---"  :{System.out.print("O");break;}
					case ".--." :{System.out.print("P");break;}
					case "--.-" :{System.out.print("Q");break;}
					case ".-."  :{System.out.print("R");break;}
					case "..."  :{System.out.print("S");break;}
					case "-"    :{System.out.print("T");break;}
					case "..-"  :{System.out.print("U");break;}
					case "...-" :{System.out.print("V");break;}
					case ".--"  :{System.out.print("W");break;}
					case "-..-" :{System.out.print("X");break;}
					case "-.--" :{System.out.print("Y");break;}
					case "--.." :{System.out.print("Z");break;}
					case ".----" :{System.out.print("1");break;}
					case "..---" :{System.out.print("2");break;}
					case "...--" :{System.out.print("3");break;}
					case "....-" :{System.out.print("4");break;}
					case "....." :{System.out.print("5");break;}
					case "-...." :{System.out.print("6");break;}
					case "--..." :{System.out.print("7");break;}
					case "---.." :{System.out.print("8");break;}
					case "----." :{System.out.print("9");break;}
					case "-----" :{System.out.print("0");break;}
					case ""     :{System.out.print(" ");break;}
					case " "     :{System.out.print(" ");break;}

				}

				
			
				
				
				
			}


	
	}

		
		

		
		
}
	
	