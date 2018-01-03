/*File Name: SquareMatrix
	Author: Kristi Hicks
        KUID: 2795468
	Email Address: k443h544@ku.edu 
	Homework Assignment Number: Homework 2
	Description:  Displays numbers in order than the transpose of them
	Last Changed: March 4th, 2015 */

import java.util.Scanner;

public class SquareMatrix {
	public static void main(String[] args){
		int size; // Size of Matrix
		int sum=0; 
		
		System.out.println("Enter the Size of the Square Matrix: ");
		Scanner input = new Scanner(System.in);
		size = input.nextInt(); // User inputs size
		System.out.println("Square Matrix: ");
		
		for(int i=0; i < size; i++){
			for(int j=1; j <= size; j++){
				sum = sum +1;
				System.out.print(sum);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose: ");
		
		for(int i=1; i <= size; i++){
			for(int j=1; j <= size; j++){
				if(i == j){
				System.out.print(i + " ");
				System.out.print(i + size + " ");
				System.out.println(i + size + size + " ");
				}
			}
		}
	}
}