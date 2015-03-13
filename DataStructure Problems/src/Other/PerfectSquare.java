package Other;

import java.util.*;

public class PerfectSquare {
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan_int = new Scanner(System.in);
        int total_no = scan_int.nextInt() * 2;
        int [] pairs = new int[total_no];
        for(int i=0;i<total_no;i++) {
            pairs[i] = scan_int.nextInt();
            i++;
            pairs[i] = scan_int.nextInt();
           
        }
        for (int i=0;i<total_no;i++) {
            int pair1 = pairs[i];
            int pair2 = pairs[i+1];
            System.out.println(findNoofSquares(pair1,pair2));
            i++;
        }
    }
    
    public static int findNoofSquares(int num1, int num2)
	{
        if(num1<0) {
			num1=0;
		}
		if(num2<0) {
			num2=0;
		}
		if(num1>num2)	{
			int temp=num1;
			num1=num2;
			num2=temp;
		}
        int first_root = (int)Math.sqrt(num1);
        int second_root = (int)Math.sqrt(num2);
        
        if(first_root*first_root==num1){
				return (second_root-first_root + 1);
		}
        else {
            return (second_root-first_root);
        }
        
	}
}
