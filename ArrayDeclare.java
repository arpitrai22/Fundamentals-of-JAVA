public class ArrayDeclare {
  
  public static void main(String[] args) {

    /* 
    int[] arr = new int[5];

    int i;

    for(i = 0; i<=4; i++) {

      arr[i] = i;
      System.out.println(arr[i]);

    }
    */

   /* 
   int[] a = {10,20,30,44,44,53,34};
   int val = a[1];

   System.out.println("Value of Val:" + " " + val);
   System.out.println("Length of the Array is:" + " " + a.length);
    */

   //Using ForEach Loop
   int[] arr1 = {10,223,33,2,1,33,32,32};

   for(int i : arr1) {

    if (i % 2 == 0) {
      System.out.println(i);
    }

   }

  }

}
