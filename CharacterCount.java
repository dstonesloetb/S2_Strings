// CharacterCount
// Read in a string from the user
// Read in character to count in the string
// Count occurances of the character in the string
// Display the number of occurances to the user 

import java.util.Scanner;


public class CharacterCount {
  
  public static void main(String[] args) {

    //Create an instance of the scanner class
    Scanner scanner = new Scanner(System.in);

    //Prompt user to enter the string to process 
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();

    //Prompt user to input character to count
    System.out.print("Enter the character to count: ");
    char targetChar = scanner.next().charAt(0);

    //call function to count occurences of the character in the string
    int count = countCharacterOccurrences(inputString, targetChar);


    
    //display result 
    System.out.println("The character '" + targetChar + "' appears " + count + " times.");

    //close scanner object 
    scanner.close();
  
} //end main 


// Method to count char occurences in input string 
private static int countCharacterOccurrences(String str, char targetChar) {

  //Assume no occurences at start of process
  int count = 0;

  //Check each character in the string one by one 
  for (char ch : str.toCharArray()) {

    //if current char is same as target character 
    //increment count 
    if (ch == targetChar) {
        count++;
    } //end if 
    
  } //end for 
  
    return count;  //return num of occurences 
} //end method


} //end class
