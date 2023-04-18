package Class3;

public class Problem1 {/* I have 5 global variables, and I need to assign value and print those variable
                         sol.1 -- call the variable assigns the value print the value*/
	
	int a, b, c, d, e;
public static void main(String[] args) {
	Problem1 js=new Problem1();//call the variable
	js.a=1;//assign the variable
	js.b=2;
	js.c=3;
	js.d=4;
	js.e=5;
	System.out.println("value of a "+js.a);//print the variable
	System.out.println("value of b "+js.b);
	System.out.println("value of c "+js.c);
	System.out.println("value of d "+js.d);
	System.out.println("value of e "+js.e);
	/* here in above program
	 * 10 calls for 1 object --- 5 for assigning the value and 5 for printing*/
	

	/*If I have 10 objects than 100 calls will be there*/
}

}
