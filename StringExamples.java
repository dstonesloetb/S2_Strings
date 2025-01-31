package com.mycompany.stringexamples;

public class StringExamples {

    public static void main(String[] args) {
       //A string is a collection 
        //of characters
        char[] myChars = {'h','e','l','l','o'};
                        
        //Declare a string object 
        String myStr = "hello world!";
        
        //Not best practice
        //Create a String object
       // Scanner inScanner = new Scanner(System.in);
        
        String myStr2 = new String("Hello");
        
        //get the length of the string object
        int len = myStr.length();
        System.out.println(len);
        // System.out.println(myStr.length());
                    
        
        //Access the individual characters in
        //the string "hello world!"
                    
        // index system to access the individual
        // characters in the String object
        // index   0    1    2   3   4  5   6  7 .. 
        // myStr   h    e    l   l   o      w  o ..
               
        char first = 
                myStr.charAt(0);  //'h'
        System.out.println("First letter: "+first);
        
        
        char lastLetter = myStr.charAt(11);  //'!'
        System.out.println("Last Letter: "+lastLetter);
           
        
        char second = myStr.charAt(1); //'e'
        System.out.println("Second letter: "+second);
                 
        
        //get the length of the string object
        int length = myStr.length();
        //char last = myStr.charAt(length-1); 
        
        char last = myStr.charAt(myStr.length()-1);  //'!'
        System.out.println("Last letter: "+last);
        
        //Get the second last character in the string
        char secondLast = myStr.charAt(myStr.length()-2);  //'d'
        System.out.println("Second Last letter: "+secondLast);
        
        
        //Get the index value of the second
        //last character in the string
        int spacePos = myStr.length() - 2; //10 
         
        //Get the second last character
        secondLast = myStr.charAt(spacePos);
        System.out.println("Second Last: "+secondLast);
        
        
        
       
        System.out.println("\n\n");
        
        //Output all the characters in the
        //String one by one
        //Using a traditional for loop
        for (int i = 0; i < myStr.length(); i++) {
        //    char c = myStr.charAt(i); 
        //    System.out.println(c);
              System.out.println(myStr.charAt(i));
        }
        
        //Output all the characters in the
        //String one by one on the same line
        //with a tab seperating each character 
        //Using a traditional for loop
        for (int i = 0; i < myStr.length(); i++) {
            System.out.print(myStr.charAt(i)+"\t");
        }
               
                //Output characters in the string
        //using a for each loop (enhanced for loop)
        System.out.println("");
        
        //For each character c in the character
        //array (i.e. convert string object to
        // a character array) 
        //Output that character on the same line
        //with a tab seperator
        
        for (char c : myStr.toCharArray()) { 
            System.out.print(c+ "\t");
            //System.out.println(c);
        }
        
     
    } //end main
    
} //end class

