import java.util.Scanner;

public class MethodAdd3Nums {
  public static void main(String[] args)
    {
      //Declare Scanner object
      Scanner in = new Scanner(System.in);

      //Input 3 numeric values
      System.out.print("Input the first number: ");
      double x = in.nextDouble();
      
      System.out.print("Input the second number: ");
      double y = in.nextDouble();
      
      System.out.print("Input the third number: ");
      double z = in.nextDouble();

      //Call function to calculate and display average
      System.out.print("The average value is " + average(x, y, z)+"\n" );
    } //end main 

  //Function to calculate the average of 3 numbers 
  public static double average(double x, double y, double z)
    {
        //return average of 3 values
        //i.e. total/ 3
        double total = x + y + z;
        double avg = total/ 3;
        return avg;
      
        //return (x + y + z) / 3;
    }

} //end class 
