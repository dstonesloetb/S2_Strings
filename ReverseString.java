package com.mycompany.stringexamples;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        // Input string from user
        // Reverse String
        //Display result
        
        //Declare an instance of the Scanner class 
        Scanner inScan = new Scanner(System.in);
        
        //Prompt the user for the input string 
        System.out.print("Please enter a string: ");
        String originalStr = inScan.nextLine();
        
        //Store reversed String
        String reversedStr="";
        
        //Reverse the characters in the input
        //string one by one 
       
        /*
        for (int i=input.length()-1; i>=0; i--)
        {
            reversedStr += input.charAt(i);
        }
        */
        
        //Add the next character from the original string to start 
        //of the Reverse String 
        for (int i = 0; i < originalStr.length(); i++){
            reversedStr = originalStr.charAt(i) + reversedStr;
          
        }
           
        
        
        //Display result
        System.out.println("Original string is: "+originalStr);
        System.out.println("Reversed string is: "+reversedStr);
        
        
    } //end main
    
} //end class 
