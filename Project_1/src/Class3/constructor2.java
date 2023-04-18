package Class3;

public class constructor2 {//Use of this keyword

		public constructor2() {
			this(1);//This statement will be the first statement and we can't write more than 1 this statement
			System.out.println("Default constructor");
			
		}
		public constructor2(int a) {
			System.out.println("one parameterized constructor");
			
		}
		public constructor2(int a1, int b1, int c1) {
			this();
			System.out.println("three parameterized constructor");
		}
		public static void main(String[] args) {
			constructor2 js=new constructor2 (12, 23, 44);
		}
	}
