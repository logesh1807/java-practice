import java.util.Scanner;
class Secureurl
{
	public static void main(String...arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		System.out.println("Enter the start string");
		String s2 = sc.nextLine();
		if(s1.startsWith(s2))
		{
			System.out.println(s1+"starts with 'https'");
		}
		else
		{
			System.out.println(s1+"does not starts with'https'");
		}
	}
}