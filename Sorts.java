import java.util.Scanner;

public class Sorts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any key to start...");
		sc.next();

		for(int i = 10; i < 3001; i++) {
			System.out.println(RandomListGenerator.intFile("data.txt", i) + " Run: "+ i);
			Integer[] list = RandomListGenerator.getData("data.txt");
			RadixSort.radixSort(list, i);
		}
		System.out.println("Press any key to exit...");
		sc.next();
	}

}