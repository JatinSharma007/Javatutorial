package Class3;

public class Problem2 {
	int a,b,c,d,e;
	public void method1(int a1, int a2, int a3, int a4, int a5) {
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
		
	}
	public static void main(String[] args) {
		Problem2 js=new Problem2();
		js.method1(1, 2, 3, 4, 5);//Assign the value
		System.out.println("value of a "+js.a);//print the variable
		System.out.println("value of b "+js.b);
		System.out.println("value of c "+js.c);
		System.out.println("value of d "+js.d);
		System.out.println("value of e "+js.e);
		/* Here for one object we make one call for assigning the value and 5 calls for printing the value.
		 * If we have 10 objects than the total no. of calls will be 60*/
		 
		
	}

}
