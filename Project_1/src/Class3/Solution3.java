package Class3;

public class Solution3 {
	int a,b,c,d,e;
	public Solution3(int a1, int b1, int c1, int d1, int e1) {
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;
		
	}
	public static void main(String[] args) {
		Solution3 js=new Solution3(1,2,3,4,5);//no call for assigning the value
		System.out.println("value of a "+js.a);//5 calls for print the variable
		System.out.println("value of b "+js.b);
		System.out.println("value of c "+js.c);
		System.out.println("value of d "+js.d);
		System.out.println("value of e "+js.e);
		/* for single object 5 calls for 10 objects 50 calls*/	}

}
