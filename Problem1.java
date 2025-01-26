
import java.io.*;

class Problem1 {
    static int search(int ar[], int size)
    {
        // Extreme cases
        int low =0;
        int high = size-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            // if the mid element is as expected, if yes it means no missing element till mid check other half
            if(ar[mid] == mid + 1){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return l+1;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int ar[] = {1, 2, 3, 4, 5, 6,7, 8 };
        int size = ar.length;
        System.out.println("Missing number: " + search(ar, size));
    }
}

//Time Complexity: O(log(N))
//Space Complexity: O(1)