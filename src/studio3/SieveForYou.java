package studio3;

import java.util.Scanner;

public class SieveForYou {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What integer would you like to check for prime numbers until?");
		int highestInteger = in.nextInt();
		
		int[] numbers = new int[highestInteger];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1; 
		}
		
		boolean[] truthValues = new boolean[highestInteger - 1];
		
		for(int i = 0; i < numbers.length; i++) {
			//int counter = 2;
			for (int numCheck = 2; numCheck < numbers.length; numCheck++) {
				//System.out.println(numbers[i]);
				//System.out.println(numCheck * counter);
			for (int counter = 2; counter < highestInteger; counter++)	{
				if(numCheck * counter == numbers[i]) {
					System.out.println(numbers[i] + " is not prime!");
					}
			}
					//counter += 1; 
					//System.out.println(); 
				}
				
			}
		}
		
	}
