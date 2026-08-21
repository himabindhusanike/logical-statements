package methods;

public class Methods2 {
	static int res;
	int method1(int a,int b) {
		int res=a+b;
		System.out.println("addition of two numbers  : "+res);
		method2(res,5);
		return res;
	}
	int method2(int res,int c) {
		int res1=res-c;
		System.out.println("difference of two numbers  : "+res1);
		method3(res,5);
		return res1;	
	}
	static int method3(int res1,int d) {
		int res2=res1*d;
		System.out.println("product of two numbers  : "+res2);
		method4(res2,5) ;
		return res2;	
	}
    static int method4(int res2,int e) {
      	int res3=res2/e;
		System.out.println("division of two numbers  : "+res3);
		return res3;		
	}

	public static void main(String[] args) {
		Methods2 m=new Methods2();
		m.method1(10, 5);

	}

}
