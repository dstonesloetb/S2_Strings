package com.mycompany.stringexamples;

public class StringMethodsExamples {

    public static void main(String[] args) {
        // Converting lower case characters 
        // to uppercase characters 
        char letter = 'a';
        //toUpperCase() in this example is a CLASS METHOD 
        //(A Function belonging to the Character class) 
        //so we have to preface the name of the
        //function with the name of the class Character 
        char result = Character.toUpperCase(letter); //'a'->'A'
        System.out.println("Uppercase char: "+result);
        
        String letter1 = "A";
        String lowerResult = letter1.toLowerCase();
        
        
        
        
        
        //Convert a String to uppercase 
        String txt = "Hello World";
        //toUpperCase() in this example is an
        //INSTANCE METHOD (applies to a String object as
        //opposed to the String class)  
        //so we have to preface the name 
        //of the function with the NAME OF THE STRING OBJECT
       String uprResult = txt.toUpperCase();
        System.out.println("Uppercase String: "+uprResult);
        
       // String uprResult = String.toUpperCase();      

       
       
       
       
       
       //Convert a string to lower case 
       //and store the result
       String inputStr = "HELLO WORLD!";
       String lowerStr = inputStr.toLowerCase();
       System.out.println("Lowercase: "+lowerStr);
       
       //Convert to lowercase and output direct
       //to the console - not storing result 
       //System.out.println(inputStr.toLowerCase());
        
       //Get the length of the String object
       String name = "Russell";
       //Index of the string goes from 0 to 6
       //Length of the string is 7
       int lenResult  = name.length();   //7
       lenResult--;  //decrement by 1    //6 
       
       System.out.println("Len-1: "+lenResult);
       
       
       //Length location problem
       
       String name2 = "Jordan";
       int location = name2.length() - 1; //6-1->5
       //charAt(5) is the 6th character
       //because the index for the string 
       //starts at zero   
       result = name2.charAt(location);
     
       System.out.println("Jordan result: "+result);
       
       //Result:       'n' 
       //Data type:   char 
       
       //indexOf()  Examples
       
       String str1 = "joe doe";
       String sub1 = "oe";
       String sub2 = " oe";

       //index of the first occurence
       //of the substring in the main string 
       int result1 = str1.indexOf(sub1); //1
       System.out.println("indexOf result 1: "+result1);
        
       //No match so indexOf() returns -1 
       int result2 = str1.indexOf(sub2);  //-1
       System.out.println("indexOf result 2: "+result2);  
       
       ///*****
       
      //** public int indexOf(String str, int fromIndex)
      //Find the first occurence of the specified characters
      //counting from the fromIndex i.e. not
      //starting from the start of the string object 
      
      String myStr = "Hello planet earth, you are a great planet.";
      
      System.out.println(myStr.indexOf("e"));  //1
      System.out.println(myStr.indexOf("e", 5));  //10
      System.out.println(myStr.indexOf("e", 15)); //26
      
     System.out.println(myStr.lastIndexOf("e"));
     
     // Substring examples
    String myStr2 = "Hello, World!";
    
    // Expected output:    "World!" 
    System.out.println(myStr2.substring(7));
    
    // Expected output:    "World" 
    System.out.println(myStr2.substring(7, 12));
     
    
    //Substring
    String name3 = "Freddie Mercury";
    String subName = "di";
    int spacePos = name3.indexOf(subName);
    String result3 = name3.substring(spacePos + 2); //startSubString

    System.out.println(result3);
     
     //Value of result3:          "e Mercury"
     //Data type of result 3:   String 
     
     //Substring example 2 
     
    String name4 = "Kylie Minogue";
    spacePos = name4.indexOf(" ");
    
    String result4 
            = name4.substring(spacePos-2, spacePos);

     //value of result4:        "ie" 
     //data type of result4:   String 
     
     
     //Contains method
     
    String origStr = "Portlaoise is a wonderful town";
    String searchTerm = " wonderful";
     
    boolean resultSearch = origStr.contains(searchTerm);
     
    System.out.println("Result for "+searchTerm+": "+resultSearch);
     
   // Value of resultSearch:    true
   // Data type:                boolean  
     
     
   //Trim method
   
   String withWhiteSpace = "   String with leading and trailing white space    ";
   
   System.out.println(withWhiteSpace);
   
   String newString = withWhiteSpace.trim();
   
   System.out.println(newString);
   
     
   //Split method
   //Returns an array of Strings 
   
   String msg =   "Hello World,and,Portlaoise";
   
   //Splitting the orig. string on the comma delimiter 
   String[] strList = msg.split(",");
   
   //Display the stored strings on seperate lines 
   //For each string in the stringList output that string 
   for (String str : strList)
   {
       System.out.println(str);
   }
   
   
   //equals method
   
   String string1 = "JAVA";
   String string2 = "java";
   
   boolean compareResult = string1.equals(string2);
   
   //FALSE 
   System.out.println("Equals Compare JAVA to java "+compareResult);
   
   boolean compareResult2 = 
           string1.equalsIgnoreCase(string2);
   
   //TRUE 
   System.out.println("Equals Compare JAVA to java "+compareResult2);
   
   //endsWith method
   
   String inputStr2 = "Programming is great";
   
   String searchValue = "great";
    
   boolean endsWithResult = inputStr2.endsWith(searchValue);
   
   //TRUE 
   System.out.println("Endswith: "+endsWithResult);  
   
   //Replace method
   //replace all occurences of the target character
   //with the new character 
   
   String stringToChange = "Programming is fab";
   char targetChar = 'g';
   char replaceChar = 'z';
   
   //Replace all occurences of the letter g with the letter z 
   String resultString = 
    stringToChange.replace(targetChar, replaceChar);
   
   //  Prozramminz is fab 
   System.out.println(resultString);
   
    } //end main 
    
} //end class 
