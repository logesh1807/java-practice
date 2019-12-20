import java.util.*;
class redcrossforeachloop
{
	public static void main(String...arg){
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		{
			int[] arr = new int[x];
			int total = 0;
			for(int i: arr)
			{
				i = sc.nextInt();
				total = total + i;
			}
			System.out.println(total);
		}
	}
}