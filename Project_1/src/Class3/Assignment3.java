package Class3;

public class Assignment3 {
	public Assignment3() {
		this (1, 2, 3);
		System.out.println("Default constructor");
	}
	public Assignment3(int a) {
		this ();
		System.out.println("One Parameterize constructor");
	}
	public Assignment3(int a3, int b6) {
		this (12, 23, 32, 23);
		System.out.println("Two Parameterized constructor");
	}
	public Assignment3(int a2, int b2, int c2) {
		System.out.println("Three parameterized constructor");
	}
	public Assignment3(int a1, int b1, int c1,int  d1) {
		this (1);
		System.out.println("Four Parameterized constructor");
	}
	public static void main(String[] args) {
		Assignment3 js=new Assignment3(1, 2);
	}

}
