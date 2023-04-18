package class2;

public class Class_2 {
	public int sum(int a, int b) {
		int c =a+b;
	
		System.out.println("Sum result is " +c);
		
		return c;
	}
	public int sub (int a1, int b1)
	{
		int c1 = a1-b1;
		System.out.println("Sub result is " +c1);
		return c1;
	}
	public void multi (int a2, int b2) {
		int c2 = a2*b2;
		System.out.println("Final result is " +c2);
		
		
	}
	public static void main(String[] args) {
		Class_2 js=new Class_2();
		int x = js.sum(10, 2);
		
		int y = js.sub(10, 2);
		
		js.multi(x,y);
		
	}
}
