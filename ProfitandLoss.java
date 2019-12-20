import java.util.Scanner;
class ProfitandLoss
{
	public static void main(String...arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the price per dozen");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the selling price of 1 toy");
		int z = Integer.parseInt(sc.nextLine());
		double costPrice = y/12d;
		double profit = z-costPrice;
		double profitPer = (profit/costPrice)*100;
		System.out.println("Sam's sams profit percentage is: "+profitPer);
	}
}