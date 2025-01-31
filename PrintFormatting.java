
package com.mycompany.stringexamples;

/**
 *
 * @author DarrenStones
 */
public class PrintFormatting {

  public static void main(String[] args) {
    String heading1 = "Exam_Name";
    String heading2 = "Exam_Grade";

    String exam1 = "Java";
    String grade1 = "A";
    String exam2 = "PHP";
    String grade2 = "B";
    String exam3 = "VB NET";
    String grade3 = "A";


    System.out.printf("%-15s %15s %n",heading1, heading2);
    System.out.println("---------------------------------"
                    + "---------");
    System.out.printf("%-15s %10s %n",exam1, grade1);
    System.out.printf("%-15s %10s %n",exam2, grade2);
    System.out.printf("%-15s %10s %n",exam3, grade3);
  } //end main 

} //end class
