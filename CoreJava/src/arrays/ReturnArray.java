package arrays;

public class ReturnArray {
	public static void main(String[] args) {
        int a[] ={35,52,74,15,95,55,37,10,54,8};
        int sort_a[] = sortingArray(a);
        System.out.println("sorted array ");
        for (int idx = 0; idx < sort_a.length; idx++) {
            System.out.print(sort_a[idx] +"\t");
            
        }
   }

   static int[] sortingArray(int x[])
   {
       for (int i = 0; i < x.length; i++) 
       {
            for (int j = i+1; j< x.length; j++) 
            {
               if(x[i] < x[j])
               {
                   int temp = x[i];
                   x[i] =x[j];
                   x[j] = temp;
               }
            }
       }
       return x;
   }

}
