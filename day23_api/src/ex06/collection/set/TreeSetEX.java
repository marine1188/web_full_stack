package ex06.collection.set;

import java.util.TreeSet;

public class TreeSetEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score = {85,95,50,35,45,65,10,100};
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		// 중복 포함하지 않음 
		System.out.println(set);
		System.out.println("50 보다 작은 값:"+set.headSet(50));
		System.out.println("50 보다 큰 값:"+set.tailSet(new Integer(50)));
	}


}
