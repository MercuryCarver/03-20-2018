import java.util.Scanner;
public class MovieMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie Movie1 = new Movie("Get Out", "Horror", "R");
		Movie Movie2 = new Movie("Wonder Woman", "Action", "PG-13");
		Movie Movie3 = new Movie("Thor:Ragnarok", "Action", "PG-13");
		Movie Movie4 = new Movie("Girls Trip", " Comedy", "R");
		Movie Movie5 = new Movie("Beauty and the Beast", "Romance", "PG");

		System.out.println("Would you like to search names using genres, or ratings?");
		Scanner input = new Scanner(System.in);
		String decision = input.nextLine();
		if(decision.length()==6) {
			System.out.println("What genre would you like to find today? Put 1 for Horror, 2 for Action, 3 for Comedy or 4 for Romance");
			int genredecision = input.nextInt();
			if(genredecision==1) {
				System.out.println(Movie1.Name);
			}else if(genredecision==2) {
				System.out.println(Movie2.Name + '\n' + Movie3.Name);
			}else if (genredecision==3) {
				System.out.println(Movie4.Name);
			}else {
				System.out.println(Movie5.Name);

			}
		}else {
				System.out.println("What rating would you like to look for?");
		String ratingdecision = input.nextLine();
		if(ratingdecision.length()==1) {
			System.out.println(Movie1.Name + '\n' + Movie4.Name);
		}else if (ratingdecision.length()==5) {
			System.out.println(Movie2.Name + '\n' + Movie3.Name);
		}else {
			System.out.println(Movie5.Name);
		}
		}
	}
}
