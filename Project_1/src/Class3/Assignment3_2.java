package Class3;

public class Assignment3_2 {
	public void m0(){
		System.out.println("Default method");
	}
	public void m1(int a){
	
		System.out.println("One parameterized method");
	}
	public void m2(int a1, int b1){
		this.m4(1, 2, 3, 4);
		this.m0();
		this.m1(1);
		this.m3(1, 1, 1);
		System.out.println("Two parameterized method");
	}
	 
	public void m3(int a2, int b2, int c2){
		System.out.println("Three parameterized method");
	}

	public void m4(int a3, int b3, int c3, int d){
		System.out.println("Four parameterized method");
	}
	public static void main(String[] args) {
		Assignment3_2 js=new Assignment3_2();
		js.m2(1, 1);
	}

}
