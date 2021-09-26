
package github_test;
class Accounting {
	/// 메소드
	public double vlaueOfSupply;
	public double vatRate;
	public double expenseRate;
	double vat = getVAT();
	double total = getTotal();
	double expense = getExpense();
	double income = getIncome();
	double dividend1 = getDividend1();
	double dividend2 = getDividend2();
	double dividend3 = getDividend3();
	public void print() {
		System.out.println("Value of supply : "+ vlaueOfSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	public double getDividend1() {
		return getIncome()*0.5;
	}
	
	public double getDividend2() {
		return getIncome()*0.3;
	}
	
	public double getDividend3() {
		return getIncome()*0.2;
	}

	public double getIncome() {
		return vlaueOfSupply - getExpense();
	}

	public double getExpense() {
		return vlaueOfSupply * expenseRate;
	}

	public double getTotal() {
		return vlaueOfSupply + getVAT();
	}

	public double getVAT() {
		return vlaueOfSupply*vatRate;
	}

}

public class AccountingClassApp {
	

	public static void main(String[] args) {

	// 인스턴스(instance)
		Accounting a1 = new Accounting();
		a1.vlaueOfSupply = 50000.0; 
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
	;
		
		Accounting a2 = new Accounting();
		a2.vlaueOfSupply = 20000.0; 
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
	}
}

	
