package methods;

public class Method1 {
	int res;
	 void addition(int a,int b){
		res=a+b;
		System.out.println("sum         : "+res );
	    substraction(res,10);
		
	}
    void substraction(int a,int b) {
		res=a-b;
		System.out.println("difference  : "+res);
		multiplication(res,10);
		
	}
	void multiplication(int a,int b) {
		res=a*b;
		System.out.println("product     : "+res);
		division(res,10);
	}
	void division(int a,int b) {
		res=a/b;
		System.out.println("division    : "+res);
	    
		
	}
	public static void main(String[] args) {
		Method1 m=new Method1();
		m.addition(10,10);
	}

}
