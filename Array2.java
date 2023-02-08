package lab5;

import java.util.Random;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int [][] numbers1 = new int[3][5];
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers1[i][j] = rand.nextInt(31) + 20;
            }
		}
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers1[i][j] + " ");
            }
 
            System.out.println();
        }
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter minimum integer value");
		int userNum = input1.nextInt();
		input1.close();
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (numbers1[i][j] < userNum) {
                	numbers1[i][j] = 100;
                }
            }
		}
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 5; j++) {
        		System.out.print(numbers1[i][j] + " ");
        	}
                System.out.println();
        }
            }
}
             
		
