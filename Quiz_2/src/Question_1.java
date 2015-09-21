import java.util.Scanner;

public class Question_1 {
	static double tuition;
	static float increase;
	static int term;
	static float APR;
	static double second_year;
	static double third_year;
	static double fourth_year;
	static double cost;
	static double total;
	static int months;
	static double monthly_cost;
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the cost of tuition: ");
		double tuition = input.nextDouble();
		
		System.out.print("Enter the annual percentage increase for tuition: ");
		float increase = input.nextFloat();
		
		System.out.print("How many years do you plan to take to repay your loan?: ");
		int term = input.nextInt();
		
		System.out.print("What is the fixed APR for the loan(in decimal form)?: ");
		float APR = input.nextFloat();
		
		input.close();
		System.out.println(total);
		System.out.println(monthly_cost);
	}
		
	private static double sophomore(){
		double second_year = (tuition * increase)+ tuition;
		return second_year;
	}
		
	private static double junior(){
		double third_year = (second_year * increase) + second_year;
		return third_year;
	}
		
	private static double senior(){
		double fourth_year = (third_year * increase) + third_year;
		return fourth_year;
		
	}
	private static double cost(){
		double cost = tuition + sophomore() + junior() + senior();
		return cost;
	}
		
	private static double total(){
		double total = (cost * APR) + cost;
		return total;
		
	}
	private static double monthly_payment(){
		int months = term * 12;
		double monthly_cost = total / months;
		
		return monthly_cost;
		
		
	}
	
	
	
	

}
