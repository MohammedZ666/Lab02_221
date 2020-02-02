
import java.util.Random;


public class MyArray {
     
     
     
     
     //A is an array of integers
     int a[];
     //Constructor
     public MyArray (int temp [] ) {
       a= new int [temp.length];
       //Copying the values 
       for (int i=0; i<temp.length; i++ ) {
         a[i]=temp[i];
       }
     }
     
     public void insertionSort () {
       // TO DO
    
     for(int i = 0; i<a.length;i++){
         
         int key = a[i];
         int j = i -1;
         
         while(j>=0 && a[j]>key){
             
             a [j+1] = a[j];
             j--;
             
         }
         
         a[j+1] = key;
     }
     
     }
     
     public void mergeSort(){
      
       a = mergeSort(a);         
     
         
     }
     
     public void quicksort(boolean isRandomized){
         
         quicksort(a,0,a.length-1,isRandomized);
     }
     
     
     
     public int[] mergeSort(int d[]) {
       // TO DO
       
        
        if(d.length == 1){
            
            return d;    
            
        }
    
        
            
            int right[] = mergeSort(getSubArray(d,d.length/2,d.length));
            int left[] = mergeSort(getSubArray(d,0,d.length/2));

            
           return merge(left,right);
        
     
     }
     
     
  
  
    public void quicksort(int[] arr,int l, int h, boolean isRandomized) 
    { 
        if (l < h) 
        { 
            
            int p = partition(arr, l, h, isRandomized); 
  
            
            quicksort(arr, l, p-1,isRandomized); 
            quicksort(arr, p+1, h, isRandomized); 
        } 
    } 

    
    
    
    public int findK(int nth, int[] arr,int l, int h) 
    { 
        if (l < h) 
        { 
            
            int p = partition(arr, l, h,false); 
            
            if(p+1<nth) {
                
                return findK(nth,arr, p+1, h);
         
            }
          
            else if(p+1>nth){ 
             
                return findK(nth,arr, l, p-1);
                
            }
         
            else return arr[p];
        } 
    
        return -1;
    } 
  
    
    
    public int partition(int arr[], int low, int high, boolean isRandomized) 
    { 
       if(isRandomized){
       
           
           int rand = new Random().nextInt(high-low) + low;
           int temp = arr[high];
           arr[high] = arr[rand];
           arr[rand] = temp; 
       } 
       
       
       
       int pivot = arr[high];
       int i = (low-1);
       for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                  int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    }
     
     
    
     
     public String toString () {
       //TO DO
       String s = "";
       for(int i = 0; i<a.length; i++) s+= a[i] + " ";
       s+="\n";
       return s; 
     }
     
    public int[] getSubArray(int []array, int start, int upto){
        
        int length = upto-start;
        int b[] = new int[length];
        
        for(int i = start; i<upto; i++){
            
            b[i-start] = array[i];
        }
    
        return b;
        
    }
    
    public  int[] merge(int[] a, int[] b){
        
        int [] bigger;
        int [] smaller;
        int [] total;
      
       if(a.length>b.length){
           
        bigger = a;
        smaller = b;
           
       }
        
        else {
            
            bigger = b;
            smaller = a;
        }
    
        a = null; b = null;
        total = new int[bigger.length+smaller.length];
        int j = 0,k = 0;
        
        for(int i = 0; i<total.length; i++){
            
           if(j<smaller.length&&k<bigger.length){
            
            if(bigger[k]>smaller[j]){
                
                total[i] = smaller[j];
            
                j++;
            }    
            
            else {
                total[i] = bigger[k];
                k++;
            }
           }        
        
        else if(k<bigger.length){
          
            total[i] = bigger[k]; 
            k++;
            
        }    
        
        else{
            total[i] = smaller[j]; 
            j++;
            
        }    
            
        }
        
        
        return total;
    }    
      
    
}  
    
