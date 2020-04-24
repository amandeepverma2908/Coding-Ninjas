public class Solution {  

    public static void rotate(int[] arr, int d) {
        //Your code goes here
        for(int i=0;i<d;i++)
            lrotate(arr,arr.length);
    }
    public static void lrotate(int[] arr,int n)
    {
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp;
    }
}
