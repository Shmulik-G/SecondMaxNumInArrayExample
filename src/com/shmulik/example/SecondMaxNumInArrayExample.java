package com.shmulik.example;

import java.util.Random;

public class SecondMaxNumInArrayExample {

	public static void main(String[] args) {
		//Insert 10 Random Numbers In Array1

		int[] array1 = new int[10];
		Random rnd = new Random();
		for (int index = 0; index < array1.length; index++) {
			array1[index] = rnd.nextInt(101);
			System.out.println(array1[index]);
		}

		// Find The Positive Second Max Number In Positive Array

		int[] array = {16,40,-48,-11,20,-39,14,40,40,-25};
		int firstMaxNum = array[0];
		int secondMaxNum = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] > firstMaxNum ) {
				secondMaxNum = firstMaxNum;
				firstMaxNum = array[index];
			}
			else {
				if (array[index] >= secondMaxNum && array[index] < firstMaxNum) {
					secondMaxNum = array[index];
				}
			}
		}
		System.out.println("The FirsetMaxNum: " + firstMaxNum);
		System.out.println("The SecondMaxNum: " + secondMaxNum);
	}
}



