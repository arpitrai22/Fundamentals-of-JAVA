public class SumArrayatOdd {
  
  public static void main(String[] args) {

    int[] arr = {10,4,45,2,34,32222,1,5325,245};
    int sum = 0 , i ;

    for(i = 0; i < arr.length; i++) {

      if( i % 2 == 1){

        sum += arr[i];

      }
      
    }

    System.out.println(sum);

  }

}  

