package lab5;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers1 = new int[20];
		for (int index = 0; index < 20; index++) {
			Random rand = new Random();
			numbers1[index] = rand.nextInt(11);
		}
		for(int index = 0; index < 20; index++) {
			System.out.print(numbers1[index] + " ");
		}
		int[] numbers2 = new int[20];
		for(int index = 0; index < 20; index++) {
			if (index == 0) {
				numbers2[index] = numbers1[0];
			}
			else {
				numbers2[index] = numbers1[index - 1] + numbers1[index]; 
			}
		}
		System.out.println("");
		for(int index = 0; index < 20; index++) {
			System.out.print(numbers2[index] + " ");		
	}
}
}
