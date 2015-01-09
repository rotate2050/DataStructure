package Careercup;

public class Grey_Code_Bit {

	public static boolean checkGrayCode(int a, int b){
		int z = a^b;
		
		//System.out.println("z : "+ z);
		int negz = (z & (-z));
		
		//System.out.println("negz : " + negz);
		
		if(z== negz){return true;}
		else {return false;}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -7;
		int j = -8;
		/*int temp = i ^ j;
		
		int gray = (temp) & (temp-1);
		if (gray==0) {
			System.out.println("Sequencally Gray Code");
		}
		else {
			System.out.println("Gray Code are not Sequencelly");
			
		}
		
		int counter = 0;
		while (temp!=0){
			//System.out.println("HEHE");
			int temp2 = temp & 1;
			if (temp2==1) {
				counter++;
			}
			temp = temp >> 1;
		}
		
		if (counter==1) {
			System.out.println("WSequencally Gray Code");
		}
		else {
			System.out.println("WGray Code are not Sequencelly");
		}*/
		if (checkGrayCode(i, j)) {
			System.out.println("WSequencally Gray Code");
		}
		else {
			System.out.println("WGray Code are not Sequencelly");
		}
		
		
	}

}
