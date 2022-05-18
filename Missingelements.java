package week1.day2.assignments;
import java.util.Arrays;


public class Missingelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5};
		
		
		Arrays.sort(arr);
		int length=arr.length;
		
		
		
		for(int i=0;i<length;i++)
		{
			
		int m=arr[i];
		if((i+1)!=m)
          {
	          System.out.println(i+1);
	          break;
	          
	         
      }
		}
	}
}
		
		
		
		
		
		
		

	


