import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Put in a number");
Scanner input = new Scanner(System.in);
int number = input.nextInt();
int equation = number + (number*11) +(number*111);
int equation2 = (number*11);
int equation3 = (number*111);
System.out.println(number + " + " + equation2 + " + " + equation3 + " = " + equation);

	}

}
