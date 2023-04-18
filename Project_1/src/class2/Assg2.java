package class2;

public class Assg2 {
	public int sum (int a, int b) {
	int c = a+b;
	System.out.println("sum result is "+c);
	return c;
	
	}
	public int sub (int a1, int b1) {
		int c1 = a1-b1;
		System.out.println("sub result is "+c1);
		return c1;
		
	}
	
	public int multi (int a2, int b2) {
		int c2 =a2*b2;
		System.out.println("Final result is "+c2);
		return c2;
		
	}

 public int div(int a3 , int b3) {
	 int c3 =a3/b3;
	 System.out.println("Div result is " +c3);
	 return c3;
	 
 }
 
 public static void main(String[] args) {
	Assg2 js=new Assg2();
	int x =js.div(10, 2);
	int z =js.sub(x, 2);
	int y =js.sum(z, 2);
	int k =js.sub(y, 2);
	js.multi(k, 2);

	
}
}
