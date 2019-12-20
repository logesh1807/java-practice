import java.util.Scanner;

public class classandinstance {
	public static void main(String...arg) {
		Scanner sc = new Scanner(System.in);
		product p = new product();
		
		System.out.println("Enter the product id");
		long id = Integer.parseInt(sc.nextLine());
		p.setId(id);
		
		System.out.println("Enter the product name");
		String pname=sc.nextLine();
		p.setproductName(pname);
		
		System.out.println("Enter the supplier name");
		String sname=sc.nextLine();
		p.setsupplierName(sname);
		
		System.out.println("product id is: "+p.getId());
		System.out.println("product name is: "+p.getproductName());
		System.out.println("supplier name is: "+p.getsupplierName());
	}

}
