/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author User
 */
public class Card {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		cardAt(0);
		cardAt(1);
		cardAt(34);
		cardAt(35);
	}
	public static void cardAt(int n){
		String[] letterCard = {"C","D","H","S"};
		String[] numberCard = {"2","3","4","5",
							   "6","7","8","9",
							   "0","J","Q","K","A"};
		for (int i = 0; i < numberCard.length ; i++) {
			for (int j = 0; j < letterCard.length; j++) {
				 if(j == Math.floor(n/13)){
			if(i == n-(j*13)){
					System.out.println(numberCard[i]+letterCard[j]);
					}
			    }
			}
		}
	}
	}

			
	 
		
			
	


		
	
	

