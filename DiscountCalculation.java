import java.util.Scanner;
class DiscountCalculation{
	public static void main(String...arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Price of item 1: ");
		Double price1 = Double.parseDouble(sc.nextLine());
		System.out.println("Price of item 2: ");
		Double price2 = Double.parseDouble(sc.nextLine());
		System.out.println("Discount in percentage");
		int discount = Integer.parseInt(sc.nextLine());
		double Totalamount = (price1 + price2);
		double Savedamount = (Totalamount/100)*10;
		double Discountamount = (Totalamount - Savedamount);
		System.out.println("Total amount:$ "+Totalamount);
		System.out.println("Discounted amount:$ "+Discountamount);
		System.out.println("Saved amount:$ "+Savedamount);
	}
}
