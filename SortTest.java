public class SortTest {
  public static void main (String [] args ) {
    int array[] = { 3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
    MyArray ma= new MyArray(copyArray(array));
    ma.insertionSort();
    System.out.println(ma); //This should print the sorted array
    MyArray ma1= new MyArray(copyArray(array));
    ma1.mergeSort();
    System.out.println(ma1); //This should print the sorted array
    MyArray ma2= new MyArray(copyArray(array));
    ma2.quicksort();
    System.out.println(ma2); //This should print the sorted array
  }

   public static  int[]  copyArray(int a[]){
         int b[] = new int[a.length];
         for(int i = 0;i<b.length;i++) b[i] = a[i];
         return b;
     }
}