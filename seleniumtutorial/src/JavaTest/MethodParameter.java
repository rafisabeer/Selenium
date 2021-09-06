package JavaTest;


class xyz{
	
	void display(int a,char b,String c) {
		System.out.println(a+""+b+""+c);
	System.out.println(a+b);
	}
	
}


public class MethodParameter {
	
	public static void main(String[] args) {

		xyz z= new xyz();
		z.display(8, 'b', "cat");
		
	}

}
