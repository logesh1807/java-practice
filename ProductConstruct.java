import java.util.Scanner;

public class ProductConstruct {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p =new Product();
		
		System.out.println("Enter the product id");
		long id = Integer.parseInt(sc.nextLine());
		p.setId(id);
		System.out.println("Enter the product name");
		p.setproductName(sc.nextLine());
		System.out.println("Enter the supplier name");
		p.setsupplierName(sc.nextLine());
		
		System.out.println("product id is: "+p.getId());
		System.out.println("product name is: "+p.getproductName());
		System.out.println("supplier name is: "+p.getsupplierName());
	}
}
