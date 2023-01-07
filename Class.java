package testezin;
import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		Scanner txt1 = new Scanner(System.in);
		String str;
		
		System.out.println("Digite seu nome: ");
		str = txt1.nextLine();
		System.out.println("Bem-Vindo " + str + ", Tenha uma ótima tarde.");
		
		txt1.close();

	}

}
