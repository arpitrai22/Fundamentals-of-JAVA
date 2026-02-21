public class SumArrayatEven {
  
public static void main(String[] args) {

  int[] arr = {10,23,4,6,6,7,8,8,45};
  int sum = 0;

  for(int i : arr) {

    if( i % 2 == 0) {

      sum += i;

    }

  }
  System.out.println("Sum of Even Elements is:" + " " + sum);
}

}
