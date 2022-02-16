import java.util.*;
public class Swap {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swapping numbers:" +a+" "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping:" +a+ " "+b);
		System.out.println();
	}

}
