package com.dilip;

public class day9 {

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		// loops
		
				// for loop and while 
				
				
//				for(intialization;conditionCheck;increment/Decrement) {
//						//statemetns 
//				}
				
				// print 'hello'  5 tyms 
				
				for(int i = 0 ; i < 5 ; i++) { // 1 // 2 // 3 // 4  // 5
					System.out.println("hello"); 
					// hello // hello // hello // hello  // hello
				}
				
				// print 1 to 10
				
				for(int i = 1 ; i <= 10 ; i++) {
					System.out.println(i);
				}
				
				// print 10 to 1

				for(int i = 10 ; i >= 1 ; i--) {
					System.out.println(i);
				}
				
				//table of 5
				for(int i = 5 ; i <= 50 ; i = i+5) {
					System.out.println(i);
				}
				
				// break 
				for(int i = 5 ; i >=1 ; i--) { // 4 // 3 // 3
					System.out.println(i); // 5 // 4 // 3 // 2
					if(i == 2) {
						break;
					}
				}
				
				// continue
			
				for(int i = 0 ; i <= 5 ; i++) { // 1 // 2 // 3 // 4 // 5 // 6
					if(i == 2 || i == 4) {
						continue;
					}
					System.out.println(i); // 0 // 1 // 3  // 5
				}
				// 100 users ---- 'A'
				
				
				/*
				 * 	intialization
				 * 
				 *  while(condition){
				 *   // statements 
				 *   
				 *   increment/ decrement
				 *   
				 *  }
				 * 
				 * */
				
				
				// print 'hello'  5 tyms with while loop
				
				
				int i1 = 1;
				while(i1 <= 5) {
					System.out.println("hello"); 
					// "hello" , "hello" , "hello" ,"hello" , "hello"
					i1 ++;  // 2 // 3 // 4 // 5 // 6
				}
				
				// print 1 to 5
				
				int i2 = 1;
				while(i2 <= 5) {
					System.out.println(i2);
					i2 ++;
				}
				
				// print 5 to 1
				
				int i3 = 5;
				while(i3 >= 1) {
					System.out.println(i3);
					i3 --;
				}
				
				// table of 2
				int i4 = 2;
				while(i4 <= 20) {
					System.out.println(i4);
					i4 = i4 + 2;
				}
					
				// table of 5 in reverse
				
				int i5 = 50;
				while(i5 >= 5) {
					System.out.println(i5);
					i5 = i5 - 5 ;
				}
				
				// break with while loop
				
				int wb = 5;
				while(wb >= 1) {
					if(wb == 2) {
						break;
					}
					System.out.println(wb); // 5 // 4 // 3
					wb--; // 4 // 3 // 2
				}
				
				int i7 = 5;
				while(i7 >= 1) {
					System.out.println(i7);  // 5 4 3 2
					if(i7 == 2) {
						break;
					}
					i7--; 
				}
				
				// continue with while 
				
				int wc = 1 ;
				while(wc <= 5) {
					if(wc == 2) {
						//wc ++; // 3
						continue;
					}
					System.out.println(wc);  //1 // 3 // 4 // 5
					wc++; // 2 // 4 // 5 // 6	
		
				}
	}
}


