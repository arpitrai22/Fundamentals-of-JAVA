public class TernaryOperator {
  
  public static void main(String[] args) {

    int a = 11, b = 11;

    // Using ternary operator to find the maximum of two numbers
    

    int c = (a > b) ? a : a == b ? 0 : b;

    if (c == 0) {
      System.out.println("Both numbers are equal.");
      
    } else {
      System.out.println("The maximum number is: " + c);
    }

  }
}
