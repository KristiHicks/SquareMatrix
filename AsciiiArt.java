/*File Name: AsciiArt
	Author: Kristi Hicks
        KUID: 2795468
	Email Address: k443h544@ku.edu 
	Homework Assignment Number: Homework 2
	Description:  Design patterns to desplay to the user
	Last Changed: March 4th, 2015 */

import java.util.Scanner;

public class AsciiiArt {
	public static void main(String[] args){
		String stripes; // Stripes Pattern
		String CheckerBoard; // Checker Board Pattern
		String DoubleDiagonal; // Diagonal Pattern
		String TwoIslands; // Two Island Pattern
		int pattern=1; // Type of Pattern
		int size; // Size of Pattern
		int start=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose one of the following patterns by typing the corresponding number: ");
		System.out.println("1) Stripes");
		System.out.println("2) Checker Board");
		System.out.println("3) Double Diagonal (aka the X)");
		System.out.println("4) Two Islands");
		pattern = input.nextInt(); // User inputs Pattern they want
		
		if(pattern >= 5 || pattern <= 0){
			System.out.println("Error. ");
		
		}
		else if(pattern >= 1 || pattern <= 4){
		System.out.println("Input a size (must be larger than 1): ");
		size = input.nextInt(); // User inputs size they want 
		
		if(size < 1){
			System.out.println("Error. ");
		}
		
		else if(pattern == 1){
				for(int i=0; i < size; i++){
					System.out.print(i + " ");
					for(int j=0; j < size; j++){
						if((j%2) == 0){
							System.out.print("* ");
						}
						else{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
		
			else if(pattern == 2){
				for(int i=0; i < size; i++){
					System.out.print(i + " ");
					for(int j=0; j < size; j++){
						if((j%2) == (i%2)){
							System.out.print("* ");
						}
						else{
							System.out.print(" ");
						}
					}
					System.out.println();
				}	
			}
		
			else if(pattern == 3){
				for(int i=0; i < size; i++){
					System.out.print(i + " ");
					for(int j=0; j < size; j++){
						if (i == j || j+i == size-1){
							System.out.print("*");
						}
						else{
							System.out.print(" "); 
						}
					}
					System.out.println();
				}
			}		
		
			else if(pattern == 4){
				for(int i=0; i < size; i++){
					System.out.print(i + " ");
					for(int j=0; j < size; j++){
						if(j+i == size-1){
							System.out.print("*");	
						}
						else if(j>= size-(size/2) && i>= size-(size/2)){
							System.out.print("?");
						}
						else if(i< size/2 && j< size/2){
							System.out.print("!");
						}
						else{
							System.out.print("~");
						}
					}			
					System.out.println();
				}
			}
		}	
		
	
	}
}

