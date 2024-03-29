
package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortTheScores {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(num);

		for (int i = 0; i < num; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		for (int x : list)
			System.out.println(x);
	}

}
