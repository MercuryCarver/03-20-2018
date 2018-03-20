import java.util.Scanner;
public class Backwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Put in a sentence or a word");
Scanner word = new Scanner(System.in);
String input = word.nextLine();
for(int i = input.length()-1; i >= 0; i--) {
	System.out.print(input.charAt(i));
}
	}

}
