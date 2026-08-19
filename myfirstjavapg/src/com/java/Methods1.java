package com.java;

public class Methods1 {
	
	
	static int a=30;
	static int b=20;
       
		static void add() {
			int sum=a+b;
			System.out.println("sum  :  "+ sum);
			subtraction();	
		}
		
		static void subtraction() {
			int sub=a-b;
			System.out.println("sub  :  "+ sub);
			Methods1 m=new  Methods1();
			m.multiplication();		
		}
		
		void multiplication() {
			int mul=a*b;
			System.out.println("mul  :  "+ mul);
			division();	
		}
		
		void division() {
			int div=a/b;
			System.out.println("div  :  "+ div);
				
		}
		
		public static void main(String[] args) {
			
			add();	
			
	}

}
