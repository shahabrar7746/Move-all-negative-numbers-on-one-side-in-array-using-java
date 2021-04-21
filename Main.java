import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //this 'n' will give size of array 
	    int n = sc.nextInt();
	    int array[] = new int[n];
      // giving values to array
	   for(int i = 0;i<n;i++) {
		   array[i] = sc.nextInt();
	   }
	   Arrays.sort(array);
      //printing values
	   for(int i = 0;i<n;i++) {
		   System.out.print(array[i] + " ");
	   }
    }
}
