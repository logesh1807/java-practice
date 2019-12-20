import java.util.Scanner;

public class GenCDetails {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		GenC n = new GenC(969143,"Jhon");
		GenC n1 = new GenC(969144,"Priya");
		
		System.out.println("Enter the number of GenCs");
		int gen = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<gen;i++){
			System.out.println("Enter employee Id");
			int empId = Integer.parseInt(sc.nextLine());
			n.setEmpId(empId);
			
			System.out.println("Enter name");
			String name = sc.nextLine();
			n1.setName(name);
		}
		n.display();
		n1.display();
	}

}
