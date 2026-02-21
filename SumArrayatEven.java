public class SumArrayatEven {
  
public static void main(String[] args) {

  int[] arr = {10,23,4,6,6,7,8,8,45};
  int sum = 0 , i;

  for(i = 0; i < arr.length; i++) {

      if( i % 2 == 0){

        sum += arr[i];

      }
      
    }

    System.out.println("Sum of Elements at Even Index is:" + " " + sum);

  }
  

}
