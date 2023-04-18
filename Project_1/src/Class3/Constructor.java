package Class3;

public class Constructor {
	
	public Constructor() {
		System.out.println("Default constructor");
		
	}
	public Constructor(int a) {
		System.out.println("one parameterized constructor");
		
	}
	public Constructor(int a1, int b1, int c1) {
		System.out.println("three parameterized constructor");
		
	}
	public static void main(String[] args) {
		Constructor js=new Constructor(1, 2, 4);// either we have to give value here individually to call constructor individually or
		Constructor rs=new Constructor();//or we can use different reference variable to call different constructor here I used (rs)
	Constructor ks=new Constructor(1);//or we can use"this" keyword
	}

}
