package Class3;

public class method_this {/*Second Use of this keyword
for calling from one method to another method, and in case of method we can write 'this' statement anywhere in the
method and we can write more than one this statement inside a method*/
	public void m1() {
		
		System.out.println("Method 1");
	
		
	}
	public int m2() {
		System.out.println("Method 2");
		int a=12;
		return a;
	
		
	}
	public void m3() {
		this.m1();		
		System.out.println("Method 3");
		int result = this.m2();
		System.out.println("result is  " +result);
		
	}
	public static void main(String[] args) {
		method_this js=new method_this();
		js.m3();
	}

}
