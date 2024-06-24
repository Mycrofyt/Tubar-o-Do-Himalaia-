package buga;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int f =  scanner.nextInt();
			int i, o = 1;
			for (i=1; i<=f ;i++) {
				o = o*i;
			}
			int x=343;
			int y=11;
			int z=x%y;
			System.out.println("Valor fatorial de "+f+" é "+o+"       "+z);
		}
	}
}