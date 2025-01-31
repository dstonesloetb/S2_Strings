package com.mycompany.stringexamples;

import java.util.Scanner;

public class VowelConsonantChecker {

   //Program: to read a character from 
   //the user and output if the character
   //is a vowel or a consonant
   //Name:
   //Student Number: 
   //Date: 15 Jan 2025
    
    public static void main(String[] args) {
        
        /*

        // Input a character from the user 
        
        //Create a scanner object
        Scanner scanner = 
                new Scanner(System.in);
        
        //Prompt the user for a single character
        System.out.print("Enter a character: ");
        char inputChar = 
                scanner.next().charAt(0);


        */
            
        //Declare and initialise a variable for the input
        char inputChar = 'H';
        
        
        //Check is the character a letter 
        if (Character.isLetter(inputChar)){
            //Check if the character is a vowel
                //output if the character is a vowel
            if (isVowel(inputChar)){
                System.out.println(inputChar+
                        " is a vowel");
            }
            //else 
            //output the character is a consonant
            else {
                System.out.println(inputChar+ " "
                        + "is a consonant.");
            }
        } //end if 
             
        //output if invalid input 
        else {
            System.out.println("Invalid input. "
                    + " Please enter a valid letter.");
        } //end else 
        
    } //end main method
    
    //Implement a method to check
    //if a character is a vowel 
    //return type: boolean 
    public static boolean isVowel(char ch) {
        //convert character to lowercase
        ch = Character.toLowerCase(ch);
        
        //check if character is a,e,i,o,u 
        //return result 
        return ch=='a'||ch=='e'||ch=='i'|| 
               ch=='o' || ch=='u';
                
    } //end isVowel method 
    
} //end class 
