package InputOutput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Players {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter player name: ");
		String name = br.readLine();
		
		System.out.println("Enter jersey number: ");
		int jerNo = Integer.parseInt(br.readLine());
		
		System.out.println(name+ " has jersey number "+jerNo);
	}
}
