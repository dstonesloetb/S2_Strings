import java.util.Scanner;

public class SumDigits {

  public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);

      //Prompt user for integer value
      System.out.print("Input an integer: ");
      int digits = in.nextInt();

      //Display result
    System.out.println("The sum is " + sumDigits(digits));
    } //end main


  
 public static int sumDigits(long n) {
   
    int result = 0;

    //keep running total of digits
    while(n > 0) {
      result += n % 10;
      n /= 10;
    } //end while 

    return result;
   
  } //end sumDigits

} //end class
