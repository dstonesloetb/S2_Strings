package com.mycompany.stringexamples;

public class CharacterExamples {

    public static void main(String[] args) {
        //Declare and initialise a String object
        String msg = "Hello world!";
        System.out.println("String: "+msg);
        
        //Declare and initialise a character
        char myChar = 'z';
        System.out.println("Char: "+myChar);
        
        //Work with the methods in the
        //Character class
        System.out.println(Character.isLetter('g')); //true
        
        //Week 5 Class Test Example 1 
        char input = 'g';
        boolean result = Character.isLetter(input);
        System.out.println(result);
        
        /*
        Question 1: For the following code
        identify the value and data type of the result
        
        input = 'g';
        result = Character.isLetter(input);
                
        Value of result:  true
        Data type of result: boolean 
        
        */
        
        
        
        
        //Week 5 Class Test Example 2 
        //Checking if a character is a digit 0-9
        input = '6'; //char
        result = Character.isDigit(input);
        System.out.println(result);
        
        // Value of result: true
        // Data type of result: boolean 
        
        
        //Week 5 Class Test Example 3 
        //Checking if a character is a letter
        input = '8'; //char
        result = Character.isLetter(input);
        System.out.println(result);
        
        // Value of result: false
        // Data type of result: boolean 
        
        //Week 5 Class Test Example 4 
        //Checking if a character is whitespace
        input = '\t'; //char
        result = Character.isWhitespace(input);
        System.out.println(result);
        
        // Value of result: true
        // Data type of result: boolean 
        
        
        //Week 5 Class Test Example 5 
        //Checking if a character is lowercase
        input = 'H'; //char
        result = Character.isLowerCase(input);
        System.out.println(result);
        
        // Value of result: false
        // Data type of result: boolean 
        
        
        //Week 5 Class Test Example 6 
        //Convert to uppercase character 
        input = 'd'; //char
        char chResult = Character.toUpperCase(input);  //'D'
        System.out.println(result);
        
        // Value of result: 'D'
        // Data type of result: char  
        
        
        //Week 5 Class Test Example 7 
        //Convert a char to a String 
        input = 'S'; //char
        String strResult = Character.toString(input); //"S"
        System.out.println(result);
        
        // Value of result: "S"
        // Data type of result:  String 
        
               
        
    } //end main 
} //end class
