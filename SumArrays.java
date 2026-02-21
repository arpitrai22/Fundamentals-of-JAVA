public class SumArrays {
  
  public static void main(String[] args) {

    int[] arr = {10,23,45,2,42,424,42,234,23,4,22,42,323,2,4,2,3,4};
    int sum = 0;
    
    for(int i : arr) {

      sum += i;

    }

    System.out.println("Sum of all the Elements of array is:" + " " + sum);

  }

}
