// Calculate monthly payments of a fixed-term mortgage
//over given Nth terms at a given interest rate. 
//Also figure out how long it will take the user to pay back the loan. 
//For added complexity, add an option for users 
//to select the compounding interval (Monthly, Weekly, Daily, Continually).

import java.util.Scanner;

public class MortgageCalculator{
	public static void main(String[] args){

		System.out.println("   MORTGAGE CALCULATOR");
		System.out.println("-------------------------\n");
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Mortgage value($CAD): ");
		int mortgage = keyboard.nextInt();
		mortgage_check(mortgage);

		System.out.print("\nInterest rate(%): ");
		double int_rate = keyboard.nextDouble();
		int_rate_check(int_rate);

		System.out.print("\nTerms(years): ");
		int terms = keyboard.nextInt();
		terms_check(terms);

		System.out.println("\nCompounding Interval:");
		System.out.println("1. Monthly");
		System.out.println("2. Weekly");
		System.out.println("3. Daily");
		System.out.println("4. Continually");
		int interval = keyboard.nextInt();
		compound_select(interval)


	}

	public void mortgage_check(int mortgage){
		if (mortgage < 0){
			System.out.println("Too low. Invalid number.");
			mortgage = keyboard.nextInt();
		}
	}

	public void int_rate_check(double int_rate){
		if (int_rate < 0){
			System.out.println("Too low. Invalid number.");
			int_rate = keyboard.nextDouble();
		}
	}

	public void terms_check(int terms){
		if (terms < 0){
			System.out.println("Too low. Invalid number.");
			terms = keyboard.nextInt();
		}
	}

	public void monthly_payment(double payment){

	}

	public void pay_time(int pay_time){

	}

	public void compound_select(int interval){
		if (interval == 1){
		
		} 
		else if (interval == 2){

		}
		else if (interval == 3){

		}
		else if (interval == 4){

		}
		else{
			System.out.println("ERROR. Invalid selection.");
		}
	}
}