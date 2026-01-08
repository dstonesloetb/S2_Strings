import java.util.Scanner;

public class CountOccurancesOfCharInString {

    public static void main(String[] args) {
        // Plan
        /*

        0.  Set the count to zero 
        1.  Read in string to process
        2.  Read in or store search char to process
        3.  For each character in the string
                If we find the search character 
                increment the count by 1
        4.  Display the number of occurances of the 
            search character in the string i.e. the result 
        
        */

        //Sample Test cases 
        //1. No occurrences of the character in the string 
        //2. 1 occurence of the char in the string 
        //3. Multiple occurences
        //4. Empty String
        //5. String with white space 
        //6. Digits ?? 
        //7. Other 
        //e.g. consider if we wish the program to be
        //     case sensitive or not
        
        
        //Display program heading
        System.out.println("String Search Program");
        System.out.println("---------------------");
        System.out.println("Counts the number of occurences of a "
                + "given character in the given string");
        System.out.println("");    
        
        
        // Set the count to zero
        int count = 0;
        
        // Read in string to process
        Scanner inScan = new Scanner(System.in);
        System.out.print("Please enter the string to search: ");
        String txt = inScan.nextLine();
        
        
        // Read in or store search char to process
        //char  searchChar = 'z';
        System.out.print("Please enter the search character:");
        char searchChar = inScan.next().charAt(0);
        
       //Process the string
       /*
       for (int i=0; i<txt.length(); i++)
       {
            if (searchChar == txt.charAt(i))
            {
                count++;
            } //end if 
       }
        
        */
        
        // For each character in the string object
        
        // For-each character c in the list of chars 
        // check if that character matches the search char
        // and if it does increment count by 1 
        for (char c: txt.toCharArray())
        {
            //If we find the search character 
            //if the search character matches
            //the current character in the string 
            //increment the count by 1
            if (searchChar == c)
            {
                count++;
            } //end if 
        } //end for
        
        //close scanner object 
        inScan.close();  
        
        
        // Display the number of occurances of the 
        //search character in the string i.e. the result 
        System.out.println("There were "+count+" occurrences of the "
                + "character "+searchChar+" in the string "+txt);

        
    } //end main 
    
} //end class
