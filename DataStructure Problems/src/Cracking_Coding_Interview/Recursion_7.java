package Cracking_Coding_Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Recursion_7 {
	Vector<Vector<Integer>> listOfDenomination = new Vector<Vector<Integer>>(); ; 
	
	void calDenomination(int amount,Vector<Integer> denomination) {
		if (amount==0) {
			Vector<Vector<Integer>> temp = new Vector<Vector<Integer>>();
			temp = listOfDenomination;
			Collections.sort(denomination);
			if (listOfDenomination.size()==0) {
				listOfDenomination.add(denomination);
			}
			for (Vector<Integer> iterate : temp) {
				//Collections.sort(iterate);
				if (iterate.equals(denomination)){
					
				}
				else {
					listOfDenomination.add(denomination);
				}
			}
			
		}
		else {
			if (amount >= 25) {
				//denomination.add(25);
				//amount = amount - 25;
				Vector<Integer> update = new Vector<Integer>();
				update.addAll(denomination);
				update.add(25);
				calDenomination(amount - 25, update);
			}
			if (amount >= 10) {
				//denomination.add(10);
				//amount = amount - 10;
				Vector<Integer> update = new Vector<Integer>();
				update.addAll(denomination);
				update.add(10);
				calDenomination(amount - 10, update);
			}
			if (amount >= 5) {
				//denomination.add(5);
				//amount = amount - 5;
				Vector<Integer> update = new Vector<Integer>();
				update.addAll(denomination);
				update.add(5);
				calDenomination(amount - 5, update);
			}
			if (amount >= 1) {
				//denomination.add(1);
				//amount = amount - 1;
				Vector<Integer> update = new Vector<Integer>();
				update.addAll(denomination);
				update.add(1);
				calDenomination(amount - 1, update);
			}
		}
		//return null;
	}
	
	static void recursivefunc(int x, int y) {
		int z = 500;
		if (x==0) {
			
		}
		else {
			if (x >= 25) {
				x = x - 25;
				y = y - 10;
				z = z - 25;
				recursivefunc(x, y);
			}
			if (x >= 1) {
				x = x - 1;
				y = y - 1;
				z = z - 25;
				recursivefunc(x, y);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> denomination = new Vector<Integer>();
		Recursion_7 hehe = new Recursion_7();
		hehe.calDenomination(17, denomination);
		for(int i=0;i<hehe.listOfDenomination.size();i++) {
			System.out.println(hehe.listOfDenomination.get(i));
		}
		System.out.println();
	//	recursivefunc(27, 200);
	}

}
