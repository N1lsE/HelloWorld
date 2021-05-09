import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name;

		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Age: ");
		age = sc.nextInt();
		
		System.out.println("Hello World!");	
		System.out.format("My name is %s and i'm %d years old.", name, age);

	}

}
