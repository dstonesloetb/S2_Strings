class Wk5CTEx1 {
  public static void main(String[] args) {

    //Week 5 Class Test Examples 1
    
    //1
    
    String name = "David Clifford";
    char result1 = name.charAt(name.length() - 2);
    result1 = Character.toUpperCase(result1);
    System.out.println(result1);
 

    //2
  
    String name2 = "Arthur Conan Doyle";
    int result2 = name2.length() + name2.indexOf(" ",7);
    System.out.println(result2);
 

    //3
 
    String myString1 = "SETU Carlow";
    String myString2 = "SETU Wexford";
    int result3 = myString1.compareTo(myString2);
    System.out.println(result3);

    //https://simple.m.wikipedia.org/wiki/File:ASCII-Table.svg
    //https://www.educative.io/answers/how-to-compare-strings-using-the-compareto-method-in-java


    //4
    String name3 = "Joe Biden";
    int spacePos = name3.indexOf(" ");
    String result4 = name3.substring(spacePos - 2); 
    System.out.println(result4);

    //5
    String name4 = "Paddy Murphy";
    char result5 = name4.charAt(name4.length()-3);
    result5 = Character.toLowerCase(result5);
    System.out.println(result5);

    //6
    String greeting = "   I AM   ".trim();
    String result6 = greeting + " GOOD THANKS".toLowerCase();
    System.out.println(result6);

    //7
    char theChar = 'z';
    char result7 = Character.toUpperCase(theChar);
    System.out.println(result7);

    //8
    String name8 = "kinsella";
    int result8 = name8.length();
    result8 -- ;
    System.out.println(result8);


    //9
    String name9 = "patrick";
    int location = name9.length() - 1;
    char result9 = name9.charAt(location);
    System.out.println(result9);

    //10
    String name10 = "joe doe";
    String subName = " oe";
    int result10 = name10.indexOf(subName);
    System.out.println(result10);


    //11
    String name11 = "Joe Dolan";
    spacePos = name11.indexOf(" ");
    String result11 = name11.substring(spacePos + 2);
    System.out.println(result11);


    //12
    String name12 = "Joe Dolan";
    spacePos = name12.indexOf(" ");
    String result12 = name12.substring(spacePos-2,spacePos);
    System.out.println(result12);


    //13
    myString1 = "abc";
    myString2 = "ade"; 
    int result13 = myString1.compareTo(myString2);
    System.out.println(result13);

    
  } //end main 

} // end class
